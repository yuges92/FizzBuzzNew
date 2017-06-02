package uk.co.yuges;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0 || String.valueOf(i).contains("3")) {
				System.out.println("Fizz");
			} else if (i % 5 == 0 || String.valueOf(i).contains("5")) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
