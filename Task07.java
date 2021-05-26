package by.epam.unit03.main;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		String Roman, Arabic;
		System.out.print("Введите римскую цифру > ");
		Roman = sc.nextLine();
		System.out.println("Римская цифра = " + Roman);
		Roman = "D";
		switch (Roman) {
			case "I": Arabic = "1"; 
			break;
			case "V": Arabic = "5";
			break;
			case "X": Arabic = "10";
			break;		
			case "L": Arabic = "50"; 
			break;
			case "C": Arabic = "100";
			break;
			case "D": Arabic = "500";
			break;
			case "M": Arabic = "1000";
			break;
			default:  Arabic = "Неизвестное значение";
			break;
		}
		System.out.println("Арабская цифра = " + Arabic);
	}
}