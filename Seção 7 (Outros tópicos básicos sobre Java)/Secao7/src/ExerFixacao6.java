
// Essa é o exercicio que foi usado para criar metodos do ExerFixacao5. Esse código foi alterado para não fazer todos os processos dentro do método principal, separando em dois metodos, um que retorna um inteiro e outro que imprime o resultado
import java.util.Scanner;

public class ExerFixacao6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("Higher = " + a);
		} else if (b > c) {
			System.out.println("Higher = " + b);
		} else {
			System.out.println("Higher = " + c);
		}

		sc.close();

	}
}
