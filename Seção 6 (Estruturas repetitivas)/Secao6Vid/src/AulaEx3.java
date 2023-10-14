// Estrutura de repetição para (for)
// é uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores. 
// Se usa mais quando se sabe previamente a quantidade de repetições, ou o intervalo de valores. 

import java.util.Locale;
import java.util.Scanner;

public class AulaEx3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		// Problema exemplo

		System.out.print("Digite quantos números quer somar: ");
		int nVezes = entrada.nextInt();
		int soma1;
		int soma2 = 0;

		for (int i = 1; i <= nVezes; i++) {
			System.out.println("Entrada n° " + i);
			soma1 = entrada.nextInt();
			soma2 += soma1;
		}
		System.out.println("O resultado da soma é: " + soma2);
		entrada.close();
	}

}
