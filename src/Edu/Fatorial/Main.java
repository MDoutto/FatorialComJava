package Edu.Fatorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o número que deseja realizar o fatorial: ");
		int n = scanner.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		
		System.out.println("O fatorial de: " + n + " é " + fatorial);
		
		scanner.close();
	}

}
