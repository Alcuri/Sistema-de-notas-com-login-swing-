package login.AND.sistema;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class LoginProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginProfessor frame = new LoginProfessor();
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
	public LoginProfessor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(60, 51, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(60, 95, 46, 14);
		contentPane.add(lblSenha);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(134, 48, 86, 20);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		//MediaPonderada janela2 = new MediaPonderada();
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				NotasAluno janela2 = new NotasAluno();
				String senha = "UNIP";
				String login = "Matheus";
				
				String loginDig = String.valueOf(tfLogin.getText());
				@SuppressWarnings("deprecation")
				String senhaDig = String.valueOf(pfSenha.getText());
				
				if (loginDig.equals(login) && senhaDig.equals(senha)){
					
					if (janela2 == null){
						janela2 = new NotasAluno();
						janela2.setLocationRelativeTo(null);
						janela2.setVisible(true);
						janela2.setResizable(false);
						
					}else{
						janela2 = new NotasAluno();
						janela2.setLocationRelativeTo(null);
						janela2.setVisible(true);
						janela2.setResizable(false);
					}
				}else{
					JOptionPane.showMessageDialog(null, "Senha ou login incorreto(s), tente novamente!");
					pfSenha.setText("");
				}
			}
		});
		btnLogar.setBounds(39, 165, 89, 53);
		contentPane.add(btnLogar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfLogin.setText("");
				pfSenha.setText("");
			}
		});
		btnLimpar.setBounds(165, 165, 89, 53);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(287, 165, 89, 53);
		contentPane.add(btnSair);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(134, 95, 86, 17);
		contentPane.add(pfSenha);
	}
}
