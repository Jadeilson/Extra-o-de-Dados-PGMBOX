package br.com.extracaoDadosPgmbox;


import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class CadastroTeste {

	private JFrame frmExtraoDeDados;
	private JTextField textUsuario;
	private JTextField textStatusConexao;
	private JPasswordField passwordField;
	private JTextField textOrientacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroTeste window = new CadastroTeste();
					window.frmExtraoDeDados.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public CadastroTeste() throws SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		frmExtraoDeDados = new JFrame();
		frmExtraoDeDados.setAlwaysOnTop(true);
		frmExtraoDeDados.setTitle("Extra\u00E7\u00E3o de Dados - PGMBOX");
		frmExtraoDeDados.setBounds(100, 100, 400, 423);
		frmExtraoDeDados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExtraoDeDados.getContentPane().setLayout(null);

		
		JLabel lblUser = new JLabel("Usu\u00E1rio");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setBounds(140, 80, 100, 14);
		frmExtraoDeDados.getContentPane().add(lblUser);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setBounds(274, 80, 100, 14);
		frmExtraoDeDados.getContentPane().add(lblSenha);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBase.setHorizontalAlignment(SwingConstants.CENTER);
		lblBase.setBounds(6, 80, 100, 14);
		frmExtraoDeDados.getContentPane().add(lblBase);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(140, 105, 100, 20);
		frmExtraoDeDados.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Component frame = null;
				JOptionPane.showMessageDialog((Component) frame, "TESTE de Mensagem");
			}
		});
		
		
		btnConectar.setBounds(6, 145, 180, 20);
		frmExtraoDeDados.getContentPane().add(btnConectar);
		
		textStatusConexao = new JTextField();
		textStatusConexao.setToolTipText("");
		textStatusConexao.setHorizontalAlignment(SwingConstants.CENTER);
		textStatusConexao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textStatusConexao.setEditable(false);
		textStatusConexao.setForeground(Color.GREEN);
		textStatusConexao.setText("Conectado");
		textStatusConexao.setBounds(6, 185, 368, 20);
		frmExtraoDeDados.getContentPane().add(textStatusConexao);
		textStatusConexao.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(274, 105, 100, 20);
		frmExtraoDeDados.getContentPane().add(passwordField);
		
		JButton btnDesconectar = new JButton("Desconectar");
		btnDesconectar.setBounds(194, 145, 180, 20);
		frmExtraoDeDados.getContentPane().add(btnDesconectar);
		btnDesconectar.setEnabled(false);
		
		JRadioButton rdbtnTodosOsDados = new JRadioButton("Todos os Dados");
		rdbtnTodosOsDados.setBounds(6, 222, 368, 23);
		frmExtraoDeDados.getContentPane().add(rdbtnTodosOsDados);
		rdbtnTodosOsDados.setEnabled(false);
		
		JButton btnExtrair = new JButton("Iniciar Extra\u00E7\u00E3o");
		btnExtrair.setBounds(6, 354, 140, 23);
		frmExtraoDeDados.getContentPane().add(btnExtrair);
		btnExtrair.setEnabled(false);
		
		JRadioButton rdbtnSemCorresponsavel = new JRadioButton("Sem dados de Corresponsavel");
		rdbtnSemCorresponsavel.setBounds(6, 274, 368, 23);
		frmExtraoDeDados.getContentPane().add(rdbtnSemCorresponsavel);
		rdbtnSemCorresponsavel.setEnabled(false);
		
		JRadioButton rdbtnSemComposicao = new JRadioButton("Sem Composi\u00E7\u00E3o para j\u00E1 ajuizadas (FlAjuizada = 'S')");
		rdbtnSemComposicao.setBounds(6, 248, 368, 23);
		frmExtraoDeDados.getContentPane().add(rdbtnSemComposicao);
		rdbtnSemComposicao.setEnabled(false);
		
		JRadioButton rdbtnSemParcelamentos = new JRadioButton("Sem dados de Parcelamento");
		rdbtnSemParcelamentos.setBounds(6, 300, 368, 23);
		frmExtraoDeDados.getContentPane().add(rdbtnSemParcelamentos);
		rdbtnSemParcelamentos.setEnabled(false);
		
		JRadioButton rdbtnApenasParceladas = new JRadioButton("Apenas CDA's Parceladas");
		rdbtnApenasParceladas.setBounds(6, 324, 368, 23);
		frmExtraoDeDados.getContentPane().add(rdbtnApenasParceladas);
		rdbtnApenasParceladas.setEnabled(false);
		
		JSlider slider = new JSlider();
		slider.setValue(75);
		slider.setEnabled(false);
		slider.setBounds(156, 354, 175, 23);
		frmExtraoDeDados.getContentPane().add(slider);
		
		
		JTextPane textPorcentagem = new JTextPane();
		textPorcentagem.setEditable(false);
		textPorcentagem.setBounds(332, 354, 42, 23);
		frmExtraoDeDados.getContentPane().add(textPorcentagem);
		
		textOrientacao = new JTextField();
		textOrientacao.setText("Teste Orienta\u00E7\u00E3o");
		textOrientacao.setEditable(false);
		textOrientacao.setBounds(6, 11, 368, 58);
		frmExtraoDeDados.getContentPane().add(textOrientacao);
		textOrientacao.setColumns(10);
		
		JComboBox comboBoxBase = new JComboBox();
		comboBoxBase.setModel(new DefaultComboBoxModel(new String[] {"PGMP0001", "PGMP0002", "PGMP0003", "PGMP0004", "PGMP0005", "PGMP0006", "PGMP0007", "PGMP0008"}));
		
		
		comboBoxBase.setBounds(6, 105, 100, 20);
		frmExtraoDeDados.getContentPane().add(comboBoxBase);
	}
}
