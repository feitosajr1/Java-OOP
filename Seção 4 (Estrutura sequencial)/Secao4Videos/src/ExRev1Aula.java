//Entrada de dados 
import java.util.Scanner;
public class ExRev1Aula {

	public static void main(String[] args) {
//		Para criar entrada de dados, precisamos criar um OBJETO do tipo SCANNER da seguinte forma.
//		Scanner sc = new Scanner(System.in);
//		Para a entrada de dadods funcionar, precisamos fazer o import do objeto e fechhar a entrada de dados.  
//		"import java.util.Scanner;"
//		"sc.close()"
		Scanner sc = new Scanner(System.in);
		
//		Para ler uma palavra (texto sem espaços)
		String x, y;
		System.out.println("Digite uma palavra");
		x = sc.next();
		System.out.println("Digite outra palavra:");
		y = sc.next();
		System.out.println("Você digitou: " + x + " e depois: " + y);
		System.out.printf("Você digitou: %s e depois: %s", x, y  );
		
//		PAREI NO MINUTO 5:30 DO VÍDEO 26. ENTRADA DE DADOS EM JAVA
		sc.close();	
	}
}