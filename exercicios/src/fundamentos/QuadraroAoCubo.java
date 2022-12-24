package fundamentos;

import java.util.Scanner;

public class QuadraroAoCubo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		double quadrado = Math.pow(num1, 2);
		double cubo = Math.pow(num2, 3);
		
		System.out.printf("n²: %.2f%n", quadrado);
		System.out.printf("n³: %.2f", cubo);
		
		sc.close();
	}
}
