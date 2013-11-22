package br.com.Openbook.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import br.com.Openbook.negocio.Livro;

public class PainelLivros extends JPanel {

	private JTextField tfCriterio;
	private JTable jtFilmes;
	private JButton btnProcurar;
	private TratadorDeEventos tratador;
	private JComboBox cbCriterio;
	
	public PainelLivros() {
		tratador = new TratadorDeEventos();
		setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		cbCriterio = new JComboBox();
		panel.add(cbCriterio);
		
		tfCriterio = new JTextField();
		panel.add(tfCriterio);
		tfCriterio.setColumns(40);
		
		btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(tratador);
		panel.add(btnProcurar);
		
		jtFilmes = new JTable();
		jtFilmes.addMouseListener(tratador);
		TableModel dataModel = new DefaultTableModel();
		
		jtFilmes.setModel(dataModel);
		JScrollPane scrollPane = new JScrollPane( jtFilmes );
		
		add(scrollPane, BorderLayout.CENTER);
		
	}
	
	private class TratadorDeEventos extends MouseAdapter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnProcurar){
				
				
			}
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(e.getSource() == jtFilmes && e.getClickCount() == 2) {
		      //codigo de pesquisa
		   }
		   
		}
		
	}
}
