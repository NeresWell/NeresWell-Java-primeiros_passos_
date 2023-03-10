package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		// Alt + SETA - move linha de código
		
		Scanner sc = new Scanner(System.in);
				
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		System.out.print("Digite a temperatura em F°: ");
		double fahrenheit = sc.nextDouble();
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celsius + "°C.");
		
		sc.close();
	}
}
