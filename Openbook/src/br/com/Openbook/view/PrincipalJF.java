package br.com.Openbook.view;


import java.awt.Container;
import java.awt.Point;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PrincipalJF extends JFrame	{
	
	public PrincipalJF()	{
		super("Tela Principal");
		
		Container container = getContentPane();
		
		container.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PrincipalJF.class.getResource("/imgs/logomin.fw.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(740)
					.addComponent(lblNewLabel))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(467)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
		);
		getContentPane().setLayout(groupLayout);
		setVisible(true);
		setSize(880,600);
		setLocation(new Point(300, 100));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 165, 0));
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.setForeground(Color.WHITE);
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.setBackground(Color.ORANGE);
		mnArquivo.add(mntmSalvar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setBackground(Color.ORANGE);
		mnArquivo.add(mntmSair);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		mnCadastro.setForeground(Color.WHITE);
		menuBar.add(mnCadastro);
		
		JMenuItem mntmNovoProduto = new JMenuItem("Novo produto");
		mntmNovoProduto.setBackground(Color.ORANGE);
		mnCadastro.add(mntmNovoProduto);
		
		JMenuItem mntmNovoCliente = new JMenuItem("Novo cliente");
		mntmNovoCliente.setBackground(Color.ORANGE);
		mnCadastro.add(mntmNovoCliente);
		
		JMenu mnProdutos = new JMenu("Produtos");
		mnProdutos.setForeground(Color.WHITE);
		menuBar.add(mnProdutos);
		
		JMenuItem mntmPesquisarLivros = new JMenuItem("Pesquisar produto");
		mntmPesquisarLivros.setBackground(Color.ORANGE);
		mnProdutos.add(mntmPesquisarLivros);
		
		JMenuItem mntmEstoque = new JMenuItem("Estoque");
		mntmEstoque.setBackground(Color.ORANGE);
		mnProdutos.add(mntmEstoque);
		
		JMenuItem mntmPreos = new JMenuItem("Pre\u00E7os");
		mntmPreos.setBackground(Color.ORANGE);
		mnProdutos.add(mntmPreos);
		
		JMenu mnNewMenu = new JMenu("Vendas");
		mnNewMenu.setForeground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNovaVenda = new JMenuItem("Nova venda");
		mntmNovaVenda.setBackground(Color.ORANGE);
		mnNewMenu.add(mntmNovaVenda);
		
		JMenuItem mntmHistorico = new JMenuItem("Historico");
		mntmHistorico.setBackground(Color.ORANGE);
		mnNewMenu.add(mntmHistorico);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setForeground(Color.WHITE);
		menuBar.add(mnClientes);
		
		JMenuItem mntmPesquisarCliente = new JMenuItem("Pesquisar cliente");
		mntmPesquisarCliente.setBackground(Color.ORANGE);
		mnClientes.add(mntmPesquisarCliente);
		
	}
	
	
	public static void main(String args[])	{
		new PrincipalJF();
	}
}
