/*
 * Funções para Strings 
 * Formatar: toLowerCase(), toUpperCase(), trim()
 * Recortar: substring(inicio), substring(inicio, fim)
 * Substituir: Replace(char, char), Replace(string, string)
 * Buscar: IndexOf, LastIndexOf
 * str.Split(" ")
 * */

public class ExerFixacao3 {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG ";

		String s01 = original.toLowerCase(); // Deixa tudo em minusculo.
		String s02 = original.toUpperCase(); // Deixa tudo em minusculo
		String s03 = original.trim(); // Retira os espaços das extremidades
		String s04 = original.substring(2); // O argumento '2' indica em qual char a subString irá começar
		String s05 = original.substring(2, 9); // Os Argumentos "2, 9" char de inicio e fim da subString respectivamente
		String s06 = original.replace('a', 'x'); // Susbstitui os char`s que contem 'a' por 'x'
		String s07 = original.replace("abc", "xy"); // Susbstitui os char`s que contem 'abc' por 'xy'

		int i = original.indexOf("bc"); // indica a primeira posição onde o argumento "bc" aparece na String(1)
		int j = original.lastIndexOf("bc"); // indica a ultima posição onde o argumento "bc" aparece na String(17)

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

	}

}
