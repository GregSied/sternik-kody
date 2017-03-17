package pl.sages.teoria.classes;

public class Person implements Introducable{
	
	private String name;

	public Person(){}
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public void introduceMyself() {
		System.out.println("My name is  + name");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
}
