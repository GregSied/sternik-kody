package pl.sages.zadanka.zad07;

public class Zadanie7 {
	
	public static void main(String[] args) {
		int[] table = {1, 2, 3, 4, 5, 6, 7};
		podzielne(table, 3);
	}
	
	public static void podzielne(int[] table, int number){
		for (int i = 0; i < table.length; i++) {
			if(table[i] % number == 0){
				System.out.println("Znalazlem liczbe: " + table[i] + ", na pozycji: " + i);
				break;
			}
		}
		
	}
}
