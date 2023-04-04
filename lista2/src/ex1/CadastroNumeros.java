package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CadastroNumeros extends JFrame {

	private JPanel contentPane;
	private JTextField textCadastrar;
	private JTextField textExibição;
	private JButton btnExibir;
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
		
		textCadastrar = new JTextField();
		textCadastrar.setBounds(108, 11, 157, 20);
		contentPane.add(textCadastrar);
		textCadastrar.setColumns(10);
		
		textExibição = new JTextField();
		textExibição.setEditable(false);
		textExibição.setBounds(108, 52, 157, 20);
		contentPane.add(textExibição);
		textExibição.setColumns(10);
		
		ArrayList<Double> listaNumeros = new ArrayList<Double>();
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(38, 99, 81, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// quando o usuario clicar no botao esse codigo aqui abaixo eh chamado
				// 1 passo = pegar o texto digitado pelo usuario e armazenar em variaveis do tipo string
//				getText()
				String textCadastro = textCadastrar.getText();
				// conversao de tipo
				Double numerosCadastrados = Double.parseDouble(textCadastro);
				// 3 passo = inserir no arraylist
				listaNumeros.add(numerosCadastrados);
				
			}
		});
		contentPane.add(btnCadastrar);
		
		btnExibir = new JButton("Exibir");
		btnExibir.setBounds(159, 99, 89, 23);
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// pegar todo o conteudo do arraylist
				// e exibir em um campo de texto so
				// usando setText()
				Integer qtdPares = Integer.valueOf(0);
				
				for (int i = 0; i < listaNumeros.size(); i++) {
					if(listaNumeros.get(i) % 2 == 0) {
						qtdPares++;
				
						textExibição.setText(qtdPares.toString());
					
				
					}
				}
			}
		});
		contentPane.add(btnExibir);
		
		JLabel lblCadastrar = new JLabel("Exibição: ");
		lblCadastrar.setBounds(38, 55, 46, 14);
		contentPane.add(lblCadastrar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(23, 55, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCadastro = new JLabel("Cadastrar:");
		lblCadastro.setBounds(38, 14, 52, 14);
		contentPane.add(lblCadastro);
		
	}
}
