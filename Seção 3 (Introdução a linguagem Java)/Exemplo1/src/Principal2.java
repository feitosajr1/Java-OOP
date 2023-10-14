import javax.swing.JOptionPane;

public class Principal2 {

	public static void main(String[] args) {

		int i;
		int fim;
		
		i = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para contagem: "));
		fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite da contagem: "));
		
		do {
			System.out.println(i + "°" + " termo");
			i++;
		} while (i <= fim);
	}

}
