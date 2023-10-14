/*
	 * Operadores bitwise (operadores bit a bit). Ao usar esse operador o programa faz uma comparação de bit a bit da informação. usando os operadores lógicos. 
	 * Exemplo: 89 = 0101 1001   ->   60  = 0011 1100
	 * 89 & 60 = 0001 1000(24)(AND / E)
	 * 89 | 60 = 0111 1101(125) (OR  / OU)
	 * 89 ^ 60 = 0110 0101(101) (XOR / OU Exclusivo)
	 * */
public class ExerFixacao1 {

	public static void main(String[] args) {

		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

	}

}
