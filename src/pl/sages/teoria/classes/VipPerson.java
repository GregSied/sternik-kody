package pl.sages.teoria.classes;

public class VipPerson extends Person {
	
	private int cartId;

	public VipPerson(){}
	
	public VipPerson(String name){
		super(name);
	}
	
	public VipPerson(String name, int cartId) {
		super(name);
		this.cartId = cartId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	@Override
	public String toString() {
		return "VipPerson [" + super.toString() + " cartId=" + cartId + "]";
	}
	
	
	
}
