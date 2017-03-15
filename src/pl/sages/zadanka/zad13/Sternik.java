package pl.sages.zadanka.zad13;

/**
 * Created by sebastiankoziel on 10/03/2017.
 */
public class Sternik {
    public static void main(String[] args) {
        Article article = new Article(1, "Test", 113.45, "Description");
        System.out.printf("Article\nid: %d\nname: %s\nprice: %.2f\ndescription: %s", article.id, article.name, article.price, article.description);
    }
}
