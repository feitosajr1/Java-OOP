import java.util.Locale;
import java.util.Scanner;

public class Ex5Aula {

	public static void main(String[] args) {
		
		// sem colocar a localização ele só ler oque for digitado com a virgula 
		Locale.setDefault(Locale.US);
		
		// Para entrada de dados se cria um objeto do tipo Scanner instanciando
		Scanner entrada = new Scanner(System.in);

		// para fazer a entrada de dados precisamos relacionar uma variavel a um .next()
		
		//Proxima String
		String x;
		System.out.println("Digite a proxima String");
		x = entrada.next();
		// não serve para duas strings nome composto.
		System.out.println("Você digitou " + x);

		// proximo numero inteiro
		int n;
		System.out.println("Digite o proximo Int");
		n = entrada.nextInt();
		System.out.println("Você digitou " + n);

		// proximo numero double
		double d;
		System.out.println("Digite o proximo double");
		d = entrada.nextDouble();
		System.out.println("Você digitou " + d);
		
		// proximo char 
		char k;
		System.out.println("Digite o proximo char");
		k = entrada.next().charAt(0);
		System.out.println("Você digitou " + k);

		// entrada de varias 
		String s;
		int l;
		double i;
		System.out.println("Digite String");
		s = entrada.next();
		System.out.println("Digite Int ");
		l = entrada.nextInt();
		System.out.println("Digite double ");
		i = entrada.nextDouble();

		System.out.println("Digitado " + s);
		System.out.println("Digitado " + l);
		System.out.println("Digitado " + i);
				
				
		entrada.close();
		// fazer um entrada.close() para fechar a função inciada 
	}

}
