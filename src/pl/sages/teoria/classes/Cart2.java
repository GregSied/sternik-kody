package pl.sages.teoria.classes;

import java.util.ArrayList;
import java.util.List;

public class Cart2<VipPerson>  {
	
	private List<VipPerson> items = new ArrayList<>();

	public void addItem(VipPerson item) {
		items.add(item);
	}

	public VipPerson getItem(int idx) {
		return items.get(idx);
	}
	
	public static void main(String[] args) {
		Cart2 cart2 = new Cart2();
		cart2.addItem(new SuperPerson());
		cart2.addItem(new String());

	}

}
