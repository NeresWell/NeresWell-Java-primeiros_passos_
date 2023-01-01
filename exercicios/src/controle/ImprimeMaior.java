package controle;

import java.util.Scanner;

public class ImprimeMaior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maiorValor = 0;
		int tentativas = 0;

		do {
			int num = sc.nextInt();

			if (num > maiorValor) {
				maiorValor = num;
			}

			tentativas++;
		} while (tentativas < 10);

		System.out.println("maior: " + maiorValor);
		sc.close();
	}
}
