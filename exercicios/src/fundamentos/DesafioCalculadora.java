package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// ler num1
		// ler num2
		// + - * / %

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String operacao = sc.next();
		
		double resultado = operacao.equals("+") ? num1 + num2 : 0;
		resultado = operacao.equals("-") ? num1 - num2 : resultado;
		resultado = operacao.equals("*") ? num1 * num2 : resultado;
		resultado = operacao.equals("/") ? num1 / num2 : resultado;
		resultado = operacao.equals("%") ? num1 % num2 : resultado;
		
		System.out.println(resultado);
		
		sc.close();
	}
}
