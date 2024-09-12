package desafio.target.code;

import java.util.Scanner;

public class QuestaoDoisStringVerify {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma string: ");
		String input = scanner.nextLine();

		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c == 'a' || c == 'A') {
				count++;
			}
		}

		if (count > 0) {
			System.out.println("A letra 'a' aparece " + count + " vezes.");
		} else {
			System.out.println("A letra 'a' não aparece na string.");
		}

		scanner.close();
	}
}