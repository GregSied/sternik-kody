package pl.sages.teoria.classes;

import java.util.ArrayList;
import java.util.List;

public class Cart<T extends VipPerson>{
	
	private List<T> items = new ArrayList<T>();

	public void addItem(T item) {
		items.add(item);
		T t = items.get(0);
	}

	public T getItem(int idx) {
		return items.get(idx);
	}
	
	public static void main(String[] args) {
		Cart<VipPerson> cart = new Cart<>();
		cart.addItem(new VipPerson());
		cart.addItem(new SuperPerson());

	}

}
