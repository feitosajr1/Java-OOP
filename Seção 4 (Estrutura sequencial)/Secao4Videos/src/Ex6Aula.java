import java.util.Locale;
import java.util.Scanner;

public class Ex6Aula {

	public static void main(String[] args) {
		
		// Para digitar até a linha quebrar, para salvar varias palavras. nomes compostos 
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		String s1, s2, s3;
		
		System.out.println("Digite a proxima String");
		s1 = entrada.nextLine();
		System.out.println("Digite a proxima String");
		s2 = entrada.nextLine();
		System.out.println("Digite a proxima String");
		s3 = entrada.nextLine();
		
		System.out.println("Digitado " + s1);
		System.out.println("Digitado " + s2);
		System.out.println("Digitado " + s3);
		
		entrada.close();
	}

}
