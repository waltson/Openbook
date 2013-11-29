package br.com.Openbook.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PainelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	private JPanel panel;
	
	public PainelHome() {
		panel = new JPanel();		
		panel.setBackground(new Color(255, 218, 185));
		setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder(""));
		panel.setBounds(0, 0, 862, 519);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PainelHome.class.getResource("/imgs/books_texture3024.jpg")));
		lblNewLabel.setBounds(0, 0, 862, 519);
		panel.add(lblNewLabel);
		setSize(862, 519);
	}
}
