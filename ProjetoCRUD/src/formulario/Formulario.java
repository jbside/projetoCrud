package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import conexao.Conexao;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField textCod;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setTitle("Formul\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("5dlu"),
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("max(15dlu;default)"),
				RowSpec.decode("default:grow"),}));

		JPanel camposTexto = new JPanel();
		contentPane.add(camposTexto, "1, 1, fill, fill");
		camposTexto.setLayout(new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("30dlu"), FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
						ColumnSpec.decode("150dlu"), },
				new RowSpec[] { FormSpecs.DEFAULT_ROWSPEC, RowSpec.decode("5dlu"), FormSpecs.DEFAULT_ROWSPEC, }));

		JLabel lblNewLabel = new JLabel("Nome: ");
		camposTexto.add(lblNewLabel, "3, 1, right, default");

		txtNome = new JTextField();
		camposTexto.add(txtNome, "4, 1, fill, default");
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo: ");
		camposTexto.add(lblNewLabel_1, "3, 3, right, default");

		textCod = new JTextField();
		textCod.setEditable(false);
		textCod.setEnabled(false);
		camposTexto.add(textCod, "4, 3, fill, default");
		textCod.setColumns(10);

		JPanel botoes = new JPanel();
		contentPane.add(botoes, "1, 3, fill, fill");
		botoes.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("18dlu"),
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.MIN_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.DEFAULT_ROWSPEC,}));

		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				if (nome.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor informe um nome válido");
				} else {

					try {
						Conexao conexao = new Conexao();
						String sql = "insert into usuarios (nomeusuario) values (?)";
						PreparedStatement pstmt = conexao.conectar().prepareStatement(sql);
						pstmt.setString(1, nome);
						pstmt.execute();
						JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
					} catch (Exception erro) {
						JOptionPane.showMessageDialog(null, "Falha ao cadastrar cliente");
						System.out.println(erro.getMessage());
					}

					table.setModel(listarDados());
					txtNome.setText("");
				}
			}
		});
		botoes.add(btnCadastrar, "2, 1");

		JButton btnAlterar = new JButton("ALTERAR");
		botoes.add(btnAlterar, "5, 1");

		JButton btnExcluir = new JButton("EXCLUIR");
		botoes.add(btnExcluir, "8, 1");

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				int linhaSelecionada = table.getSelectedRow();
				table.getSelectionModel().removeSelectionInterval(linhaSelecionada,0);
				
			}
		});
		botoes.add(btnCancelar, "11, 1");
		
		btnCadastrar.setEnabled(true);
		btnAlterar.setEnabled(false);
		btnExcluir.setEnabled(false);
		btnCancelar.setEnabled(false);
		
		JLabel contador = new JLabel("(0/0)");
		contador.setVerticalAlignment(SwingConstants.TOP);
		contador.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(contador, "1, 4");

		JPanel scrool = new JPanel();
		contentPane.add(scrool, "1, 5, fill, fill");

		JScrollPane scrollPane = new JScrollPane();
		scrool.add(scrollPane);

		table = new JTable();
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int linhaSelecionada = table.getSelectedRow();
				textCod.setText(table.getValueAt(linhaSelecionada, 0).toString());
				txtNome.setText(table.getValueAt(linhaSelecionada, 1).toString());
				contador.setText("("+(linhaSelecionada+1)+"/"+table.getRowCount()+")");
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);
			};
		});
		table.setModel(listarDados());
		table.setRowSelectionInterval(0,0);
		int linhaSelecionada = table.getSelectedRow();
		contador.setText("("+(linhaSelecionada+1)+"/"+table.getRowCount()+")");
		scrollPane.setViewportView(table);
	}

	private static DefaultTableModel listarDados() {

		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("Código");
		dados.addColumn("Nome");

		try {
			Conexao conexao = new Conexao();
			String sql = "select * from clientes";

			Statement stmt = conexao.conectar().createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				dados.addRow(new Object[] { rs.getInt(1), rs.getString(2) });
			}

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Não foi possível carregar os dados da tabela");
		}
		return dados;

	}

}
