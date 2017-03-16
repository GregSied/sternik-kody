package pl.sages.zadanka.zad33;

import java.util.ArrayList;
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
			//integer.increment(); // nie da siê bo immutable
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
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.addEmployee(new Employee("Arek", "Cacko", 28, 20));
		shop.addEmployee(new Employee("Filip", "Cacko", 20, 21));
		
		Employee filipClone = new Employee("Filip", "Cacko", 20, 21);
		System.out.println("shop.hasEmployee=" + shop.hasEmployee(filipClone));
		
		Article apple = new Article(1, "Apple", "Gala");
		shop.addArticle(apple);
		shop.addArticle(new Article(1, "Apple", "Gala"));
		
		System.out.println("shop.getArticleQuantity(apple)=" 
							+ shop.getArticleQuantity(apple));
	}
	
}
