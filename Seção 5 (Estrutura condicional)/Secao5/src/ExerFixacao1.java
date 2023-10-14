/*
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
a ser pago.
*/

import java.util.Locale;
import java.util.Scanner;

public class ExerFixacao1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double conta = 50.0;
		System.out.println("Digite quantos minutos consumiu: ");
		int minutos = sc.nextInt();
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
			/*
			 Se o valor for maior que 10o, ele primeiro calcula oque passa de 100, multiplica por 2 (valor do excedente)
			 depois é somado com valor de conta (cobrado por 100min).
			  */
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta); // %.2f siginifica que a variavel que vai entrar é double %n pula uma linha.
		sc.close();

	}

}
