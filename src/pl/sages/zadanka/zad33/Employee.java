package pl.sages.zadanka.zad33;

public class Employee extends Person {

	private int pracownikId;

	public Employee(){}
	
	public Employee(String name, String surname, int age, int pracownikId){
		super(name, surname, age);
		this.pracownikId = pracownikId;
	}
	
	public Employee(int pracownikId) {
		this.pracownikId = pracownikId;
	}

	public int getPracownikId() {
		return pracownikId;
	}

	public void setPracownikId(int pracownikId) {
		this.pracownikId = pracownikId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pracownikId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (pracownikId != other.pracownikId)
			return false;
		return true;
	}
	
	
	
}
