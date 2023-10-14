/*
 Outra forma de fazer o if else 
 */

import java.util.Locale;
import java.util.Scanner;

public class ExerFixacao4 {

	public static void main(String[] args) {
		
		/*
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
		desconto = preco * 0.1;
		System.out.printf("O desconto é de: R$%.2f.%n", desconto );
		}
		else {
		desconto = preco * 0.05;
		System.out.printf("O desconto é de: R$%.2f.%n", desconto );
		}
		*/
		
		// Outra forma de escrever a estrutura a cima. 
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o preço do produto");
		double preco = entrada.nextDouble();
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.printf("O desconto é de: R$%.2f.%n", desconto );

	}

}
