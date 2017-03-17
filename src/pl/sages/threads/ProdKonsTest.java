package pl.sages.threads;

public class ProdKonsTest 
{
	public static void main(String[] args) throws Exception
	{
		Pudelko c = new Pudelko();
		Producent p1 = new Producent(c, 1);
		Konsument c1 = new Konsument(c, 1);
		p1.start();
		c1.start();
		pauza(); 
	}
	static void pauza() throws java.io.IOException
	{
		System.out.println("Nacisnij Enter...");
		System.in.read();
	}
}
