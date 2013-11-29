package br.com.Openbook.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class PanelHistorico extends JPanel	{
	
	private JPanel panel;
	private JTextField tfPesquisa;
	private final JButton btnProcurar = new JButton("Procurar");
	private JScrollPane scrollPane;
	private JTable table;
	private Choice chTipoPesquisa;
	
	public PanelHistorico() {
		panel = new JPanel();		
		panel.setBackground(new Color(255, 218, 185));
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Consultar livro"));
		panel.setBounds(0, 0, 862, 519);
		add(panel);
		panel.setLayout(null);
		
		chTipoPesquisa = new Choice();
		chTipoPesquisa.setForeground(new Color(0, 139, 139));
		chTipoPesquisa.setFont(new Font("Dialog", Font.PLAIN, 16));
		chTipoPesquisa.setBounds(23, 38, 131, 20);
		chTipoPesquisa.add("Cliente");
		chTipoPesquisa.add("Vendas");
		chTipoPesquisa.add("Transações");
		chTipoPesquisa.add("Cacastros");
		chTipoPesquisa.add("Codigo");
		panel.add(chTipoPesquisa);
		
		tfPesquisa = new JTextField();
		tfPesquisa.setBounds(192, 38, 446, 27);
		panel.add(tfPesquisa);
		tfPesquisa.setColumns(10);
		btnProcurar.setIcon(new ImageIcon(PanelHistorico.class.getResource("/imgs/iconsearch.fw.png")));
		btnProcurar.setForeground(new Color(0, 139, 139));
		btnProcurar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnProcurar.setBounds(703, 38, 131, 31);
		panel.add(btnProcurar);
		
		String colunas[] = 	{
				"Codigo",
				"Titulo",
				"Nome"
		};
		String dados[][] = 	{
			//informações aqui	
		};
		table = new JTable(dados,colunas);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(23, 111, 811, 397);
		panel.add(scrollPane);
		
		setSize(862, 519);
	}	
}
