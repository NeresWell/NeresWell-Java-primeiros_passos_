package controle;

import java.util.Scanner;

public class PrimoSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int numero = sc.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contador++;
			}
		}
		
		switch(contador) {
		case 0:
			System.out.println("é primo");
			break;
		default:
			System.out.println("não é primo");
			break;
		}
		
		sc.close();
	}
}
