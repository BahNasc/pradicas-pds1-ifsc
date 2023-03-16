package ExerciciosLista1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Triangulos extends JFrame implements ActionListener{
      private JTextField textField1, textField2, textField3;
      private JButton result;
      
      public Triangulos() {
          //criar campos de texto
    	  textField1 = new JTextField(5);
    	  textField2 = new JTextField(5);
    	  textField3 = new JTextField(5);
    	 
          //criando botão
          result = new JButton("resultado");
          
          //adicionando listener do botão
          result.addActionListener(this);
    	  
          //criação do painel 
          JPanel painel = new JPanel(new GridLayout(4, 4));
          painel.add(new JLabel("Lado 1: "));
          painel.add(textField1);
    	  painel.add(new JLabel("lado 2: "));
    	  painel.add(textField2);
    	  painel.add(new JLabel("lado 3: "));
    	  painel.add(textField3);
    	  painel.add(result);
    	  
    	  //adicionar painel a janela
    	  add(painel);
    	  
    	  //configurações da janela 
    	  setTitle("Qual triângulo é? ");
    	  setSize(300, 200);
    	  setLocationRelativeTo(null);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  setVisible(true);
    }
         
      public void actionPerformed(ActionEvent e) {
    	  double lado1 = Double.parseDouble(textField1.getText());
    	  double lado2 = Double.parseDouble(textField2.getText());
    	  double lado3 = Double.parseDouble(textField3.getText());
    	 
    	  
    	  if(lado1 == lado2 && lado2 == lado3) {
    		  JOptionPane.showMessageDialog(null, "Triangulo equilátero");
    		  
    	  }else if(lado1 == lado2 && lado2 != lado3 || lado2 == lado3 && lado3 != lado1 || lado3 == lado1 && lado1 != lado2) {
    		  JOptionPane.showMessageDialog(null, "Triangulo isóceles");
    		  
    	  }else{
    		  JOptionPane.showMessageDialog(null, "Triangulo escaleno");
    	  }
      }

    public static void main(String[] args) {
		new Triangulos();
	}
}

