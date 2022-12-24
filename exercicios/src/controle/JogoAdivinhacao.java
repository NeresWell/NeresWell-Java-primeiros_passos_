package controle;

import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int numero = 10;
		
		do {
			int chute = sc.nextInt();
			if(chute == numero) {
				System.out.println("acertou");
			} else {
				System.out.println("errou, tente de novo");				
			}
			contador++;
		} while (contador <= 9);
		
		System.out.println("não conseguiu");
		
		sc.close();
	}
}
