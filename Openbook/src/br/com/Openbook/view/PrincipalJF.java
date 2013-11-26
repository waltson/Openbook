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
	
	public PrincipalJF()	{
		super("Tela Principal");
		
		Container container = getContentPane();
		
		container.setBackground(Color.WHITE);
		
		JTabbedPane abas = new JTabbedPane();
		abas.setBackground(new Color(233, 150, 122));
		abas.add("Vendas",new PanelVendas());
		abas.add("Consultar Livro",new PainelConsulta());
		abas.add("Historico", new PanelHistorico());
		container.add(abas);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(new Color(255, 165, 0));
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.setForeground(new Color(25, 25, 112));
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.setBackground(Color.ORANGE);
		mnArquivo.add(mntmSalvar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setBackground(Color.ORANGE);
		mnArquivo.add(mntmSair);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		mnCadastro.setForeground(new Color(25, 25, 112));
		menuBar.add(mnCadastro);
		
		JMenuItem mntmNovoProduto = new JMenuItem("Novo produto");
		mntmNovoProduto.setBackground(Color.ORANGE);
		mnCadastro.add(mntmNovoProduto);
		
		JMenuItem mntmNovoCliente = new JMenuItem("Novo cliente");
		mntmNovoCliente.setBackground(Color.ORANGE);
		mnCadastro.add(mntmNovoCliente);
		
		JMenu mnProdutos = new JMenu("Livros");
		mnProdutos.setForeground(new Color(25, 25, 112));
		menuBar.add(mnProdutos);
		
		JMenuItem mntmEstoque = new JMenuItem("Estoque");
		mntmEstoque.setBackground(Color.ORANGE);
		mnProdutos.add(mntmEstoque);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mnProdutos.add(mntmConsultar);
		
		JMenu mnNewMenu = new JMenu("Vendas");
		mnNewMenu.setForeground(new Color(25, 25, 112));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNovaVenda = new JMenuItem("Nova venda");
		mntmNovaVenda.setBackground(Color.ORANGE);
		mnNewMenu.add(mntmNovaVenda);
		
		JMenuItem mntmHistorico = new JMenuItem("Historico de vendas");
		mntmHistorico.setBackground(Color.ORANGE);
		mnNewMenu.add(mntmHistorico);
		
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
