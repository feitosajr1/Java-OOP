// Estrutura repetitiva "Faça-enquanto"/
import java.util.Scanner;
import java.util.Locale;
public class ExerFixacao6 {

	public static void main(String[] args) { 
		// Menos utilizada mas em alguns casos se encaixa melhor no problema. 
		// O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final
		// V volta e faz de novo 
		// F pula fora do laço
		
		// Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		char decisao;
		double fahr, celsi;
		
		do {
			System.out.print("Digite os graus em Celsius para transformar em Fahrenheit: ");
			celsi = entrada.nextDouble();
			fahr = 9 * celsi/5 + 32 ; 
			System.out.printf("\n%.1fC° em Fahrenheit equivale a %.1fF°%n", celsi, fahr);
			
			System.out.print("\n" + "Deseja realizar o calculo novamente(s/n)? ");
			decisao = entrada.next().charAt(0);
		} while(decisao != 'n');
		
		System.out.println("Programa finalizado ");
		entrada.close();
	}

}
