package pl.sages.teoria;

import java.util.ArrayList;
import java.util.List;

import pl.sages.teoria.classes.Person;
import pl.sages.teoria.classes.SuperPerson;
import pl.sages.teoria.classes.VipPerson;


/**
 * Warte przeczytania:
 * https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html  + rozdzały kolejne
 * http://www.angelikalanger.com/GenericsFAQ/FAQSections/TypeArguments.html#Topic2
 * @author acacko
 *
 */
public class KolekcjeGeneryki {

	static void addPersonToList(List<Person> list) {
		list.add(new Person("Arek")); 			// ok
		list.add(new VipPerson("Arek", 1)); 	// ok
	}

	static void addAnyToList(List list) {
		list.add(new Person("Arek")); 			// ok
		list.add(new VipPerson("Arek", 1)); 	// ok
		list.add(new Integer(1)); 				// ok :)
	}

	static void printList(List list) { // dowolna lista
		System.out.println(list.toString());
	}

	void printFromList(List<? extends Person> list) {
		Person person = list.get(0);
		System.out.println(person);
	}

	void addPersonToList2(List<? extends Person> list) {
		//list.add(new Person("Arek")); 		// błąd bo nie wiadomo czy to lista
										 		// VipPerson, Person, czy jakaś inna klasa dziedzicząca po Person :)
		// list.add(new VipPerson("Arek", 1)); 	// też błąd
	}

	void addPersonToList3(List<? super VipPerson> list) {
		//list.add(new Person("Arek")); 		// błąd. Co jeśli jest to List<VipPerson>? Wtedy nie można dodać Person
		list.add(new VipPerson("Arek", 1)); 	// ok
		list.add(new SuperPerson("Arek")); 		// ok
		//list.add(new Object()); 				// błąd
		Object object = list.get(0); 			// typu Object. Nie wiemy jakiego typu jest
												// obiekt w liście. Może VipPerson, może
												// Person... kto wie!?
	}

	void addPersonToList4(List<? super Person> list) {
		list.add(new Person("Arek")); 			// ok
		list.add(new VipPerson("Arek", 1)); 	// ok

		Object object = list.get(0); 			// tylko object, bo w sumie nie wiadomo jakiego jest typu
	}

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		addPersonToList(list);
		printList(list);

		// sposoby deklaracji
		List<Person> peopleList = new ArrayList<>(); 			// ok
		List<Person> list3 = new ArrayList<Person>(); 			// ok
		// List<Person> list2 = new ArrayList<VipPerson>(); 	// błąd

		addAnyToList(peopleList); // ok :)
		printList(peopleList);

		List<VipPerson> vipList = new ArrayList<>(); 			// ok
		// addPersonToList(vipList); 							// błąd (nie każdy Person jest VipPerson)
		
		
		List<SuperPerson> superList = new ArrayList<>(); 		// ok
		copy(superList, peopleList);

	}

	// Skoro już wszystko wiemy no to podsumowanie wszystkiego:
	public static void copy(List<? extends VipPerson> src, List<? super VipPerson> dest) {
		for (int i = 0; i < src.size(); i++)
			dest.add(src.get(i));
	}
	
	

}
