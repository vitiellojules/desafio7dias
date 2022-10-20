package desafio7dias;
import javax.swing.JOptionPane;

public class DiaCinco {
	
	public static void main(String[] args) {
		
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de linhas da A"));
	    int M = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de colunas da A"));
	    int O = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de linhas da B"));
	    int P = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de colunas da B"));
		 int matrizA[][] = new int[N][M];
		    int matrizB[][] = new int[O][P];

		    for (int i = 0; i < matrizA.length; i++) {
		        for (int j = 0; j < matrizA.length; j++) {

		            matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + " valor da matriz A"));

		        }

		    }
		    for (int i = 0; i < matrizB.length; i++) {
		        for (int j = 0; j < matrizB.length; j++) {

		            matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (j + 1) + " valor da matriz B"));
		        }

		    }

		    int soma = 0;

		    if (N == O && M == P) {

		        for (int i = 0; i < matrizB.length; i++) {
		            for (int j = 0; j < matrizB.length; j++) {

		                soma = matrizA[i][j] + matrizB[i][j];

		            }

		        }
		        JOptionPane.showInputDialog(soma);
}
		    }
	}