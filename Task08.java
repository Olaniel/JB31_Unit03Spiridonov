package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		double x, y, z = 0;
		String sign;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("X > ");
			if (sc.hasNext("#")) {
				System.out.print("Выполнение завершено.");
				break;
			}			
			while (!sc.hasNextDouble()) {
				System.out.print("X > ");
				sc.nextLine();
			}
			x = sc.nextDouble();
			System.out.print("Y > ");
			if (sc.hasNext("#")) {
				System.out.print("Выполнение завершено.");
				break;
			}
			while (!sc.hasNextDouble()) {
				System.out.print("Y > ");
				sc.nextLine();
			}
			y = sc.nextDouble();
			System.out.print("Знак операции > ");
			if (sc.hasNext("#"))  {
				System.out.print("Выполнение завершено.");
				break;
			}
			sign = sc.next();
			switch (sign) {
			case "+": z = x + y;
				break;
			case "-": z = x - y;
				break;
			case "*": z = x * y;
				break;
			case "/": if (y == 0) {
				System.out.println("Внимание! Деление на 0!");
				}
				else {
					z = x / y;
				}
			 	break;
			default : System.out.println("Неизвестный знак");
				break;
			}
		System.out.println("Z = " + z);
		} 
 	}
}