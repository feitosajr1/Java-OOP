//Para concatenar vários elementos em um mesmo comando de escrita

public class Exe4Aula {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		//interpolado dentro de uma String 
	}

} 