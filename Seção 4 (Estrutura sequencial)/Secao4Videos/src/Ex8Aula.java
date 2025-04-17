import java.util.Locale;

public class Ex8Aula {

	public static void main(String[] args) {
//		Serve para trocar o separador de decimais de virgula para ponto
		Locale.setDefault(Locale.US);
		
		int y = 2; 
		double x = 10.35784;
		System.out.println(y);
		System.out.println("Bom dia!");
		System.out.println(x);
		
//		Caso eu queria controlar as cassas decimais do double,
//		precisamos formatar essa impressão substuindo println por printf
//		Isso indica que a impressão vai ser formatada. 
//		System.out.println("%.2f%n", x); Isso siginifiica que %.2f para apenas duas casas decimais 
//		e %n para pular uma linha no final
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.2f 2 casas decimais%n", x);
		System.out.printf("%.4f 4 casas deciamaisf%n", x);
		
	}

}
