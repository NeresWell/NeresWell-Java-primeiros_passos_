package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int base = sc.nextInt();
		int altura = sc.nextInt();
		
		int area = (base * altura)/2;
		System.out.printf("área: %d", area);
		
		sc.close();
	}
}
