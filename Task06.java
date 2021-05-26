package by.epam.unit03.main;

public class Task06 {

	public static void main(String[] args) {
		int x, y, a, b;
		x = 1000 + (int)(Math.random() * (9999 - 1000 + 1));
		y = 1000 + (int)(Math.random() * (9999 - 1000 + 1));
		System.out.println("x = " + x + ", y = " + y);
		
		while (x > 0) {
			b = x % 10;
			x = x / 10;
			a = y;
			while (a > 0) {
				if (a % 10 == b) {
					System.out.println("Совпадающие цифры: " + b);
				}
				a = a / 10;
			}
		}
	}
}
