package by.epam.unit03.main;

public class Task05 {

	public static void main(String[] args) {

		double a, b, h, x, y;

		a = -10 + (int)(Math.random() * (10 - (-10) + 1));
		b = -10 + (int)(Math.random() * (10 - (-10) + 1));
		h = 0.1;
		
		if (a > b) {
			double reverse;
			reverse = b;
			b = a;
			a = reverse;
		}

		System.out.println("a = " + a + ", b = " + b + ", h = " + h);
		System.out.println("---------------------------------");
		System.out.printf("|\t%5s\t|\t%7s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		for (x = a; x <= b; x = x + h) {
			y = 2 * Math.tan(x / 2) + 1;
			System.out.printf("|\t%5.2f\t|\t%7.3f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
	}
}
