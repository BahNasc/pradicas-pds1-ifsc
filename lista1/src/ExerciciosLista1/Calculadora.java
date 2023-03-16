package ExerciciosLista1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener{
    private JTextField textField1, textField2;
    private JButton adButton, subButton, multButton, divButton;
    
    public Calculadora() {
    	
    	//criando os campos de texto
    	textField1 = new JTextField();
    	textField2 = new JTextField();
    
    	//criando os botões
	    adButton = new JButton("+");
	    subButton = new JButton("-");
	    multButton = new JButton("x");
	    divButton = new JButton("/");
	    
		//Listener para cada botão
	    adButton.addActionListener(this);
	    subButton.addActionListener(this); 
	    multButton.addActionListener(this);
	    divButton.addActionListener(this);
	    
	    //Criação do painel para add os componentes do painel
	    JPanel painel = new JPanel(new GridLayout(4, 2));
	    painel.add(new JLabel("Insira um número: "));
	    painel.add(textField1);
	    painel.add(new JLabel("Insira outro número: "));
	    painel.add(textField2);
	    painel.add(adButton);
	    painel.add(subButton);
	    painel.add(multButton);
	    painel.add(divButton);
	    //adicionar também o painel a janela 
	    add(painel);
	    
	    //configurações da janela
	    setTitle("Calculadora em Java");
	    setSize(300, 200);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
    	double nume1 = Double.parseDouble(textField1.getText());
    	double nume2 = Double.parseDouble(textField2.getText());
    	double result = 0;
    	
    	//verificar o botão clicado e realizar as operações
    	if(e.getSource() == adButton) {
    		result = nume1 + nume2;
    		
    	}else if(e.getSource() == subButton) {
    		result = nume1 - nume2;
    		
    	}else if(e.getSource() == multButton) {
    		result = nume1 * nume2;
    		
    	}else if (e.getSource() == divButton){
    		result = nume1 / nume2; 
    	}
    	//exibição do resultado
    	JOptionPane.showMessageDialog(null, "o resultado é: "+ result);
    }
    
    public static void main(String[] args) {
		new Calculadora();
	}
}
