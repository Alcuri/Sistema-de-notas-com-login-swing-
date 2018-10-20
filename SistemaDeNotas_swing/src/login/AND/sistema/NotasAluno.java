package login.AND.sistema;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class NotasAluno extends JFrame {

	private JPanel contentPane;
	private JTextField tfNota1;
	private JTextField tfNota2;
	private JTextField tfMedia;
	private JTextField tfSituação;
	private JTextField tfConceito;
	private JTextField tfNome;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasAluno frame = new NotasAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public NotasAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setBounds(32, 72, 60, 14);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setBounds(32, 107, 60, 14);
		contentPane.add(lblNota2);
		
		tfNota1 = new JTextField();
		tfNota1.setBounds(102, 69, 86, 20);
		contentPane.add(tfNota1);
		tfNota1.setColumns(10);
		
		tfNota2 = new JTextField();
		tfNota2.setColumns(10);
		tfNota2.setBounds(102, 104, 86, 20);
		contentPane.add(tfNota2);
		
		tfMedia = new JTextField();
		tfMedia.setEditable(false);
		tfMedia.setColumns(10);
		tfMedia.setBounds(102, 135, 86, 20);
		contentPane.add(tfMedia);
		
		tfSituação = new JTextField();
		tfSituação.setEditable(false);
		tfSituação.setColumns(10);
		tfSituação.setBounds(102, 199, 86, 20);
		contentPane.add(tfSituação);
		
		JLabel lblMedia = new JLabel("M\u00E9dia");
		lblMedia.setBounds(32, 138, 60, 14);
		contentPane.add(lblMedia);
		
		JLabel lblAprovao = new JLabel("Situa\u00E7\u00E3o");
		lblAprovao.setBounds(32, 202, 60, 14);
		contentPane.add(lblAprovao);
		
		JLabel lblConceito = new JLabel("Conceito");
		lblConceito.setBounds(32, 170, 60, 14);
		contentPane.add(lblConceito);
		
		tfConceito = new JTextField();
		tfConceito.setEditable(false);
		tfConceito.setColumns(10);
		tfConceito.setBounds(102, 167, 86, 20);
		contentPane.add(tfConceito);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float nota1, nota2, media;
				
				nota1 = Float.parseFloat(tfNota1.getText());
				nota2 = Float.parseFloat(tfNota2.getText());
				
				media = (nota1*4 + nota2*6) / 10;
				
				tfMedia.setText(String.valueOf(media));
				
				
				if (media >= 9 && media <= 10){
					tfConceito.setText("A");
					tfSituação.setText("APROVADO");
				}
				else if (media >= 7 && media < 9){
					tfConceito.setText("B");
					tfSituação.setText("APROVADO");	
				}
				else if (media >= 3 && media < 7){
					tfConceito.setText("C");
					tfSituação.setText("EXAME");	
				}
				else{
					tfConceito.setText("D");
					tfSituação.setText("DP");			
				}
			}
		});
		btnCalcular.setBounds(279, 34, 89, 57);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNota1.setText("");
				tfNota2.setText("");
				tfMedia.setText("");
				tfConceito.setText("");
				tfSituação.setText("");
				tfNome.setText("");
			}
		});
		btnLimpar.setBounds(279, 107, 89, 57);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSair.setBounds(279, 181, 89, 57);
		contentPane.add(btnSair);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(32, 40, 46, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(102, 34, 86, 20);
		contentPane.add(tfNome);
	}
}
