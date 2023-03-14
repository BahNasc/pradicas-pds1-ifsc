package ExerciciosLista1;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Exercicio2 {
 
	 
	public static void main(String[] args) {
		
    ArrayList<String> elemento = new ArrayList<String>();
	    
	for(int i = 0; i < 10; i++) {
		elemento.add(JOptionPane.showInputDialog("Digite: "));
	}
	for(int i = 0; i < elemento.size(); i++) {
		JOptionPane.showMessageDialog(null, "os elementos são: " + elemento.get(i));
			
	}
	
		
	}
	    
}
