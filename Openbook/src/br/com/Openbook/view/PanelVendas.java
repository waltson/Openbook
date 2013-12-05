package br.com.Openbook.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelVendas extends JPanel {
	private JPanel panel;
	private JTextField tfLivro;
	private JTextField tfPreco;
	private JTextField tfAutor;
	private JTextField tfQntPaginas;
	private JTextField tfUnidades;
	private JTextField tfCliente;
	private JButton btnCancelarCompra;
	private JButton btnTiposDePagamento;
	private JComboBox comboBox;
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private JButton btnPesquisarCliente;
	private JButton btnComprar;
	
	public PanelVendas() {
		panel = new JPanel();		
		panel.setBackground(new Color(255, 218, 185));
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Venda"));
		panel.setBounds(0, 0, 862, 519);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome do livro:");
		lblNome.setForeground(new Color(0, 139, 139));
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNome.setBounds(10, 95, 117, 34);
		panel.add(lblNome);
		
		tfLivro = new JTextField();
		tfLivro.setEditable(false);
		tfLivro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfLivro.setBounds(137, 95, 367, 34);
		panel.add(tfLivro);
		tfLivro.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setForeground(new Color(0, 139, 139));
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreo.setBounds(10, 269, 66, 34);
		panel.add(lblPreo);
		
		tfPreco = new JTextField();
		tfPreco.setEditable(false);
		tfPreco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfPreco.setBounds(75, 272, 108, 34);
		panel.add(tfPreco);
		tfPreco.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setForeground(new Color(0, 139, 139));
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigo.setBounds(10, 161, 100, 26);
		panel.add(lblCodigo);
		
		tfAutor = new JTextField();
		tfAutor.setEditable(false);
		tfAutor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfAutor.setBounds(137, 153, 173, 34);
		panel.add(tfAutor);
		tfAutor.setColumns(10);
		
		JLabel lblQuantidadeDePaginas = new JLabel("Quantidade de Paginas:");
		lblQuantidadeDePaginas.setForeground(new Color(0, 139, 139));
		lblQuantidadeDePaginas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuantidadeDePaginas.setBounds(10, 210, 206, 34);
		panel.add(lblQuantidadeDePaginas);
		
		tfQntPaginas = new JTextField();
		tfQntPaginas.setEditable(false);
		tfQntPaginas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfQntPaginas.setBounds(210, 210, 100, 34);
		panel.add(tfQntPaginas);
		tfQntPaginas.setColumns(10);
		
		JLabel lblUnidades = new JLabel("Unidades:");
		lblUnidades.setForeground(new Color(0, 139, 139));
		lblUnidades.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUnidades.setBounds(210, 269, 90, 34);
		panel.add(lblUnidades);
		
		tfUnidades = new JTextField();
		tfUnidades.setEditable(false);
		tfUnidades.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfUnidades.setBounds(310, 269, 90, 34);
		panel.add(tfUnidades);
		tfUnidades.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setForeground(new Color(0, 139, 139));
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCliente.setBounds(10, 38, 66, 26);
		panel.add(lblCliente);
		
		tfCliente = new JTextField();
		tfCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfCliente.setBounds(137, 34, 367, 34);
		panel.add(tfCliente);
		tfCliente.setColumns(10);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setEnabled(false);
		btnComprar.setForeground(new Color(0, 139, 139));
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnComprar.setBounds(524, 320, 306, 59);
		panel.add(btnComprar);
		
		btnCancelarCompra = new JButton("Cancelar compra");
		btnCancelarCompra.setEnabled(false);
		btnCancelarCompra.setForeground(new Color(0, 139, 139));
		btnCancelarCompra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarCompra.setBounds(524, 410, 306, 60);
		panel.add(btnCancelarCompra);
		
		btnTiposDePagamento = new JButton("Tipos de pagamento");
		btnTiposDePagamento.setEnabled(false);
		btnTiposDePagamento.setForeground(new Color(0, 139, 139));
		btnTiposDePagamento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTiposDePagamento.setBounds(524, 225, 306, 59);
		panel.add(btnTiposDePagamento);
		
		btnPesquisarCliente = new JButton("Pesquisar Cliente");
		btnPesquisarCliente.setForeground(new Color(0, 139, 139));
		btnPesquisarCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPesquisarCliente.setBounds(524, 120, 306, 59);
		panel.add(btnPesquisarCliente);
		
		comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 139, 139));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setBounds(524, 36, 90, 30);
		comboBox.addItem("Id");
		comboBox.addItem("nome");
		comboBox.addItem("cpf");
		panel.add(comboBox);
		
		String colunas[] =	{
			"Livros adicionados"	
		};
		
		Object dados[][] = {
				
		};
		
		model = new DefaultTableModel(dados,colunas);
		
		table = new JTable(model);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setEnabled(false);
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setForeground(new Color(0, 128, 128));
		scrollPane.setBounds(10, 367, 494, 142);
		panel.add(scrollPane);
		
		JLabel lblCarrinhoDeCompras = new JLabel("Carrinho de compras:");
		lblCarrinhoDeCompras.setForeground(new Color(0, 139, 139));
		lblCarrinhoDeCompras.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCarrinhoDeCompras.setBounds(10, 334, 173, 26);
		panel.add(lblCarrinhoDeCompras);
		
		setSize(862, 519);
	}
}
