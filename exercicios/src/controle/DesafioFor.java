package controle;

import java.util.Scanner;

public class DesafioFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double entrada = sc.nextDouble();
//		double conv = ((entrada - 32) * 5) /9;
		double conv = ((entrada * 9) / 5)+32;
		
		System.out.printf("C: %.1f", conv);
		sc.close();
		
//		String valor = "#";
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
//		
//		for(String v = "#"; !v.equals("######"); v+="#") {
//			System.out.println(v);
//		}
	}
}
