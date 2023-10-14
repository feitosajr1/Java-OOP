import java.util.Locale;
import java.util.Scanner;

public class ExerFixacao2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

//		double x = 5;
//		double y = 0;
//
//		while (x > 2) {
//			System.out.println(x);
//			y += x;
//			x -= 1;
//		}

		
//		double x = 2;
//		double y = 0;
//
//		while (x < 60) {
//			System.out.println(x);
//			x *= 2;
//			y += 10;
//		}

		
//		double x = 0;
//
//		while (x < 5) {
//			double y = x * 3;
//			System.out.println(y);
//			x += 1;
//		}
//		System.out.println("Fim!");
		
		
		//problema exemplo
		int x = 1;
		int soma = 0;
		
		
		while (x != 0) {
			System.out.print("Digite um número inteiro ou 0 para encerrar: ");
			x = entrada.nextInt();
			soma += x; 
		}
		System.out.println("A soma dos números é: " + soma);
		entrada.close();
	}

}
