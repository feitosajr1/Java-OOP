// Como utilizar o Debug do Eclipse. (Execução passo a passo)
// Ele permite executar partes do programa, cada passo, e isso permite monitorar o valor das variaveis em cada parte do código, é como se só executasse uma parte do codigo. 
//A primeira coisa que normalmente é feita é marcar uma linha de breakpoint (Indica onde vai começar a execução linha por linha). O programa executa automaticamente até a linha de breakpoint (Ctrl shift b) e troca para o ambiente de debug, dessa forma a execução fica para e cada vez que presionamos F6 o debug ler a proxima linha. 

import java.util.Locale;
import java.util.Scanner;

public class AulaEx1 {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		//Declaração
		System.out.println("Largura: ");
		double largura = entrada.nextDouble();
		System.out.println("Comprimento");
		double comprimento = entrada.nextDouble();
		System.out.println("Preço do metro quadrado");
		double metroQuadrado = entrada.nextDouble();
		
		//Processamento.
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2fm quadrados%n", area);
		System.out.printf("PRECO = R$%.2f%n", preco);
		entrada.close();
		
	}

}
