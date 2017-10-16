package hometask;

import java.util.Scanner;

public class Task7 {

	private static Scanner sc;

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, res;
		sc = new Scanner(System.in);
		System.out.print("Введите a: ");
		if (sc.hasNextFloat()) {
			a = sc.nextFloat();
		}
		System.out.print("Введите b: ");
		if (sc.hasNextFloat()) {
			b = sc.nextFloat();
		}
		if (a > b) {
			System.out.print("Введите c: ");
			if (sc.hasNextFloat()) {
				c = sc.nextFloat();
				res = b + c;
				System.out.print("Результат: " + res);
			}
		} else {
			if (a == b) {
				System.out.print("Конец");
			} else {
				if (a < b) {
					System.out.print("Введите c: ");
				}
				if (sc.hasNextFloat()) {
					c = sc.nextFloat();
					res = a + b + c;
					System.out.print("Новый год! " + res);
				}
			}
		}
	}
}