package pl.sages.zadanka.zad11;

import java.awt.print.Book;

public class Zadanie11 {
	
	public static void main(String[] args) {
		
		new Book();
		
		getZapowienieType(Zamowienie.NOWE);
		
		for(Zamowienie zamowienie: Zamowienie.values()){
			getZapowienieType(zamowienie);
		}
		
		Zamowienie aaa = Zamowienie.NOWE;
		Zamowienie bbb = Zamowienie.NOWE;
		if(aaa == bbb){
			System.out.println("EQUALS");
		}
		
		
	}
	
	public static void getZapowienieType(Zamowienie zamowienie){
		switch (zamowienie) {
		case NOWE:
			System.out.println("nowe zamowienie");
			break;
		case OCZEKUJACE:
			System.out.println("nowe OCZEKUJACE");
			break;

		default:
			System.out.println("inne");
		}
	}

}

