package pl.sages.zadanka.generyki;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<ShopItem> list = new ArrayList<>();
	
	void addItemToCart(ShopItem item){
		list.add(item);
	}
	
	ShopItem getItemFromCart(int idx){
		return list.get(idx);
	}
	
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addItemToCart(new Book());
		cart.addItemToCart(new Milk());
		Book itemFromCart = (Book) cart.getItemFromCart(0);
	}
	
}
