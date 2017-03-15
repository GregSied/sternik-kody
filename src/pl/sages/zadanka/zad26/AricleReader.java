package pl.sages.zadanka.zad26;

public class AricleReader {

	public static void main(String[] args) {
		String data1 = "1:Milk:A box of milk:2.50";
		String data2 = "1:Fruit:Apple:3.50";
		try {
			Article article = new Article(data1);
			System.out.println(article.toString());
			
			Article article2 = new Article(data2);
			System.out.println(article2.toString());
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
