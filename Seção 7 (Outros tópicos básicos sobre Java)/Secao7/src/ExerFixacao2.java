
/*
	 * Operadores bitwise (operadores bit a bit). Ao usar esse operador o programa faz uma comparação de bit a bit da informação. usando os operadores lógicos. 
	 * Exemplo: 89 = 0101 1001   ->   60 = 0011 1100
	 * 89 & 60 = 0001 1000(24)(AND / E)
	 * 89 | 60 = 0111 1101(125) (OR  / OU)
	 * 89 ^ 60 = 0110 0101(101) (OU Exclusivo)
	 * 
	 * Tomar cuidado para não confundir o operador lógico usado em condicionais, pois quando usado em condicionais (&&, ||), esses fazem uma relação entre o resultado das comparações, então quando existe uma condicional como por exemplo: if (1>3 && 3>2){} o trecho de código só é executado com as duas afirmações true. Ou if (1>3 || 3>2){} o trecho de código é executado se apenas uma das comparações for verdadeira.
	 * */

import java.util.Scanner;

// Descobrir se existe um bit "1" na posição x de um número 
public class ExerFixacao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Se cria uma mascara onde existe o número 1 apenas na posição que queremos comparar. 
		int mask = 0b00100000; //32
		
		System.out.println("Digite um número para saber se o sexto bit equivale a 1.");
		int n = sc.nextInt();
		
		// Se a comparação & for diferente de 0 siginifica que existe um número 1  no numero comparado pois & só é verdadeiro se os dois forem verdadeiros, 1 & 1 = 1 -- 1 & 0 = 0
		if ((n & mask) != 0) {
			System.out.println("O sexto bit é 1!");
		} else {
			System.out.println("O sexto bit não é 1!");
		}
		sc.close();

	}

}
