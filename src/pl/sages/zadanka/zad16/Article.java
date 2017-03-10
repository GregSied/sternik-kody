package pl.sages.zadanka.zad16;

public class Article {
	
	public static int counter = 0;
	
	private int identyfikatorLiczbowy;
	private String nazwa;
	private String opis;
	
	public Article() {
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
	}

	public String getNaz() {
		return nazwa;
	}

	public void setNaz(String naz) {
		this.nazwa = naz;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	@Override
	public String toString() {
		return "Article [identyfikatorLiczbowy=" + identyfikatorLiczbowy + ", nazwa=" + nazwa + ", opis=" + opis + "]";
	}

	public static void main(String[] args) {
		Article article = new Article(10, "Ogorek", "cos tam");
		System.out.println(article.toString());
		
		Article article2 = new Article();
		
		System.out.println("Counter: " + Article.counter);
	}
	
}
