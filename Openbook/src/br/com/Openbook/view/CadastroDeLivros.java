package br.com.Openbook.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.log4j.Logger;
import org.w3c.dom.CDATASection;
import org.w3c.dom.events.MouseEvent;

import br.com.Openbook.controller.CCadastroLivro;
import br.com.Openbook.negocio.Genero;
import br.com.Openbook.negocio.Livro;
import br.com.Openbook.negocio.UtilGui;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;

public class CadastroDeLivros extends JDialog {

	private static Logger Log = Logger.getLogger(CadastroDeLivros.class);

	private JTextField tfNomeLivro;
	private JFormattedTextField tfQntPaginas;
	private ManipuladorEventos meventos;
	private JButton btnSalvar;
	private JButton btnCancelar;
	private JComboBox cbIdioma;
	private JComboBox cbGenero;
	private JLabel lblPreo;
	private JTextField tfPreco;
	private JLabel lblIsb;
	private JTextField tfIsbn;
	private JLabel lblGnero;
	private JLabel lblIdioma;
	private JLabel lblCadastroLivro;
	private CCadastroLivro controle;
	private JTextField tfEdicao;

	public CadastroDeLivros() {

		setTitle("Cadastro de Livro");
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(530, 357);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout(0, 0));

		meventos = new ManipuladorEventos();

		JPanel painelCentro = new JPanel();
		painelCentro.setBackground(new Color(244, 164, 96));
		painelCentro.setBorder(BorderFactory
				.createTitledBorder("Dados do Livro"));
		getContentPane().add(painelCentro, BorderLayout.CENTER);
		painelCentro.setLayout(null);

		JLabel lblNome = new JLabel("Nome do livro:");
		lblNome.setBounds(21, 37, 103, 14);
		painelCentro.add(lblNome);

		JLabel lblqntPaginas = new JLabel("Qnt. Paginas");
		lblqntPaginas.setBounds(20, 128, 75, 14);
		painelCentro.add(lblqntPaginas);

		tfNomeLivro = new JTextField();
		tfNomeLivro.setBounds(107, 31, 405, 20);
		painelCentro.add(tfNomeLivro);
		tfNomeLivro.setColumns(10);

		tfQntPaginas = new JFormattedTextField();
		tfQntPaginas.setBounds(105, 122, 46, 20);
		painelCentro.add(tfQntPaginas);
		tfQntPaginas.setColumns(10);

		cbGenero = new JComboBox(Genero.values());
		cbGenero.setBounds(76, 160, 157, 20);
		painelCentro.add(cbGenero);

		lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setBounds(20, 166, 59, 14);
		painelCentro.add(lblGnero);

		lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(284, 163, 46, 14);
		painelCentro.add(lblIdioma);

		String idiomas[] = { "Português", "Inglês" };
		cbIdioma = new JComboBox(idiomas);
		cbIdioma.setBounds(335, 160, 106, 20);
		painelCentro.add(cbIdioma);

		lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setBounds(21, 81, 46, 14);
		painelCentro.add(lblPreo);

		tfPreco = new JTextField();
		tfPreco.setBounds(107, 78, 86, 20);
		painelCentro.add(tfPreco);
		tfPreco.setColumns(10);

		lblIsb = new JLabel("ISBN");
		lblIsb.setBounds(243, 81, 46, 14);
		painelCentro.add(lblIsb);

		tfIsbn = new JTextField();
		tfIsbn.setBounds(284, 78, 104, 20);
		painelCentro.add(tfIsbn);
		tfIsbn.setColumns(10);

		tfEdicao = new JTextField();
		tfEdicao.setBounds(284, 122, 86, 20);
		painelCentro.add(tfEdicao);
		tfEdicao.setColumns(10);

		JLabel lblEdicao = new JLabel("Edi\u00E7\u00E3o:");
		lblEdicao.setBounds(228, 128, 46, 14);
		painelCentro.add(lblEdicao);

		lblCadastroLivro = new JLabel("Cadastro Livro");
		lblCadastroLivro.setBackground(new Color(255, 140, 0));
		lblCadastroLivro.setAlignmentY(Component.TOP_ALIGNMENT);
		lblCadastroLivro.setIcon(new ImageIcon(CadastroDeLivros.class
				.getResource("/imgs/iconnewbook.png")));
		getContentPane().add(lblCadastroLivro, BorderLayout.NORTH);

		JPanel painelInferior = new JPanel();
		painelInferior.setBackground(new Color(255, 140, 0));
		getContentPane().add(painelInferior, BorderLayout.SOUTH);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(CadastroDeLivros.class
				.getResource("/imgs/iconok.fw.png")));
		btnSalvar.addActionListener(meventos);
		painelInferior.add(btnSalvar);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		painelInferior.add(horizontalStrut);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(CadastroDeLivros.class
				.getResource("/imgs/iconcancel.fw.png")));
		btnCancelar.addActionListener(meventos);
		painelInferior.add(btnCancelar);
		// TODO Auto-generated constructor stub

	}

	public void setControle(CCadastroLivro controle) {
		this.controle = controle;
	}

	@Deprecated
	public void preencherCampos() {
		tfNomeLivro.setText("causa");
		tfQntPaginas.setText("9090");
		tfEdicao.setText("1");
		tfIsbn.setText("898989");
		tfPreco.setText("10.90");

	}

	public class ManipuladorEventos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double preco = Double.parseDouble(tfPreco.getText());
			if (e.getSource() == btnSalvar) {

				Livro livro = new Livro();
				livro.setNomeLivro(tfNomeLivro.getText());
				livro.setNumerosPaginas(tfQntPaginas.getText());
				livro.setEdicao(tfEdicao.getText());
				livro.setIsbn(tfIsbn.getText());
				livro.setPreco(preco);
				livro.setIdioma(cbIdioma.getSelectedItem() + "");
				livro.setGenero(Genero.getValueOf(cbGenero.getSelectedItem()
						.toString()));

				if (controle.cadastrarLivro(livro)) {
					UtilGui.successMessage("Livro Cadastrado!");
					dispose();

				}
			} else if (e.getSource() == btnCancelar) {
				dispose();

			}
		}
	}

	/**
	 * Este método é usado apenas para testar a janela de cadastro de filmes sem
	 * a necessidade de rodar a aplicação inteira.
	 * 
	 * @TODO Remover este método na versão final.
	 */
	public static void main(String[] args) {

		CadastroDeLivros cadastrarLivros = new CadastroDeLivros();
		cadastrarLivros.setControle(new CCadastroLivro());
		cadastrarLivros.preencherCampos();
		cadastrarLivros.setVisible(true);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			Log.error(e.getMessage());

		}
	}
}
