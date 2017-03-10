package pl.sages.zadanka;

import java.util.Arrays;

public class Zadanie9 {

	public static void main(String[] args) {
		
		int[] table = { 1, 2, 3, 4, 5, 6 };
		flip(table, 1, 2);
		System.out.println(Arrays.toString(table));
		
	}
	
	public static void flip(int[] table, int pos1, int pos2){
		
		int tmp = table[pos1];
		table[pos1] = table[pos2];
		table[pos2] = tmp;
		
	}

}
