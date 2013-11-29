package br.com.Openbook.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

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
	
	public PanelVendas() {
		panel = new JPanel();		
		panel.setBackground(new Color(255, 218, 185));
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Venda"));
		panel.setBounds(0, 0, 862, 519);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblLivro = new JLabel("Titulo:");
		lblLivro.setForeground(new Color(0, 139, 139));
		lblLivro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLivro.setBounds(10, 132, 66, 34);
		panel.add(lblLivro);
		
		tfLivro = new JTextField();
		tfLivro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfLivro.setBounds(75, 134, 391, 34);
		panel.add(tfLivro);
		tfLivro.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setForeground(new Color(0, 139, 139));
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreo.setBounds(10, 395, 66, 34);
		panel.add(lblPreo);
		
		tfPreco = new JTextField();
		tfPreco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfPreco.setBounds(75, 398, 108, 34);
		panel.add(tfPreco);
		tfPreco.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setForeground(new Color(0, 139, 139));
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAutor.setBounds(10, 230, 59, 26);
		panel.add(lblAutor);
		
		tfAutor = new JTextField();
		tfAutor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfAutor.setBounds(75, 222, 391, 34);
		panel.add(tfAutor);
		tfAutor.setColumns(10);
		
		JLabel lblQuantidadeDePaginas = new JLabel("Quantidade de Paginas:");
		lblQuantidadeDePaginas.setForeground(new Color(0, 139, 139));
		lblQuantidadeDePaginas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuantidadeDePaginas.setBounds(10, 313, 206, 34);
		panel.add(lblQuantidadeDePaginas);
		
		tfQntPaginas = new JTextField();
		tfQntPaginas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfQntPaginas.setBounds(214, 316, 100, 34);
		panel.add(tfQntPaginas);
		tfQntPaginas.setColumns(10);
		
		JLabel lblUnidades = new JLabel("Unidades:");
		lblUnidades.setForeground(new Color(0, 139, 139));
		lblUnidades.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUnidades.setBounds(214, 395, 90, 34);
		panel.add(lblUnidades);
		
		tfUnidades = new JTextField();
		tfUnidades.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfUnidades.setBounds(314, 398, 90, 34);
		panel.add(tfUnidades);
		tfUnidades.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setForeground(new Color(0, 139, 139));
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCliente.setBounds(10, 51, 66, 26);
		panel.add(lblCliente);
		
		tfCliente = new JTextField();
		tfCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfCliente.setBounds(75, 50, 391, 34);
		panel.add(tfCliente);
		tfCliente.setColumns(10);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setForeground(new Color(0, 139, 139));
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnComprar.setBounds(524, 213, 306, 59);
		panel.add(btnComprar);
		
		btnCancelarCompra = new JButton("Cancelar compra");
		btnCancelarCompra.setForeground(new Color(0, 139, 139));
		btnCancelarCompra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarCompra.setBounds(524, 334, 306, 60);
		panel.add(btnCancelarCompra);
		
		btnTiposDePagamento = new JButton("Tipos de pagamento");
		btnTiposDePagamento.setForeground(new Color(0, 139, 139));
		btnTiposDePagamento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTiposDePagamento.setBounds(524, 105, 306, 59);
		panel.add(btnTiposDePagamento);
		
		setSize(862, 519);
	}
}
