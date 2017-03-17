package pl.sages.threads;

public class Pudelko 
{
	private int m_nZawartosc;   // to jest znienna warunkowa
	// do której dostęp synchronizujemy, (omówione później)
	private boolean m_bDostepne = false;
	public synchronized int wez() 
	{
		while (m_bDostepne == false) 
		{
			try 
			{	wait(); } 
			catch (InterruptedException e) { }
		}
		m_bDostepne = false;
		notifyAll();
		return m_nZawartosc;
	}
	public synchronized void wloz(int wartosc) 
	{
		while (m_bDostepne == true) 
		{
			try 
			{ wait();	} 
			catch (InterruptedException e) { }
		}
		m_nZawartosc = wartosc;
		m_bDostepne = true;
		notifyAll();
	}
}
