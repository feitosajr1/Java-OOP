/*
 Para 3 posibilidades. 
 */

import java.util.Scanner;

public class AulaEx2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas? ");
		hora = entrada.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia! ");
		} else if (hora < 18) {
			System.out.println("Boa tarde! ");
		} else {
			System.out.println("Boa noite! ");
		}
		
		entrada.close();
	}

}
