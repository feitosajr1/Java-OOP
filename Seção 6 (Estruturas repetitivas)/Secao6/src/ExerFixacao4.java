// exercicio proposto usando o for para entrada de dados. 
import java.util.Scanner;
import java.util.Locale;

public class ExerFixacao4 {

	public static void main(String[] args) { 
		// for (inicio; condição; incremento) {}
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite quantos números quer somar:");
		int nVezes = entrada.nextInt(); 
		int soma1;
		int soma2 = 0;
		
		System.out.println("");
		System.out.println("Terão " + nVezes + " entradas");
		for (int i = 1; i <= nVezes; i++) {
			System.out.print("Entrada n° " + i + ": ");
			soma1 = entrada.nextInt();
			soma2 += soma1;
		}
		System.out.println("O resultado da soma é: " + soma2);
		entrada.close();
	}

}
