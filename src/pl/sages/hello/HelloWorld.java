package pl.sages.hello;

public class HelloWorld {

	public static void main(String[] args) {
		int zmienna = 1;
		String sss = new String();
		
		int[] table = {1, 2, 3, 4};
		for (int i : table) {
			System.out.println(i);
			if(i == 1){
				System.out.println("JEDEN");
			}
		}
		System.out.println("Hello World");
	}
}
