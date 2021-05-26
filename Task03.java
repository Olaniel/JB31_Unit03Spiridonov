package by.epam.unit03.main;

public class Task03 {

	public static void main(String[] args) {
		double x, s, p;

		x = 1;
		s = 1;
		p = 1;

		System.out.println("---------------------------------------------------------");
		System.out.printf("|\t%2s\t|\t%2s\t|\t%13s\t|\n", "x", "s", "p");
		System.out.println("---------------------------------------------------------");

		for(double i = 1; i < 11; i++) {
			x++;
			s = s + x;
			p = s * p;
			System.out.printf("|\t%2.0f\t|\t%2.0f\t|\t%13.0f\t|\n", x, s, p);
		}
		System.out.println("---------------------------------------------------------");
		System.out.printf("Result = %13.0f", p);
	}
}
