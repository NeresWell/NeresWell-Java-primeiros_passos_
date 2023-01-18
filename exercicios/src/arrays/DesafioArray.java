package arrays;

import java.util.Arrays;
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
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("digite a nota "+ (i+1) +": " );
			notas[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(double nota: notas) {
			soma += nota;
		}
//		for (int i = 0; i < notas.length; i++) {
//			soma += notas[i];
//		}
		
		System.out.println("Média: " + (soma / qtdNotas));
		System.out.println(Arrays.toString(notas));
		
		sc.close();
	}
}
