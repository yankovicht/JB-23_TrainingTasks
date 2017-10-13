package hometask;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, d = 0, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите с клавиатуры 4 слагаемых: ");
		if (sc.hasNextFloat()) {
			a = sc.nextFloat();
		}
		if (sc.hasNextFloat()) {
			b = sc.nextFloat();
		}
		if (sc.hasNextFloat()) {
			c = sc.nextFloat();
		}
		if (sc.hasNextFloat()) {
			d = sc.nextFloat();
		}
		sum = a + b + c + d;
		System.out.println("Полученная сумма: " + sum);
	}
}
