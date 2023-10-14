import java.util.Locale;
import java.util.Scanner;

public class Ex7Aula {

	public static void main(String[] args) {
		
		// Para digitar até a linha quebrar, para salvar varias palavras. nomes compostos 
		// Quando você coloca uma leitura de dados diferente de .nextLine antes ele fica com uma linha pendente, a proxima leitura de dados consome essa linha pendente e fica nula
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		String s1, s2, s3;
		int x;
		
		System.out.println("Digite um inteiro");
		x = entrada.nextInt(); // Fica uma linha pendentente que cobre a proxima leitura 
		entrada.nextLine(); // faz uma leitura de dados a mais para resolver
		System.out.println("Digite a proxima String");
		s1 = entrada.nextLine();
		System.out.println("Digite a proxima String");
		s2 = entrada.nextLine();
		System.out.println("Digite a proxima String");
		s3 = entrada.nextLine();
		
		System.out.println("Inteiro " + x);
		System.out.println("Digitado " + s1);
		System.out.println("Digitado " + s2);
		System.out.println("Digitado " + s3);
		
		entrada.close();
	}

}
