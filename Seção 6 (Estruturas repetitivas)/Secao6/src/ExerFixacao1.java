import java.util.Locale;
import java.util.Scanner;

public class ExerFixacao1 {

	public static void main(String[] args) {
		System.out.println("Está aqui");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaração
		System.out.println("Largura: ");
		double largura = sc.nextDouble();
		System.out.println("Comprimento");
		double comprimento = sc.nextDouble();
		System.out.println("Preço do metro quadrado");
		double metroQuadrado = sc.nextDouble();
		
		//Processamento.
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();

	}

}
