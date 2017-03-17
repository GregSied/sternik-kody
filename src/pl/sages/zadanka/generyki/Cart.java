package pl.sages.zadanka.generyki;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<ShopItem> list = new ArrayList<>();
	
	void addItemToCart(ShopItem item){
		list.add(item);
	}
	
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addItemToCart(new Book());
	}
	
}
