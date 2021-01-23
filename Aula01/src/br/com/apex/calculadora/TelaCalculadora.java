package br.com.apex.calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField display;
	private String operacao;
	private double primeiroValor;
	private double segundoValor;
	private double resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
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
	public TelaCalculadora() {

		setBackground(Color.LIGHT_GRAY);
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 380);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		display = new JTextField();
		display.setFont(new Font("Tahoma", Font.BOLD, 18));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBounds(10, 11, 364, 39);
		contentPane.add(display);
		display.setColumns(10);

		JButton btn_c = new JButton("C");
		btn_c.setForeground(Color.WHITE);
		btn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
			}
		});
		btn_c.setBackground(Color.DARK_GRAY);
		btn_c.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_c.setBounds(108, 60, 82, 51);
		contentPane.add(btn_c);

		JButton btn_backspace = new JButton("<-");
		btn_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!display.getText().isEmpty()) {
					display.setText(display.getText().substring(0, display.getText().length() - 1));
				}
			}
		});
		btn_backspace.setBackground(Color.WHITE);
		btn_backspace.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_backspace.setBounds(200, 60, 82, 51);
		contentPane.add(btn_backspace);

		JButton btn_NegativoPositivo = new JButton("+/-");
		btn_NegativoPositivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (display.getText().contains(".")) {
					double nmro = Double.parseDouble(display.getText());
					nmro = nmro * -1;
					display.setText(Double.toString(nmro));
				} else {
					int nmroInteiro = Integer.parseInt(display.getText());
					nmroInteiro = nmroInteiro * -1;
					display.setText(Integer.toString(nmroInteiro));
				}
			}
		});
		btn_NegativoPositivo.setBackground(Color.WHITE);
		btn_NegativoPositivo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_NegativoPositivo.setBounds(292, 60, 82, 51);
		contentPane.add(btn_NegativoPositivo);

		JButton btn_divisao = new JButton("\u00F7");
		btn_divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = "divisao";

				if (!display.getText().isEmpty()) {
					primeiroValor = Double.parseDouble(display.getText());
				}

				display.setText("");
			}
		});
		btn_divisao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_divisao.setBackground(Color.WHITE);
		btn_divisao.setBounds(292, 113, 82, 51);
		contentPane.add(btn_divisao);

		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "9");
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_9.setBackground(Color.WHITE);
		btn_9.setBounds(200, 113, 82, 51);
		contentPane.add(btn_9);

		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "8");
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_8.setBackground(Color.WHITE);
		btn_8.setBounds(108, 113, 82, 51);
		contentPane.add(btn_8);

		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "7");
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_7.setBackground(Color.WHITE);
		btn_7.setBounds(16, 113, 82, 51);
		contentPane.add(btn_7);

		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "4");
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_4.setBackground(Color.WHITE);
		btn_4.setBounds(16, 167, 82, 51);
		contentPane.add(btn_4);

		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "5");
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_5.setBackground(Color.WHITE);
		btn_5.setBounds(108, 167, 82, 51);
		contentPane.add(btn_5);

		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "6");
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_6.setBackground(Color.WHITE);
		btn_6.setBounds(200, 167, 82, 51);
		contentPane.add(btn_6);

		JButton btn_multiplicacao = new JButton("X");
		btn_multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = "multiplicacao";

				if (!display.getText().isEmpty()) {
					primeiroValor = Double.parseDouble(display.getText());
				}

				display.setText("");

			}
		});
		btn_multiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_multiplicacao.setBackground(Color.WHITE);
		btn_multiplicacao.setBounds(292, 167, 82, 51);
		contentPane.add(btn_multiplicacao);

		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "1");
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_1.setBackground(Color.WHITE);
		btn_1.setBounds(16, 223, 82, 51);
		contentPane.add(btn_1);

		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "2");
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_2.setBackground(Color.WHITE);
		btn_2.setBounds(108, 223, 82, 51);
		contentPane.add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "3");
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_3.setBackground(Color.WHITE);
		btn_3.setBounds(200, 223, 82, 51);
		contentPane.add(btn_3);

		JButton btn_subtracao = new JButton("-");
		btn_subtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = "subtracao";

				if (!display.getText().isEmpty()) {
					primeiroValor = Double.parseDouble(display.getText());
				}

				display.setText("");
			}
		});
		btn_subtracao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_subtracao.setBackground(Color.WHITE);
		btn_subtracao.setBounds(292, 223, 82, 51);
		contentPane.add(btn_subtracao);

		JButton btn_adicao = new JButton("+");
		btn_adicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = "adicao";

				if (!display.getText().isEmpty()) {
					primeiroValor = Double.parseDouble(display.getText());
				}

				display.setText("");
			}
		});
		btn_adicao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_adicao.setBackground(Color.WHITE);
		btn_adicao.setBounds(292, 278, 82, 51);
		contentPane.add(btn_adicao);

		JButton btn_resultado = new JButton("=");
		btn_resultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!operacao.isEmpty()) {
					segundoValor = Double.parseDouble(display.getText());
				}

				switch (operacao) {
				case "adicao":
					resultado = primeiroValor + segundoValor;
					display.setText(Double.toString(resultado));
					break;
				case "subtracao":
					resultado = primeiroValor - segundoValor;
					display.setText(Double.toString(resultado));
					break;
				case "multiplicacao":
					resultado = primeiroValor * segundoValor;
					display.setText(Double.toString(resultado));
					break;
				case "divisao":

					if (segundoValor == 0) {
						display.setText("div by zero");
					} else {

						resultado = primeiroValor / segundoValor;
						display.setText(Double.toString(resultado));
					}
					break;

				}

			}
		});
		btn_resultado.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_resultado.setBackground(Color.WHITE);
		btn_resultado.setBounds(200, 278, 82, 51);
		contentPane.add(btn_resultado);

		JButton btn_ponto = new JButton(".");
		btn_ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (display.getText().contains(".")) {

				} else {
					display.setText(display.getText() + ".");
				}
			}
		});
		btn_ponto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_ponto.setBackground(Color.WHITE);
		btn_ponto.setBounds(108, 278, 82, 51);
		contentPane.add(btn_ponto);

		JButton btn_zero = new JButton("0");
		btn_zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "0");
			}
		});
		btn_zero.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_zero.setBackground(Color.WHITE);
		btn_zero.setBounds(16, 278, 82, 51);
		contentPane.add(btn_zero);
	}
}
