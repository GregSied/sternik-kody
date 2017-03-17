package pl.sages.zadanka.generyki;

import java.util.ArrayList;
import java.util.List;

public class Cart2<T extends ShopItem> {

	List<T> list = new ArrayList<>();

	void addItemToCart(T item) {
		list.add(item);
	}

	public static void main(String[] args) {
		Cart2<Book> cart = new Cart2<>();
		cart.addItemToCart(new Book());
		//cart.addItemToCart(new ShopItem());
		//cart.addItemToCart(new Milk());
	}

}
