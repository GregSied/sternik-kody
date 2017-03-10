package pl.sages.zadanka;

public class Zadanie6 {

	public static void main(String[] args) {

		int[][] value = { { 3, 8, 16 }, { 1, 22, 28, 24 }, { 3 }, { 41, 42 } };

		label: System.out.println("na FOREACH:");
		for (int[] table : value) {
			for (int number : table) {
				System.out.print(number + ", ");
			}
			System.out.println();
		}

		System.out.println("\nna FOR:");
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value[i].length; j++) {
				System.out.print(value[i][j] + ", ");
			}
			System.out.println();
		}

		String imie = "   Arek    ";
		String trimedString = imie.trim();

		System.out.println(trimedString + "," + imie + "");

		int ii = 2;

		Integer i1 = ii;
		Integer i2 = new Integer(1);
		Integer i3 = Integer.valueOf(ii);

		String nazwa = null;

		if (ii == 1) {
			nazwa = "AREK";
		}

		System.out.println("\nna FOR:");

		if (ii == 1 && nazwa.endsWith("EK")) {
			System.out.println("DZIAŁAM!!");
		} else {
			System.out.println("DZIAŁAM2222!!");
		}

		if (printArg(false) && printArg(true)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		int i = 8, j = 2;
		
		String kon = (i < 2) ? "Łysek" : (i < 7) ? "Łysek2" : "Bucefał";
		System.out.println("KOŃ: " + kon);
		
		
		

	}

	private Integer znajdzLiczbe(int[][] value, int findValue) {
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value[i].length; j++) {
				if (value[i][j] == findValue) {
					return value[i][j];
				}
			}
			System.out.println();
		}

		return null;

	}

	static boolean printArg(boolean arg) {
		System.out.println("Arg: " + arg);
		return arg;
	}

}
