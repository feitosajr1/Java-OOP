/*
 * A operação split 
 * Ela serve para recortar uma String
 * Por exemplo em uma String com várias palavras eu posso separar cada palavra em uma variavél
 * 1. Ele recebe um separador entre parenteces 
 * */
public class ExerFixacao4 {

	public static void main(String[] args) {
		// posso colocar cada palavra da Strig em uma variavel.
		String original = "potato apple lemon orange";
		System.out.println("String Original: " + original);

		// Recebe um separador entre parenteses, e gera um vetor (vector) com as partes
		// do String recortada cada palavra em um vetor ou conforme o separador que você
		// informar ou definir 
		String[] vect = original.split(" ");
		
		// Cada palavra do String em uma local do vetor
		System.out.println("\nCada palavra do String em uma local do vetor:");
		System.out.println("[0] " + vect[0]);
		System.out.println("[1] " + vect[1]);
		System.out.println("[2] " + vect[2]);
		System.out.println("[3] " + vect[3]);

		// Separadores, armazenando cada local do vetor em uma variavel. 
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		String word4 = vect[3];
		
		System.out.println("\nReorganizando com as variáveis");
		System.out.println(word1 + " " + word2 + " " + word3 + " " + word4 );
		

	}

}
