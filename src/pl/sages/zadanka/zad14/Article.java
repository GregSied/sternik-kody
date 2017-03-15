package pl.sages.zadanka.zad14;

public class Article {
    public static int counter;
    public int id;
    public String name;
    public double price;
    public String description;

    public Article() {
        counter++;
    }

    public Article(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        counter++;
    }
}
