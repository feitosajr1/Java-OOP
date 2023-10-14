
// A estrutura repetitiva "Enquanto" while 
// Esse é bem parecida com o if so que ela testa a condição antes de executar o laço, se for verdadeira ela executa o laço e volta para testar o laço novamente. (Testa antes da primeira execução)
import java.util.Locale;
import java.util.Scanner;

public class AulaEx2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		// Problema exemplo
		int x = 1;
		int soma = 0;
		
		while (x != 0) {
			System.out.print("Digite um número inteiro para soma ou 0 para encerrar: ");
			x = entrada.nextInt();
			soma += x;
		}
		System.out.println("A soma dos números é: " + soma);
		entrada.close();
	}

}
