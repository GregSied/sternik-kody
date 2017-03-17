package pl.sages.zadanka.zad33;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.sages.zadanka.zad26.Article;;

public class Shop {
	
	List<Employee> employeeList = new ArrayList<>();
	Map<Article, Integer> productNumber = new HashMap<>();
	
	public boolean hasEmployee(Employee employee){
		return employeeList.contains(employee);
	}
	
	public void addEmployee(Employee employee){
		employeeList.add(employee);
	}
	
	public void addArticle(Article article){
		boolean containsKey = productNumber.containsKey(article);
		if(containsKey){
			Integer integer = productNumber.get(article);
			//integer.increment(); // nie da si� bo immutable
			productNumber.put(article, (integer + 1));
		} else {
			productNumber.put(article, 1);
		}
	}
	
	public Integer getArticleQuantity(Article article){
		Integer integer = productNumber.get(article);
		if(integer == null){
			return 0;
		} else {
			return integer;
		}
	}
	
	public Collection<Employee> getSortedEmployees(){
		Collections.sort(employeeList);
		return Collections.unmodifiableCollection(employeeList);
	}
	
	public List<Employee> getSortedEmployeesById(){
		Collections.sort(employeeList, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Employee a1 = (Employee)o1;
				Employee a2 = (Employee)o2;
				
				return a1.getPracownikId().compareTo(a2.getPracownikId());
			}
		});
		
		return employeeList;
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.addEmployee(new Employee("Filip", "Zaradny", 20, 21));
		shop.addEmployee(new Employee("Arek", "Cacko", 28, 20));
		
		Employee filipClone = new Employee("Filip", "Cacko", 20, 21);
		System.out.println("shop.hasEmployee=" + shop.hasEmployee(filipClone));
		Collection<Employee> sortedEmployees = shop.getSortedEmployees();
		System.out.println("getSortedEmployees=" + sortedEmployees);
		//sortedEmployees.add(new Employee("Bart�omiej", "Misiewicz", 20, 21));
		System.out.println("getSortedEmployeesById=" + shop.getSortedEmployeesById());

		Article apple = new Article(1, "Apple", "Gala");
		shop.addArticle(apple);
		shop.addArticle(new Article(1, "Apple", "Gala"));
		
		System.out.println("shop.getArticleQuantity(apple)=" 
							+ shop.getArticleQuantity(apple));
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("Arek", "Cacko", 28));
		list.add(new Person("Filip", "Komorowski", 40));
		list.add(new Person("Bartek", "Misiewicz", 23));
		list.add(new Person("Marek", "Kaczy�ski", 60));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
	
}
