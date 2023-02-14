                                                                                                                                                                                            package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
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
	public JanelaCadastroPessoa() {
		setTitle("ola mundo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNome.setBounds(65, 135, 68, 25);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(143, 136, 210, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnNewButton = new JButton("concluir");
		btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    String nome = txtNome.getText();
				String idade = txtIdade.getText();
				
				if (nome.isEmpty()) {
					JOptionPane.showMessageDialog(null,  "Nenhum nome foi preenchido");
				}
				
				if(idade.isEmpty()) {
					JOptionPane.showMessageDialog(null,  "nenhuma idade foi digitada");
		        }
				Funcionario 
			}
		});
		btnNewButton.setBounds(191, 226, 101, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:\r\n");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_1.setBounds(65, 188, 55, 14);
		contentPane.add(lblNewLabel_1);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(152, 186, 201, 23);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(195, 262, 97, 23);
		contentPane.add(chckbxNewCheckBox);
	}
}
