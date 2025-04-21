
//Entrada de dados 
import java.util.Locale;
import java.util.Scanner;

public class ExRev1Aula {

	public static void main(String[] args) {
		// Serve para ler entradas com ponto. 5.25
		Locale.setDefault(Locale.US);
//		Para criar entrada de dados, precisamos criar um OBJETO do tipo SCANNER da seguinte forma.
//		Scanner sc = new Scanner(System.in);
//		Para a entrada de dadods funcionar, precisamos fazer o import do objeto e fechhar a entrada de dados.  
//		"import java.util.Scanner;"
//		"sc.close()"
		Scanner sc = new Scanner(System.in);

//		Para ler uma palavra (texto sem espaços)x = sc.next();
		String x, y;
		System.out.println("Digite uma palavra");
		x = sc.next();
		System.out.println("Digite outra palavra:");
		y = sc.next();
//		Para ler um número inteiro
		int i;
		System.out.println("Agora digite um número inteiro");
		i = sc.nextInt();
//		Para ler um número com ponto flutuante x = sc.nextDouble();
		Double d;
		System.out.println("Agora digite um número com 4 casas decimais");
		d = sc.nextDouble();
//		Para ler um caractere x = sc.next().charAt(0);
		char c;
		System.out.println("Agora digite um caractere");
		c = sc.next().charAt(0);

		System.out.printf("Você digitou: %s%nDepois digitou: %s%n", x, y);
		System.out.printf("O número inteiro foi: " + i);
		System.out.println(d);
		System.out.printf(
				"Número digitado com 2 casas decimais: %.2f%nNúmero digitado com três casas decimais: %.3f%nNúmero digitado com quatro casas decimais: %.4f%n",
				d, d, d);
		System.out.println("Caractere digitado: " + c);

		sc.close();
	}
}