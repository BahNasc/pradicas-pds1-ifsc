package ex1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		Double precoLitro = Double.valueOf(JOptionPane.showInputDialog("Digite um número:"));
		Integer quantidadeLitros = Integer.valueOf(JOptionPane.showInputDialog("digite a quantidade de litros:"));
		
		Double tp = totalPagamentos(precoLitro, quantidadeLitros);
		JOptionPane.showMessageDialog(null, "O pagamento total foi:"+tp);
			
		}

	public static double totalPagamentos(Double precoLitro, Integer quantidadeLitros) {
		
		Double pagamento = precoLitro * quantidadeLitros;
		return pagamento; 
	}
}

//É uma coleção de subprogramas utilizados no desenvolvimento de software. Bibliotecas contém código e dados auxiliares, 
//que dão serviços a programas independentes, o que permite o compartilhamento e a alteração de código e dados.

//Possibilita o desenvolvimento de interfaces elaboradas para um ambiente de computação heterogêneo com interação mais agradável.

//a. JButton
//b. JTextFieldName
//c. JCheckBoxName
//d. JProgressBar
//e.JRadioButton
//f.JComboBox
