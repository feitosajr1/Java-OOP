import java.util.Scanner;
public class Principal3 {

	public static void main(String[] args) {

		int i;
		int fim;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro para ínicio da contagem de termos: ");
		i = entrada.nextInt();
		
		System.out.print("Digite quantos termos depois de " + i + " irá ter a execução: ");
		fim = entrada.nextInt();
		
		do {
			System.out.println(i + "°" + " termo");
			i++;
		} while (i <= fim);

	}

}
