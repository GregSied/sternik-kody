package pl.sages.zadanka.zad26;

import java.util.ArrayList;
import java.util.List;

public class Article {
	
	public static List<Integer> ids = new ArrayList<>();
	
	public static int counter = 0;
	
	private int identyfikatorLiczbowy;
	private String nazwa;
	private String opis;
	private double cena;
	
	public Article(String data) throws IllegalStateException {
		init(data);
		increment();
	}

	private void init(String data) throws IllegalStateException {
		String[] split = data.split(":");
		if(split.length != 4){
			throw new BadDataException("B³êdne dane w ciagu: " + data);
		}
		
		try{
			this.identyfikatorLiczbowy = Integer.parseInt(split[0]);
			this.nazwa = split[1];
			this.opis = split[2];
			this.cena = Double.parseDouble(split[3]);
					
			
		} catch (Exception e) {
			throw new BadDataException("B³¹d parsowania danych liczbowych");
		}
		
		if(ids.contains(this.identyfikatorLiczbowy)){
			throw new IllegalStateException("Ju¿ istnieje takie ID produktu");
		}
		
		ids.add(this.identyfikatorLiczbowy);
	}
	
	private void increment() {
		counter++;
	}

	public Article(int identyfikatorLiczbowy, String naz, String opis) {
		this.identyfikatorLiczbowy = identyfikatorLiczbowy;
		this.nazwa = naz;
		this.opis = opis;
		counter++;
	}

	public int getIdentyfikatorLiczbowy() {
		return identyfikatorLiczbowy;
	}

	public void setIdentyfikatorLiczbowy(int identyfikatorLiczbowy) {
		this.identyfikatorLiczbowy = identyfikatorLiczbowy;
		printChange();
	}

	public String getNaz() {
		return nazwa;
	}

	public void setNaz(String naz) {
		this.nazwa = naz;
		printChange();
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
		printChange();
	}
	
	private void printChange(){
		System.out.println("Zmieniono wartoÅ›Ä‡ pola");
	}
	
	@Override
	public String toString() {
		return "Article [identyfikatorLiczbowy=" + identyfikatorLiczbowy + ", nazwa=" + nazwa + ", opis=" + opis + "]";
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
}
