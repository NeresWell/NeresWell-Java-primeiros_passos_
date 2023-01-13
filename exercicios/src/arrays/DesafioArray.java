package arrays;

import java.util.Scanner;

public class DesafioArray {

	// informar quantas notas
	// armazenas as notas em um array
	// somar e fazer a média
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas notas vai informar? ");
		int qtdNotas = sc.nextInt();
		double[] notas = new double[qtdNotas];
		
		for (int i = 0; i < qtdNotas; i++) {
			System.out.print("digite a nota: " );
			notas[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < qtdNotas; i++) {
			System.out.print(notas[i] + " ");
		}
		
		sc.close();
	}
}
