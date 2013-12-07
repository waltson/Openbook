package br.com.Openbook.view;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;
import org.w3c.dom.CDATASection;

import br.com.Openbook.controller.CCadastroCliente;
import br.com.Openbook.negocio.Cliente;
import br.com.Openbook.negocio.UtilGui;

public class PainelConsultaCliente<eventos> extends JPanel {

	private static Logger Log = Logger.getLogger(PainelConsulta.class);
	private JPanel panel;
	private JTextField jtfClienteInfo;
	private JTable jtCliente;
	private Choice cbCriterio;
	private JButton btnDetalhes;
	private JButton btnPesquisar;
	private JScrollPane scrollPane;
	private JButton btnAtualizarInformaes;
	private JButton btnComprar;
	private CCadastroCliente controle;

	private TratadorEventoCliente eventos;

	public void init() {
		eventos = new TratadorEventoCliente();
	}

	public PainelConsultaCliente() {

		init();
		panel = new JPanel();
		panel.setBackground(new Color(255, 218, 185));
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Consultar Cliente"));
		panel.setBounds(0, 0, 862, 519);
		add(panel);
		panel.setLayout(null);

		JLabel lblPesquisarCliente = new JLabel("Pesquisar Cliente:");
		lblPesquisarCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesquisarCliente.setBounds(10, 35, 118, 33);
		panel.add(lblPesquisarCliente);

		jtfClienteInfo = new JTextField();
		jtfClienteInfo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtfClienteInfo.setBounds(138, 35, 301, 33);
		panel.add(jtfClienteInfo);
		jtfClienteInfo.setColumns(10);

		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setIcon(new ImageIcon(PainelConsulta.class
				.getResource("/imgs/iconsearch.fw.png")));
		btnPesquisar.setBackground(new Color(72, 209, 204));
		btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPesquisar.setBounds(712, 34, 140, 35);
		btnPesquisar.addActionListener(eventos);
		panel.add(btnPesquisar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 116, 562, 365);
		panel.add(scrollPane);

		// nomes das colunas
		String[] colunas = Cliente.getColunas();
		// caminho para inserir os dados
		// a array pode ser de outro tipo
		Object dados[][] = {};

		jtCliente = new JTable(dados, colunas);
		scrollPane.setViewportView(jtCliente);

		JLabel lblPesquisarPor = new JLabel("Pesquisar por:");
		lblPesquisarPor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesquisarPor.setBounds(449, 40, 111, 22);
		panel.add(lblPesquisarPor);

		cbCriterio = new Choice();
		cbCriterio.setForeground(new Color(105, 105, 105));
		cbCriterio.setFont(new Font("Dialog", Font.PLAIN, 18));
		cbCriterio.setBounds(566, 38, 126, 33);
		cbCriterio.add("Codigo");
		cbCriterio.add("Nome Cliente");
		cbCriterio.add("Endereço");
		cbCriterio.add("Bairro");
		cbCriterio.add("cidade");
		cbCriterio.add("Estado");
		cbCriterio.add("Cep");
		cbCriterio.add("Telefone");
		cbCriterio.add("Cpf");
		cbCriterio.add("Sexo");
		panel.add(cbCriterio);

		btnDetalhes = new JButton("Detalhes");
		btnDetalhes.setForeground(new Color(0, 128, 128));
		btnDetalhes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDetalhes.setBounds(603, 179, 207, 54);
		panel.add(btnDetalhes);

		btnAtualizarInformaes = new JButton("Atualizar Informa\u00E7\u00F5es");
		btnAtualizarInformaes.setForeground(new Color(0, 128, 128));
		btnAtualizarInformaes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAtualizarInformaes.setBounds(603, 286, 207, 54);
		panel.add(btnAtualizarInformaes);

		btnComprar = new JButton("Comprar");
		btnComprar.setForeground(new Color(0, 139, 139));
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnComprar.setBounds(603, 389, 207, 54);
		panel.add(btnComprar);

	}

	public void setControle(CCadastroCliente controle) {
		this.controle = controle;
	}

	private class TratadorEventoCliente implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (e.getSource() == btnPesquisar
					&& !jtfClienteInfo.getText().equals("")) {

				DefaultTableModel model = null;
				String criterioValor = jtfClienteInfo.getText();
				String criterio = cbCriterio.getSelectedItem().toString();
				;

				if (criterio.equals("Codigo")) {
					model = controle.procurarCliente("id_cliente",
							criterioValor, false);
				} else if (criterio.equals("Nome Cliente")) {
					model = controle.procurarCliente("nome_cliente",
							criterioValor, true);
				} else if (criterio.equals("Endereço")) {
					model = controle.procurarCliente("endereco_cliente",
							criterioValor, false);
				} else if (criterio.equals("Bairro")) {
					model = controle.procurarCliente("bairro_cliente",
							criterioValor, true);

				} else if (criterio.equals("cidade")) {
					model = controle.procurarCliente("cidade_cliente",
							criterioValor, false);
				} else if (criterio.equals("Estado")) {
					model = controle.procurarCliente("estado_cliente",
							criterioValor, true);
				} else if (criterio.equals("Cep")) {
					model = controle.procurarCliente("cep_cliente",
							criterioValor, false);

				} else if (criterio.equals("Telefone")) {
					model = controle.procurarCliente("telefone_cliente",
							criterioValor, true);

				} else if (criterio.equals("Cpf")) {
					model = controle.procurarCliente("cpf_cliente",
							criterioValor, false);

				} else if (criterio.equals("Sexo")) {
					model = controle.procurarCliente("sexo_cliente",
							criterioValor, true);
				}

				if (model != null) {
					jtCliente.setModel(model);
				} else {
					Log.error("Cliente com " + criterio + " = " + criterioValor
							+ " não foi encontrado");
					UtilGui.errorMessage("Cliente com " + criterio + " = "
							+ criterioValor + " não foi encontrado");
				}

			}
		}
	}
}