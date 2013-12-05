package br.com.Openbook.view;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

import br.com.Openbook.controller.CCadastroLivro;
import br.com.Openbook.negocio.Livro;
import br.com.Openbook.negocio.UtilGui;

public class PainelConsulta extends JPanel {

	private static Logger Log = Logger.getLogger(PainelConsulta.class);
	private JPanel panel;
	private JTextField jtfLivroInfo;
	private JTable jtLivro;
	private Choice cbCriterio;
	private JButton btnDetalhes;
	private JButton btnPesquisar;
	private JScrollPane scrollPane;
	private JButton btnAtualizarInformaes;
	private JButton btnComprar;
	private CCadastroLivro controle;

	private TratadorEvento eventos;
	
	public void init(){
		 eventos = new TratadorEvento();
	}
	public PainelConsulta() {
	
		init();
		panel = new JPanel();
		panel.setBackground(new Color(255, 218, 185));
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Consultar livro"));
		panel.setBounds(0, 0, 862, 519);
		add(panel);
		panel.setLayout(null);

		JLabel lblPesquisarLivro = new JLabel("Pesquisar Livro:");
		lblPesquisarLivro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesquisarLivro.setBounds(10, 35, 118, 33);
		panel.add(lblPesquisarLivro);

		jtfLivroInfo = new JTextField();
		jtfLivroInfo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtfLivroInfo.setBounds(138, 35, 301, 33);
		panel.add(jtfLivroInfo);
		jtfLivroInfo.setColumns(10);

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
		String[] colunas = Livro.getColunas();
		// caminho para inserir os dados
		// a array pode ser de outro tipo
		Object dados[][] = {};

		jtLivro = new JTable(dados, colunas);
		scrollPane.setViewportView(jtLivro);

		JLabel lblPesquisarPor = new JLabel("Pesquisar por:");
		lblPesquisarPor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesquisarPor.setBounds(449, 40, 111, 22);
		panel.add(lblPesquisarPor);

		cbCriterio = new Choice();
		cbCriterio.setForeground(new Color(105, 105, 105));
		cbCriterio.setFont(new Font("Dialog", Font.PLAIN, 18));
		cbCriterio.setBounds(566, 38, 126, 33);
		cbCriterio.add("Codigo");
		cbCriterio.add("Nome Livro");
		cbCriterio.add("Preço");
		cbCriterio.add("Genero");
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

	public void setControle(CCadastroLivro controle) {
		this.controle = controle;
	}

	private class TratadorEvento implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnPesquisar && !jtfLivroInfo.getText().equals("")) {

				DefaultTableModel model = null;
				String criterioValor = jtfLivroInfo.getText();
				String criterio = cbCriterio.getSelectedItem().toString(); ;
				
				
				if (criterio.equals("Codigo")) {
					 model = controle.procurarLivro("id_livro", criterioValor, false);
				}else if (criterio.equals("Nome Livro")) {
					model = controle.procurarLivro("nome_livro", criterioValor, true);
				}else if (criterio.equals("Preço")) {
					model = controle.procurarLivro("preco_livro", criterioValor, false);
				}else if (criterio.equals("Genero")) {
					model = controle.procurarLivro("genero_livro", criterioValor, true);
				}
				
				if (model != null) {
					jtLivro.setModel(model);
				} else {
					Log.error("Livro com "+criterio+" = " + criterioValor + " não foi encontrado");
					UtilGui.errorMessage("Livro com "+criterio+" = " + criterioValor + " não foi encontrado");
				}
				

			}

		}
	}

}
