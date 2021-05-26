package by.epam.unit03.main;

public class Task02 {

	public static void main(String[] args) {
		double x, sum;

		x = 1;
		sum = 0;

		System.out.println("---------------------------------");
		System.out.printf("|\t%2s\t|\t%4s\t|\n", "x", "sum");
		System.out.println("---------------------------------");

		while (x < 100) {
			sum = x + sum;
			System.out.printf("|\t%2.0f\t|\t%4.0f\t|\n", x, sum);
			x = x + 2;
		}
		System.out.println("---------------------------------");
	}
}
