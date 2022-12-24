package controle;

import java.util.Scanner;

public class Par0e10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num >=0 && num <=10) {
			System.out.println("está entre 0 e 10");
			if (num%2 ==0) {
				System.out.println("é par!");
			} else {
				System.out.println("não é par");
			}
		} else {
			System.out.println("não está entre 0 e 10");
		}
		
		sc.close();
	}
}
