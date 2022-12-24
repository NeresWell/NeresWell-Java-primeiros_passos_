package controle;

import java.util.Scanner;

public class PrimoIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int numero = sc.nextInt();
		
		for(int i = 2; i < numero; i++){
			if(numero % i == 0) {
				contador++;
			}
		}
		
		if (contador == 0) {
			System.out.printf("%d é primo", numero);
		} else {
			System.out.printf("%d não é primo", numero);
		}
		
		sc.close();
	}
}
