package br.com.Openbook.view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Choice;
import java.awt.Button;

public class PainelConsulta extends JPanel {
	private JPanel panel;
	private JTextField textField;
	private JTable table;
	private Choice choice_1;
	private JButton btnDetalhes;
	private JButton btnPesquisar;
	private JScrollPane scrollPane;
	private JButton btnAtualizarInformaes;
	private JButton btnComprar;
	
	
	public PainelConsulta() {
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
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(138, 35, 301, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setIcon(new ImageIcon(PainelConsulta.class.getResource("/imgs/iconsearch.fw.png")));
		btnPesquisar.setBackground(new Color(72, 209, 204));
		btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPesquisar.setBounds(712, 34, 140, 35);
		panel.add(btnPesquisar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 116, 562, 365);
		panel.add(scrollPane);
		
		//nomes das colunas
		String [] colunas = {
			"Codigo",
			"Titulo"
		};
		//caminho para inserir os dados
		//a array pode ser de outro tipo
		Object dados[][] = {};
		
		table = new JTable(dados,colunas);
		scrollPane.setViewportView(table);	
		
		JLabel lblPesquisarPor = new JLabel("Pesquisar por:");
		lblPesquisarPor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPesquisarPor.setBounds(449, 40, 111, 22);
		panel.add(lblPesquisarPor);
		
		choice_1 = new Choice();
		choice_1.setForeground(new Color(105, 105, 105));
		choice_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		choice_1.setBounds(566, 38, 126, 33);
		choice_1.add("Codigo");
		choice_1.add("Nome Livro");
		choice_1.add("Preço");
		choice_1.add("Genero");
		panel.add(choice_1);
		
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
}
