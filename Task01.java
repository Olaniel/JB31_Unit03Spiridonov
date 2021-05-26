package by.epam.unit03.main;

public class Task01 {

	public static void main(String[] args) {
		double a, b;

		System.out.println("---------------------------------");
		System.out.printf("|\t%2s\t|\t%2s\t|\n", "a", "b");
		System.out.println("---------------------------------");
		for(a = 1; a < 11; a++) {
			b = a * 3;
			System.out.printf("|\t%2.0f\t|\t%2.0f\t|\n", a, b);
		}
		System.out.println("---------------------------------");
	}
}
