package br.com.Openbook.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.SystemColor;

public class PrincipalJF extends JFrame	{
	
	private JMenuBar menuBar;
	private JMenu mnArquivo;
	private JMenuItem mntmSair;
	private JMenu mnCadastro;
	private JMenuItem mntmNovoProduto;
	private JMenuItem mntmNovoCliente;
	private JMenu mnProdutos;
	private JMenuItem mntmEstoque;
	private JMenuItem mntmConsultar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNovaVenda;
	private JMenuItem mntmHistorico;


	public PrincipalJF()	{
		super("Tela Principal");
		
		Container container = getContentPane();
		
		container.setBackground(Color.WHITE);
		
		JTabbedPane abas = new JTabbedPane();
		abas.setBackground(new Color(233, 150, 122));
		abas.add("Home", new PainelHome());
		abas.add("Vendas",new PanelVendas());
		abas.add("Consultar Livro",new PainelConsulta());
		abas.add("Historico", new PanelHistorico());
		container.add(abas);
		
		
		menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(new Color(255, 165, 0));
		setJMenuBar(menuBar);
		
		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setForeground(new Color(25, 25, 112));
		menuBar.add(mnArquivo);
		
		mntmSair = new JMenuItem("Sair");
		mntmSair.setBackground(Color.ORANGE);
		mnArquivo.add(mntmSair);
		
		mnCadastro = new JMenu("Cadastro");
		mnCadastro.setForeground(new Color(25, 25, 112));
		menuBar.add(mnCadastro);
		
		mntmNovoProduto = new JMenuItem("Novo produto");
		mntmNovoProduto.setBackground(Color.ORANGE);
		mnCadastro.add(mntmNovoProduto);
		
		mntmNovoCliente = new JMenuItem("Novo cliente");
		mntmNovoCliente.setBackground(Color.ORANGE);
		mnCadastro.add(mntmNovoCliente);
		
		mnProdutos = new JMenu("Livros");
		mnProdutos.setForeground(new Color(25, 25, 112));
		menuBar.add(mnProdutos);
		
		mntmEstoque = new JMenuItem("Estoque");
		mntmEstoque.setBackground(Color.ORANGE);
		mnProdutos.add(mntmEstoque);
		
		mntmConsultar = new JMenuItem("Consultar");
		mnProdutos.add(mntmConsultar);
		
		mnNewMenu = new JMenu("Vendas");
		mnNewMenu.setForeground(new Color(25, 25, 112));
		menuBar.add(mnNewMenu);
		
		mntmNovaVenda = new JMenuItem("Nova venda");
		mntmNovaVenda.setBackground(Color.ORANGE);
		mnNewMenu.add(mntmNovaVenda);
		
		mntmHistorico = new JMenuItem("Historico de vendas");
		mntmHistorico.setBackground(Color.ORANGE);
		mnNewMenu.add(mntmHistorico);
		
		setLocation(250,100);
		setSize(880,600);
	}
	
	
	public static void main(String args[])	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			//LOG.error(e.getMessage());
		}
		new PrincipalJF().setVisible(true);
	}
}
