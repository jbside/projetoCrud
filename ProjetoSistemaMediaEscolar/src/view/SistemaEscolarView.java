package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class SistemaEscolarView extends JFrame {

	private JPanel contentPane;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;
	private JTextField nota4;
	JButton btnCalcularSituacao;
	JLabel situacao;
	
	
	

	public double getNota1() {
		return Double.parseDouble(nota1.getText());
	}

	public double getNota2() {
		return Double.parseDouble(nota2.getText());
	}

	public double getNota3() {
		return Double.parseDouble(nota3.getText());
	}

	public double getNota4() {
		return Double.parseDouble(nota4.getText());
	}
	
	public void SistemaEscolarListener(ActionListener eventoBotaoMedia) {
		btnCalcularSituacao.addActionListener(eventoBotaoMedia);
	}
	


	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaEscolarView frame = new SistemaEscolarView();
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
	public SistemaEscolarView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Digite as notas do aluno:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(86, 29, 258, 32);
		contentPane.add(lblNewLabel);
		
		nota1 = new JTextField();
		nota1.setBounds(84, 91, 55, 32);
		contentPane.add(nota1);
		nota1.setColumns(10);
		
		nota2 = new JTextField();
		nota2.setColumns(10);
		nota2.setBounds(148, 91, 55, 32);
		contentPane.add(nota2);
		
		nota3 = new JTextField();
		nota3.setColumns(10);
		nota3.setBounds(213, 91, 55, 32);
		contentPane.add(nota3);
		
		nota4 = new JTextField();
		nota4.setColumns(10);
		nota4.setBounds(278, 91, 55, 32);
		contentPane.add(nota4);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1");
		lblNewLabel_1.setBounds(94, 134, 45, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nota 2");
		lblNewLabel_1_1.setBounds(158, 134, 45, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nota 3");
		lblNewLabel_1_1_1.setBounds(223, 134, 45, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nota 4");
		lblNewLabel_1_1_1_1.setBounds(288, 134, 45, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		btnCalcularSituacao = new JButton("CALCULAR SITUA\u00C7\u00C3O");
		btnCalcularSituacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcularSituacao.setBounds(115, 159, 194, 38);
		contentPane.add(btnCalcularSituacao);
		
		situacao = new JLabel("");
		situacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		situacao.setBounds(158, 220, 101, 30);
		contentPane.add(situacao);
	}

}
