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

import org.w3c.dom.events.MouseEvent;

import br.com.Openbook.negocio.Genero;
import br.com.Openbook.negocio.Livro;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class CadastroDeLivros extends JDialog {
	
	private JTextField tfTituloOriginal;
	private JFormattedTextField qntPaginas;
	private JFormattedTextField tfAnoLancamento;
	private ManipuladorEventos meventos;
	private JComboBox cbClassificacaoIndicativa;
	private JButton btnSalvar;
	private JButton btnCancelar; 
	private JTextField tfFilmeImagem;
	private JComboBox cbIdioma;
	private JComboBox cbGenero;
	private JTextField textField;
	private JLabel lblPreo;
	private JTextField textField_1;
	private JLabel lblIsb;
	private JTextField textField_2;
	private JLabel lblGnero;
	private JLabel lblIdioma;
	private JLabel lblD;
	private JLabel lblCadastroLivro;
	
	public CadastroDeLivros() {
		
		setTitle("Cadastro de Livro");
		setResizable(false); 
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(537,384);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		meventos = new ManipuladorEventos();
		
		JPanel painelCentro = new JPanel();
		painelCentro.setBackground(new Color(244, 164, 96));
		painelCentro.setBorder(BorderFactory.createTitledBorder("Dados do Livro"));
		getContentPane().add(painelCentro, BorderLayout.CENTER);
		painelCentro.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome do livro:");
		lblNome.setBounds(21, 37, 103, 14);
		painelCentro.add(lblNome);
		
		JLabel lblDurao = new JLabel("Qnt. Paginas");
		lblDurao.setBounds(21, 131, 75, 14);
		painelCentro.add(lblDurao);
		
		JLabel lblAnoDeLanamento = new JLabel("Ano de Lan\u00E7amento:");
		lblAnoDeLanamento.setBounds(167, 131, 120, 14);
		painelCentro.add(lblAnoDeLanamento);
		
		tfTituloOriginal = new JTextField();
		tfTituloOriginal.setBounds(107, 31, 405, 20);
		painelCentro.add(tfTituloOriginal);
		tfTituloOriginal.setColumns(10);
		
		qntPaginas = new JFormattedTextField();
		qntPaginas.setBounds(106, 125, 46, 20);
		painelCentro.add(qntPaginas);
		qntPaginas.setColumns(10);
		
		tfAnoLancamento = new JFormattedTextField();
		tfAnoLancamento.setColumns(10);
		tfAnoLancamento.setBounds(285, 125, 59, 20);
		painelCentro.add(tfAnoLancamento);
		
		cbGenero = new JComboBox(Genero.values());
		cbGenero.setBounds(76, 160, 157, 20);
		painelCentro.add(cbGenero);
		
		lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setBounds(20, 166, 59, 14);
		painelCentro.add(lblGnero);
		
		lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(354, 131, 60, 14);
		painelCentro.add(lblIdioma);
		
		String idiomas[] = {"Português","Inglês"};
		cbIdioma = new JComboBox(idiomas);
		cbIdioma.setBounds(405, 125, 106, 20);
		painelCentro.add(cbIdioma);
		
		lblD = new JLabel("Classifica\u00E7\u00E3o:");
		lblD.setBounds(254, 166, 142, 14);
		painelCentro.add(lblD);
		
		JLabel lblImage = new JLabel("Image:");
		lblImage.setBounds(20, 199, 46, 14);
		painelCentro.add(lblImage);
		
		tfFilmeImagem = new JTextField();
		tfFilmeImagem.setBackground(Color.WHITE);
		//tfFilmeImagem.addMouseListener(meventos);
		tfFilmeImagem.setText("<Selecione uma Imagem>");
		tfFilmeImagem.setEditable(false);
		tfFilmeImagem.setColumns(10);
		tfFilmeImagem.setBounds(74, 193, 368, 20);
		painelCentro.add(tfFilmeImagem);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(21, 67, 46, 14);
		painelCentro.add(lblAutor);
		
		textField = new JTextField();
		textField.setBounds(107, 64, 404, 20);
		painelCentro.add(textField);
		textField.setColumns(10);
		
		lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setBounds(21, 98, 46, 14);
		painelCentro.add(lblPreo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 95, 86, 20);
		painelCentro.add(textField_1);
		textField_1.setColumns(10);
		
		lblIsb = new JLabel("ISBN");
		lblIsb.setBounds(254, 95, 46, 14);
		painelCentro.add(lblIsb);
		
		textField_2 = new JTextField();
		textField_2.setBounds(310, 95, 104, 20);
		painelCentro.add(textField_2);
		textField_2.setColumns(10);		
		
		lblCadastroLivro = new JLabel("Cadastro Livro");
		lblCadastroLivro.setBackground(new Color(255, 140, 0));
		lblCadastroLivro.setAlignmentY(Component.TOP_ALIGNMENT);
		lblCadastroLivro.setIcon(new ImageIcon(CadastroDeLivros.class.getResource("/imgs/iconnewbook.png")));
		getContentPane().add(lblCadastroLivro, BorderLayout.NORTH);
		
		JPanel painelInferior = new JPanel();
		painelInferior.setBackground(new Color(255, 140, 0));
		getContentPane().add(painelInferior, BorderLayout.SOUTH);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(CadastroDeLivros.class.getResource("/imgs/iconok.fw.png")));
		btnSalvar.addActionListener(meventos);
		painelInferior.add(btnSalvar);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		painelInferior.add(horizontalStrut);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(CadastroDeLivros.class.getResource("/imgs/iconcancel.fw.png")));
		btnCancelar.addActionListener(meventos);
		painelInferior.add(btnCancelar);
		// TODO Auto-generated constructor stub
	}

	@Deprecated
	public void preencherCampos() {
		 tfFilmeImagem.setText("Nenhuma imagem selecionada");
		
	}
	
	public class ManipuladorEventos implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	
	
	/**
	 * Este método é usado apenas para testar a janela de cadastro de filmes
	 * sem a necessidade de rodar a aplicação inteira.
	 * @TODO Remover este método na versão final.
	 */
	public static void main(String[] args) {
		
		CadastroDeLivros cadastrarLivros = new CadastroDeLivros();
		cadastrarLivros.preencherCampos();
		cadastrarLivros.setVisible(true);
	}
}
