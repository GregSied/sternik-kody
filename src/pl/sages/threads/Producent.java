package pl.sages.threads;

public class Producent extends Thread 
{
	private Pudelko pudelko;
 	private int m_nLiczba;
 	public Producent(Pudelko c, int liczba) 
	{
  		pudelko = c;
  		this.m_nLiczba = liczba;
	}
	public void run() 
	{
		for (int i = 0; i < 10; i++) 
		{
			pudelko.wloz(i);
			System.out.println("Producent #" + this.m_nLiczba + " wlozyl: " + i);
			try 
			{
				sleep((int)(Math.random() * 100));
			} 
			catch (InterruptedException e) {  }
		}
	}
}
