import javax.swing.JOptionPane;

public final class Lista1_Ativ6 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número para a soma "));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número para a soma "));
		
		int a = rec(n, m);
		JOptionPane.showMessageDialog(null, "A soma de " + n + " + "+ m + " é: " + a);
	}
	
	public static int rec(int n, int m) {
		// Como estou Subtraindo de "m" para ir somando a "n", quando o "m" for zero deve retornar o "n"
		if (m == 0) {
			return n;
		// Se Subtrai 1 de uma das variáveis e soma 1 a outra variável
		} else {
			return rec(n + 1, m - 1);
		}
	}

}
