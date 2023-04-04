package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class meioremenor extends JFrame {

	private JPanel contentPane;
	private JTextField textMaior;
	private JTextField textMenor;
	private JTextField textCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					meioremenor frame = new meioremenor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public meioremenor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textMaior = new JTextField();
		textMaior.setEditable(false);
		textMaior.setBounds(192, 37, 86, 20);
		contentPane.add(textMaior);
		textMaior.setColumns(10);
		
		textMenor = new JTextField();
		textMenor.setEditable(false);
		textMenor.setBounds(192, 93, 86, 20);
		contentPane.add(textMenor);
		textMenor.setColumns(10);
		
		textCadastrar = new JTextField();
		textCadastrar.setBounds(41, 59, 86, 20);
		contentPane.add(textCadastrar);
		textCadastrar.setColumns(10);
		
		JLabel lblCadastrar = new JLabel("CADASTRE: ");
		lblCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCadastrar.setBounds(41, 40, 86, 14);
		contentPane.add(lblCadastrar);
		
		JLabel lblMaior = new JLabel("MAIOR");
		lblMaior.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMaior.setBounds(210, 12, 46, 14);
		contentPane.add(lblMaior);
		
		JLabel lblMenor = new JLabel("MENOR");
		lblMenor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMenor.setBounds(210, 68, 46, 14);
		contentPane.add(lblMenor);
		
		ArrayList<Double> CadastrodeNumeros = new ArrayList<Double>();
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//pegar o text e transforma-lo em string
				String txtCadastroNumeros = textCadastrar.getText();
				
				//agora transformar string em double pq a arraylist é double
				Double cadastrarNumeros = Double.parseDouble(txtCadastroNumeros);
				
				//agora add na arraylist
				CadastrodeNumeros.add(cadastrarNumeros);
				
			}
		});
		btnCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCadastrar.setBounds(32, 92, 107, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnExibir = new JButton("EXIBIR");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Double maior = Double.valueOf(Double.MIN_VALUE);
				Double menor = Double.valueOf(Double.MAX_VALUE);
				
				for(int i = 0; i < CadastrodeNumeros.size(); i++) {
					if(CadastrodeNumeros.get(i) > maior) {
						maior = CadastrodeNumeros.get(i);
					}
					if(CadastrodeNumeros.get(i) < menor) {
						menor = CadastrodeNumeros.get(i);
					}
					textMaior.setText(maior.toString());
					textMenor.setText(menor.toString());
			}
          }
		});
		btnExibir.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnExibir.setBounds(192, 137, 89, 23);
		contentPane.add(btnExibir);
	}
}
