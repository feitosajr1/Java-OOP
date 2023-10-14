

public class ExerFixacao3 {

	public static void main(String[] args) {
		
		// A estrutura do for necessita que sejam declarado o inicio, a condição e o incrmento, montando como uma contagem, e assim definimos a ordem.
		// é otima para se fazer uma repetição baseada em uma contagem. 
		// for (inicio; condição; incremento) {}
		System.out.println("Crescente");
		for (int i = 0; i <= 5; i++) {
			System.out.println("Valor de i: " + i);
		}

		System.out.println("");
		
		System.out.println("Decrescente");
		for (int i = 5; i >= 0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
	}
}
