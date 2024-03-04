/*
 Questões propostas/
 */

import java.util.Locale;
import java.util.Scanner;

public class AulaEx3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// Questão 1
//		  Fazer um programa para ler um número inteiro, e depois dizer se
//		  este número é negativo ou não.

//			Scanner entrada = new Scanner(System.in);
//			int numero;
//
//			System.out.println("Digite um número inteiro: ");
//			numero = entrada.nextInt();
//
//			if (numero >= 0) {
//				System.out.println("Não negativo! ");
//			} else {
//				System.out.println("Negativo! ");
//			}
//			entrada.close();

		// Questão 2
//		Fazer um programa para ler um número inteiro e dizer se este número 
//		é par ou ímpar.

//			Scanner entrada = new Scanner(System.in);
//			int numero;
//
//			System.out.println("Digite um número inteiro: ");
//			numero = entrada.nextInt();
//
//			if (numero % 2 == 0) {
//				System.out.println("Par! ");
//			} else {
//				System.out.println("Impar! ");
//			}
//			entrada.close();

//		Questão 3 
//		Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma  mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores  lidos são múltiplos entre si. 
//		Atenção: os números devem poder ser digitados em ordem crescente ou decrescente. 

//			Scanner entrada = new
//
//			Scanner(System.in);
//			int a, b;
//
//			System.out.println("Digite um número inteiro: ");
//			a = entrada.nextInt();
//			System.out.println("Digite outro número inteiro: ");
//			b = entrada.nextInt();
//
//			if (a > b) {
//				if (a % b == 0) {
//					System.out.println("São multiplos ");
//				} else {
//					System.out.println("Não são multiplos");
//				}
//			} else {
//				if (b % a == 0) {
//					System.out.println("São multiplos ");
//				} else {
//					System.out.println("Não são multiplos ");
//				}
//			}
//			entrada.close();

		// Questão 4
//		  Leia a hora inicial e a hora final de um jogo. A seguir calcule
//		  a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar
//		  em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

		
		// Questão 5
//		Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos 
//		([0,25],(25,50], (50,75], (75,100]) este valor se encontra.Obviamente se o valor não estiver em nenhum destes intervalos
//		deverá ser impressa a mensagem “Fora de intervalo”.
		  
		  
//		Scanner entrada = new Scanner(System.in);
//		double valor;
//
//		System.out.println("Digite um número inteiro entre 0 e 100: ");
//		valor = entrada.nextDouble();
//
//		// usando && por que as duas tem que ser verdadeira, deve estar entre 0 e 100.
//		if (valor > -1 && valor <= 100) {
//			if (valor >= 0 && valor <= 25) {
//				System.out.println("O número está entre o intervalo [0, 25] e vale: " + valor);
//			} else if (valor > 25 && valor <= 50) { // exclui 25 mas tem 50 (25,50]
//				System.out.println("O número está entre o intervalo (25, 50] e vale: " + valor);
//			} else if (valor > 50 && valor <= 75) { // (50,75]
//				System.out.println("O número está entre o intervalo (50, 75] e vale: " + valor);
//			} else if (valor > 75 && valor <= 100) { // (75,100]
//				System.out.println("O número está entre o intervalo (75, 100] e vale: " + valor);
//			}
//		} else {
//			System.out.println("Esse número está fora do intervalo");
//		}
//		entrada.close();
		 

		// Questão 8
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu salario");
		double salario = entrada.nextDouble();
		double imposto;

		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f De imposto%n", imposto);
		}

		entrada.close();

	}

}
