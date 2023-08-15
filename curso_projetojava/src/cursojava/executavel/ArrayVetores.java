package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetores {

	public static void main(String[] args) {
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o arraay deeve ter?");
		
		/*Quantidade de posições sempre definidas*/
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		/*definir o valor que cada nota deve ter*/
		for (int pos = 0; pos < notas.length; pos++) {
			String valorNota = JOptionPane.showInputDialog("Qual o valor da nota na posição " + (pos + 1));
			notas[pos] = Double.valueOf(valorNota);			
			} 	
		
		
		/*percorrendo os elementos por posição do array*/
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota "+ (pos + 1) + " é igual a " + notas[pos]);
		} 
		 
		

	}

}
