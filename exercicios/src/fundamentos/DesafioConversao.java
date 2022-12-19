package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// scanner
		// 3 strings usando next line
		// calcular a media dos ultimos 3 salários
		// funcionar com ponto e virgula
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner sc = new Scanner(System.in);
		
		String salario1 = sc.nextLine().replace(",", ".");
		String salario2 = sc.nextLine().replace(",", ".");
		String salario3 = sc.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
		double numero3 = Double.parseDouble(salario3);
		
		double media = (numero1 + numero2 + numero3) / 3;
		System.out.println("Média é: " + media);
		
		sc.close();
	}
}
