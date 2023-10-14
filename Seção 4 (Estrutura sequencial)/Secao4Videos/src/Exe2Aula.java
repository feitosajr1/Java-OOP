
//Escrever o conteúdo de uma variável com ponto flutuante
import java.util.Locale;

//Import é feito para pegar o modo de separação americano por pontos.
public class Exe2Aula {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f%n", x);
		
		//Para concatenar varios elementos usando um mesmo comando de escrita e usando os marcadores de formatação.
		System.out.printf("RESULTADO = %.2f metros%n", x);
		

	}

}
 