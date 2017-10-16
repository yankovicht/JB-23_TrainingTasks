package hometask;

import java.util.Scanner;

public class Task1 {

	private static Scanner sc;

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, first, second;
		sc = new Scanner(System.in);
		System.out.print("Введите a: ");
		if (sc.hasNextFloat()) {
			a = sc.nextFloat();
		}
		System.out.print("Введите b: ");
		if (sc.hasNextFloat()) {
			b = sc.nextFloat();
		}
		if (a == b) {
			System.out.print("Cкоро Новый год!");
		} else {
			System.out.print("Введите c: ");
			if (sc.hasNextFloat()) {
				c = sc.nextFloat();
			}
			first = a + b + c;
			second = Math.pow(a, 2) + Math.pow(b, 2);
			System.out.print(first + "\n" + second + "\n" + "Моя любимая футбольная команда");
		}
	}
}
