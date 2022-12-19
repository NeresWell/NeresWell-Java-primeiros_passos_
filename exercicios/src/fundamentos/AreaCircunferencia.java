package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		// Não muda valor se reatribuida
		final double pi = 3.14159;
		
		double area = pi * raio *raio;
		
		raio = 10;
		area = pi * raio * raio;
		
		System.out.println("Área = " + area);
	}
}
