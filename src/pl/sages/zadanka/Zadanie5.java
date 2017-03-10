package pl.sages.zadanka;

public class Zadanie5 {
	
	public static void main(String[] args) {
		
		// tablica
		String[] table = new String[10];

		// inicjacja tablicy wartościami
		for (int i = 0; i < table.length; i++) {
			table[i] = "Liczba " + Integer.toString(i);
		}
		
		// ===== DRUKOWANIE : ======
		
		
		// for
		System.out.println("ZA pomocą FOR");
		for (int i = 0; i < table.length; i++) {
			System.out.println(table[i]);
		}
		
		// foreach
		System.out.println("ZA pomocą FOREACH");
		for (String napis : table) {
			System.out.println(napis);
		}
		
		// while
		System.out.println("ZA pomocą WHILE");
		int i = 0;
		while(i < table.length){
			System.out.println(table[i++]);
		}
		
		
	}

}
