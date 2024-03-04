
public class ExerFixacao5 {

	public static void main(String[] args) {
		// for (inicio; condição; incremento) {}
		// Exemplos

//		int x = 4;
//		int y = x + 2;
//		
//		for (int i = 0; i < x; i++) {
//			System.out.print(x + " " + y);
//			y = y + i;
//		}

//		int x;
//		int y;
//		for (int i = 1; i < 5; i++) {
//			y = i - 1;
//			x = i * 10;
//			System.out.print(i);
//		}

		int y = 10;
		for (int i = 0; i < 4; i++) {
			System.out.println("Aqui está apenas os valores da variavél na passsagem: " + i);
			System.out.println("i: " + i);
			System.out.println("y: " + y);
			System.out.println("-----------------------");
			System.out.println("Console:");
			System.out.print(i);
			y = y + i;
			System.out.println(y);
			System.out.println("-----------------------");
		}

//		int x = 4;
//		int y = 0;
//		for (int i = 0; i < x; i++) {
//			System.out.print(i);
//			System.out.println(x);
//			y += 10;
//			
//		}

//		int x = 4;
//		int y = 0;
//		for (int i = 0; i < x; i++) {
//			y += i;
//		}
//		System.out.println(y);
		
//		int x = 8;
//		int y = 3;
//		for (int i = 0; y < x; i++) {
//			x -= 2;
//			y += 1;
//			System.out.println(i);
//		}
	}
}
