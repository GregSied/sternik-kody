package pl.sages.threads.ececutors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static class WordLengthCallable implements Callable<Pair<String, Integer>> {

		private String word;

		public WordLengthCallable(String word) {
			this.word = word;
		}

		public Pair<String, Integer> call() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			return Pair.of(word, Integer.valueOf(word.length()));
		}
	}

	public static void main(String args[]) throws Exception {
		
		List<String> asList = Arrays.asList("Arek", "Cacko", "aaaaaaaa");
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		List<Future<Pair<String, Integer>>> list = new ArrayList<>();
		
		System.out.printf("Start obliczeń\n");
		for (String word : asList) {
			Callable<Pair<String, Integer>> callable = new WordLengthCallable(word);
			Future<Pair<String, Integer>> future = pool.submit(callable);
			list.add(future);
		}
		
		int sum = 0;
		
		for (Future<Pair<String, Integer>> future : list) {
			sum += future.get().getRight();
		}
		System.out.printf("The sum of lengths is %s%n", sum);
		System.exit(sum);
	}
}
