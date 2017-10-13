package hometask;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		float a = 0, b = 0;
		double s, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите первый катет: ");
		if (sc.hasNextFloat()) {
			a = sc.nextFloat();
			System.out.print("Введите второй катет: ");
			if (sc.hasNextFloat()) {
				b = sc.nextFloat();
			}
			c = Math.sqrt(a * a + b * b);
			s = 0.5 * a * b;
			System.out.print("Гипотенуза: " + c + "\nПлощадь: " + s);
		}
	}
}
