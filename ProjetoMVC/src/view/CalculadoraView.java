package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;

public class CalculadoraView extends JFrame {

	private JPanel contentPane;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField resultado;
	private JButton btnCalcular;
	
	

	public int getNumero1() {
		return Integer.parseInt(numero1.getText());
	}

	
	public int getNumero2() {
		return Integer.parseInt(numero2.getText());
	}


	public void setResultado(int resultado) {
		this.resultado.setText(Integer.toString(resultado));
	}
	
	public void CalculadoraListener(ActionListener eventoBotaoCalcular) {
		btnCalcular.addActionListener(eventoBotaoCalcular);
	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraView frame = new CalculadoraView();
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
	public CalculadoraView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		numero1 = new JTextField();
		numero1.setFont(new Font("Tahoma", Font.BOLD, 18));
		numero1.setBounds(44, 83, 86, 68);
		contentPane.add(numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		numero2.setFont(new Font("Tahoma", Font.BOLD, 18));
		numero2.setColumns(10);
		numero2.setBounds(166, 83, 86, 68);
		contentPane.add(numero2);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(140, 104, 16, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(262, 104, 16, 25);
		contentPane.add(lblNewLabel_1);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		resultado.setColumns(10);
		resultado.setBounds(291, 83, 86, 68);
		contentPane.add(resultado);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnCalcular.setBounds(166, 182, 112, 39);
		contentPane.add(btnCalcular);
	}
}
