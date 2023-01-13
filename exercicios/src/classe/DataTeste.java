package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(1,1,2023);
		
		Data d2 = new Data();
		d2.ano = 2021;
		
		String dataFormatada2 = d2.obterDataFormatada();
		
		System.out.println(dataFormatada2);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
