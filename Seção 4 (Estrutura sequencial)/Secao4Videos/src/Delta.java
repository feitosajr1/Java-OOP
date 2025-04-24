//Dada a equação de segundo grau: x² + 8x -9 = 0
//Quais são suas duas raízes? 

import java.util.Locale;
import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		String msg;
		double delta;
		double a, b, c, x1, x2;
		
		System.out.println("Dada a equação de segundo grau: x² + 8x -9 = 0");
		System.out.println("Quais são suas duas raízes?");
		
		System.out.println("Qual o valor de a? ");
		a = entrada.nextDouble();
		System.out.println("Qual o valor de b? ");
		b = entrada.nextDouble();
		System.out.println("Qual o valor de c? ");
		c = entrada.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4* a * c;
		System.out.println("O valor de delta é: " + delta + "." );
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		msg = "Desta forma as duas raízes da equação são:";
		msg = msg + "\n      x' = " + x1;
		msg = msg + "\n      x'' = " + x2;
		System.out.println(msg);
		
		entrada.close();
	}

}
