import java.util.*;

public class ExRev2Aula {

	public static void main(String[] args) {

//		Para ler um texto até a quebra de linha (enter)
//		Caso tenha leitura de um dado diferente do next.line, o proximo next line absorve a quebra de linha. 
//		Para resovler é so criar um next.line para absover a quebra 
		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		System.out.println("Digite um inteiro");
		x = sc.nextInt();

		sc.nextLine(); // Para absorver a quebra de linha do sc.nextLine

		System.out.println("Digite a primeira String:");
		s1 = sc.nextLine();
		System.out.println("Digite a segunda String:");
		s2 = sc.nextLine();
		System.out.println("Digite a terceira String:");
		s3 = sc.nextLine();

		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}

//PAREI NO VÍDEO 28.FUNÇÕES MATEMATICAS COM JAVA 