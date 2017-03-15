package pl.sages.zadanka.zad14;

public class Sternik {
    public static void main(String[] args) {
        Article article0 = new Article();
        Article article1 = new Article(1, "Test", 113.45, "Description");
        System.out.printf("Counter: %d",Article.counter);
    }
}
