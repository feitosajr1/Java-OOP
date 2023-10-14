// Aqui iremos ver como as funções são escritas na linguagem Java:
// Funções representam um processamento que possui um siginificadoe e pode ser reutilizada varias vezes e só são executadas caso forem chamadas, por exemplo
// Math.sqrt(double);, esse função que recebe um double como argumento ou parametros, tem a função de calcular a raiz quadrada de um numero.
// System.out.println();, ela é uma função que recebe uma String como argumento ou parametro nos retorno alguma na tela 

// Principais -vantagens: 
// modularização(dividir o código em várias partes), 
// delegação (você delega a lógica de calcular para outro lugar) e 
// reaproveitamento (uma função pode ser usadas várias vezes).

// Dados de entrada e saída
// Funções podem receber dados de entrada (parâmetros ou argumentos)
// Funções podem ou não retornar uma saída

// Fazer um programa para ler três números inteiros e mostrar na tela o maior. Depois colocar a estrutura do calculo em uma função (método). 
import java.util.Scanner;

public class ExerFixacao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c); // Chama o método max repassando os paramentros e recebendo o resultado na variável higher 
		showResult(higher); // Chama o método showResult passando os parametros

		sc.close();
	}

	// Declarando uma função com o calculo para o maior número inteiro
	public static int max(int x, int y, int z) {
		
		int aux; // só existe no escopo dessa função
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		// Como é uma ação sem retornar um valor ao programa essa função (metodo) é
		// chamado de void (vazio).
		System.out.println("Higher = " + value);
	}

}
