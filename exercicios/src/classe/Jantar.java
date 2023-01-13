package classe;

public class Jantar {

	public static void main(String[] args) {
				
		Comida c1 = new Comida("Arroz",0.5);
		Comida c2 = new Comida("Feijão",0.7);
		
		Pessoa p = new Pessoa("Fulano", 50.0);
//		p1.nome = "Fulano";
//		p1.peso = 50.0;
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
	}
}
