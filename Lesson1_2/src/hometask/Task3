package hometask;

import java.util.Scanner;

public class Task3 {
	private static Scanner sc;

	public static void main(String[] args) {
		int n = 0, k = 0, l = 0;
		System.out.print("Введите количество чисел: ");
		sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		float[] arrayFloat = new float[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Введите вещественное число: ");
			if (sc.hasNextFloat()) {
				arrayFloat[i] = sc.nextFloat() - sc.nextFloat()%1;
				System.out.println(arrayFloat[i]);
				if (arrayFloat[i] % 2 == 0) {
					k++;
				}
				if (arrayFloat[i] > 15) {
					l++;
				}
			}
		}
		System.out.println("Чётных " + k + "больше пятнадцати " + l);
	}
}
