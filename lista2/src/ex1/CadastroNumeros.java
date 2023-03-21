package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CadastroNumeros extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JTextField textField_2;
	// arraylist

	/**
	 * Metodo main 
	 * 
	 * Executa a exibicao da Janela
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroNumeros frame = new CadastroNumeros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroNumeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(79, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 52, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(175, 51, 81, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// quando o usuario clicar no botao esse codigo aqui abaixo eh chamado
				
				
				// 1 passo = pegar o texto digitado pelo usuario e armazenar em variaveis do tipo string
//				getText()
				
				// conversao de tipo
				
				// 2 passo = inserir no arraylist
				
			}
		});
		contentPane.add(btnCadastrar);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(38, 96, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// pegar todo o conteudo do arraylist
				// e exibir em um campo de texto so
				// usando setText()
				
				
			}
		});
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(38, 124, 86, 20);
		textField_2.setEditable(false);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(23, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(23, 55, 46, 14);
		contentPane.add(lblNewLabel_1);
		
	}
}
