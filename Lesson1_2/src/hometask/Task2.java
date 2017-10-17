package hometask;

import java.util.Scanner;

public class Task2 {
	private static Scanner sc;

	public static void main(String[] args) {
		int n = 0, k = 0, tr = 0, mod = 0;
		System.out.print("Введите количество чисел: ");
		sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Введите целое число: ");
			if (sc.hasNextInt()) {
				array[i] = sc.nextInt();
				if (array[i] % 2 == 0) {
					k++;
				}
				if (array[i] % 3 == 0) {
					tr++;
				}
				if (Math.abs(array[i]) < 3) {
					mod++;
				}
			}
		}
		System.out.println("\nЧётных " + k + ", кратных трём " + tr + ", меньше трёх по модулю " + mod);
	}
}
