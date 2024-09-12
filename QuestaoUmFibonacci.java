package desafio.target.code;

import java.util.Scanner;

public class QuestaoUmFibonacci {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = scanner.nextInt();

		if (isFibonacci(num)) {
			System.out.println(num + " pertence à sequência de QuestaoUmFibonacci.");
		} else {
			System.out.println(num + " não pertence à sequência de QuestaoUmFibonacci.");
		}
	}

	public static boolean isFibonacci(int num) {
		int a = 0, b = 1;
		if (num == a || num == b) {
			return true;
		}
		int next = a + b;
		while (next <= num) {
			if (next == num) {
				return true;
			}
			a = b;
			b = next;
			next = a + b;
		}
		return false;
	}
}