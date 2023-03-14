package ExerciciosLista1;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Double nota1 = Double.valueOf(JOptionPane.showInputDialog("Digite um número:"));
		Double nota2 = Double.valueOf(JOptionPane.showInputDialog("Digite um número:"));
		Double nota3 = Double.valueOf(JOptionPane.showInputDialog("Digite um número:"));
		
		Double media = (nota1 + nota2 + nota3)/3; 
		
		if(media >= 6) {
			JOptionPane.showMessageDialog(null, "aprovado");
		}
		else if(media >= 4 && media < 6) {
			JOptionPane.showMessageDialog(null, "recuperação");
		}
		else {
			JOptionPane.showMessageDialog(null, "reprovado");
		}
	}
}
