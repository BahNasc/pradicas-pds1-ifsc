package ExerciciosLista1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Media extends JFrame implements ActionListener {
  private JTextField nome, nota1, nota2, nota3;
  private JLabel nomelbl, notalbl1, notalbl2, notalbl3;
  
     public Media() {
    	 
    	 setTitle("Cálculo da média do aluno: ");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new GridLayout(5, 4));
    	 
    	 //criando os campos de texto
    	 nome = new JTextField(10);
    	 nota1 = new JTextField(10);
    	 nota2 = new JTextField(10);
    	 nota3 = new JTextField(10);
    	 
    	 nomelbl = new JLabel("Nome:");
         notalbl1 = new JLabel("Nota 1:");
         notalbl2  = new JLabel("Nota 2:");
         notalbl3 = new JLabel("Nota 3:");
    	 
    	 //adicionando listener e Jlabels
    	 add(nomelbl);
         add(nome);
         add(notalbl1);
         add(nota1);
         add(notalbl2);
         add(nota2);
         add(notalbl3);
         add(nota3);
         
         JButton calcula = new JButton("Calcular");
    	 calcula.addActionListener(this);
    	 add(calcula);
    	
    	 //Configuração da janela
    	 
    	 setSize(300, 200);
    	 setVisible(true);
    	
     }
     
     public void actionPerformed(ActionEvent e) {
    	 String nomeAluno = nome.getText();
    	 double not1 = Double.parseDouble(nota1.getText());
    	 double not2 = Double.parseDouble(nota2.getText());
    	 double not3 = Double.parseDouble(nota3.getText());
    	 double media = (not1+not2+not3) / 3;	 
    	 
    	 JOptionPane.showMessageDialog(this, "A média do aluno " + nomeAluno + " é " + media);
    	 
     }
     
     public static void main(String[] args) {
		new Media();
	}
}
