package br.com.Openbook.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.MaskFormatter;

import org.apache.log4j.Logger;

import br.com.Openbook.controller.CCadastroCliente;
import br.com.Openbook.negocio.Cliente;
import br.com.Openbook.negocio.Estados;
import br.com.Openbook.negocio.UtilGui;

import java.awt.Color;

public class CadastroDeClientes extends JDialog {

	private static Logger Log = Logger.getLogger(CadastroDeClientes.class);

	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfCep;
	private JTextField tfTelCel;

	private JButton btnSalvar;
	private JButton btnCancelar;
	private JPanel painel_centro;
	private JComboBox cbEstado;
	private JTextField tfCPF;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnMasculino;
	private CCadastroCliente controle;

	public CadastroDeClientes() {
		ButtonHandler buttonHandler = new ButtonHandler();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setResizable(false);
		setSize(536, 358);
		setLocationRelativeTo(null);
		setTitle("Cadastro de Clientes");
		getContentPane().setLayout(new BorderLayout(0, 0));

		JLabel lblCadastroDeClientes = new JLabel("Cadastro de Clientes");
		lblCadastroDeClientes.setBackground(new Color(255, 127, 80));
		lblCadastroDeClientes.setIcon(new ImageIcon(CadastroDeClientes.class
				.getResource("/imgs/iconnewuser.png")));

		getContentPane().add(lblCadastroDeClientes, BorderLayout.NORTH);

		JPanel painel_inferior = new JPanel();
		painel_inferior.setBackground(new Color(255, 140, 0));
		getContentPane().add(painel_inferior, BorderLayout.SOUTH);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(CadastroDeClientes.class
				.getResource("/imgs/iconok.fw.png")));
		btnSalvar.addActionListener(buttonHandler);
		painel_inferior.add(btnSalvar);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		painel_inferior.add(horizontalStrut);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(CadastroDeClientes.class
				.getResource("/imgs/iconcancel.fw.png")));
		btnCancelar.addActionListener(buttonHandler);
		painel_inferior.add(btnCancelar);

		painel_centro = new JPanel();
		painel_centro.setBackground(new Color(244, 164, 96));
		getContentPane().add(painel_centro, BorderLayout.CENTER);
		painel_centro.setLayout(null);
		painel_centro.setBorder(BorderFactory
				.createTitledBorder("Dados Pessoais"));

		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(10, 65, 58, 14);
		painel_centro.add(lblEndereco);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 32, 58, 14);
		painel_centro.add(lblNome);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 131, 58, 14);
		painel_centro.add(lblBairro);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(222, 131, 57, 14);
		painel_centro.add(lblCidade);

		tfNome = new JTextField();
		tfNome.setBounds(75, 32, 445, 20);
		painel_centro.add(tfNome);
		tfNome.setColumns(10);

		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(75, 66, 445, 20);
		painel_centro.add(tfEndereco);

		tfBairro = new JTextField();
		tfBairro.setColumns(10);
		tfBairro.setBounds(75, 134, 144, 20);
		painel_centro.add(tfBairro);

		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		tfCidade.setBounds(269, 131, 102, 20);
		painel_centro.add(tfCidade);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(375, 131, 48, 14);
		painel_centro.add(lblEstado);
		/** @TODO Colocar genérico */
		cbEstado = new JComboBox(Estados.values());

		cbEstado.setBounds(420, 128, 100, 20);
		painel_centro.add(cbEstado);

		JLabel lblCep = new JLabel("Cep:");
		lblCep.setBounds(10, 169, 58, 14);
		painel_centro.add(lblCep);

		tfCep = new JTextField();
		tfCep.setColumns(10);
		tfCep.setBounds(75, 168, 144, 20);
		painel_centro.add(tfCep);

		JLabel lblTelefone = new JLabel("Tel/Cel:");
		lblTelefone.setBounds(222, 169, 57, 14);
		painel_centro.add(lblTelefone);

		tfTelCel = new JTextField();
		tfTelCel.setColumns(10);
		tfTelCel.setBounds(269, 166, 102, 20);
		painel_centro.add(tfTelCel);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 98, 58, 14);
		painel_centro.add(lblCpf);

		tfCPF = new JTextField();
		tfCPF.setColumns(10);
		tfCPF.setBounds(75, 100, 144, 20);
		painel_centro.add(tfCPF);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(222, 97, 41, 14);
		painel_centro.add(lblSexo);

		rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBackground(new Color(244, 164, 96));
		rdbtnFeminino.setBounds(363, 93, 80, 23);
		painel_centro.add(rdbtnFeminino);

		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBackground(new Color(244, 164, 96));
		rdbtnMasculino.setBounds(267, 93, 109, 23);
		rdbtnMasculino.setSelected(true);
		painel_centro.add(rdbtnMasculino);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnFeminino);
		bg.add(rdbtnMasculino);

	}

	public void setControle(CCadastroCliente controle) {
		this.controle = controle;
	}

	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnSalvar) {
				/***
				 * @TODO 1 - Validar os campos antes de criar o objeto cliente 2
				 *       - Checar se a conversão String/Inteiro são válidas (CEP
				 *       e TEL)
				 ***/
				Cliente cliente = new Cliente();
				// <<<<<<< HEAD

				if (rdbtnFeminino.isSelected() == true) {
					cliente.setSexo("Feminino");
				} else if (rdbtnMasculino.isSelected() == true) {
					cliente.setSexo("Masculino");
				}
				// =======
				cliente.setNome(tfNome.getText());
				cliente.setEndereco(tfEndereco.getText());
				cliente.setBairro(tfBairro.getText());
				cliente.setCidade(tfCidade.getText());
				cliente.setEstado(Estados.valueOf(cbEstado.getSelectedItem()
						.toString()));
				cliente.setCpf(tfCPF.getText());
				cliente.setCep(tfCep.getText());
				cliente.setTel(tfTelCel.getText());

				if (rdbtnFeminino.isSelected() == true) {
					cliente.setSexo("Feminino");
				} else if (rdbtnMasculino.isSelected() == true) {
					cliente.setSexo("Masculino");

				}
				if (controle.cadastrarCliente(cliente)) {
					UtilGui.successMessage("Cliente Cadastrado!");
					dispose();

				}

			} else if (e.getSource() == btnCancelar) {
				dispose();
				// >>>>>>> branch 'master' of
				// https://github.com/waltson/Openbook.git

			}
		}
	}

	@Deprecated
	public void preencherCampos() {
		tfNome.setText("Waltson");
		tfEndereco.setText("RUA");
		tfBairro.setText("RUa");
		tfCep.setText(" 888844");
		tfCidade.setText("cidade");
		tfCPF.setText("13425456");
		tfTelCel.setText("11111111");

	}

	// @Teste #Remover na versão final
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadastroDeClientes cadastro = new CadastroDeClientes();
		cadastro.setControle(new CCadastroCliente());
		cadastro.setVisible(true);
		cadastro.preencherCampos();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			Log.error(e.getMessage());

		}

	}
}
