package hometask;

import java.util.Scanner;

public class Task6 {

	private static Scanner sc;

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, res;
		sc = new Scanner(System.in);
		System.out.print("Введите a: ");
		if (sc.hasNextFloat()) {
			a = sc.nextFloat();}
			System.out.print("Введите b: ");
			if (sc.hasNextFloat()) {
				b = sc.nextFloat();
			}
			System.out.print("Введите c: ");
			if (sc.hasNextFloat()) {
				c = sc.nextFloat();
			}
			res = Math.pow(a,2)-Math.pow(b-c, 2)+Math.log((Math.pow(b,2)+1));
			System.out.print("Результат выражения: " + res);
		}
	}

