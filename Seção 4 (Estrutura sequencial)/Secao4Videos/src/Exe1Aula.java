
//Escrever o conteúdo de uma variável com ponto flutuante
import java.util.Locale;

//Import é feito para pegar o modo de separação americano por pontos.
public class Exe1Aula {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double x = 10.35784;

		System.out.println(x);

		// Controlar o numero de casas decimais na exibição basta incluir o 'f' no final
		// do print que indica que vai imprimir algo formatado %.2f indica que serão
		// duas casas decimais e %n indica que vai pular uma linha, mesmo que \n
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f%n", x);

	}

}
 