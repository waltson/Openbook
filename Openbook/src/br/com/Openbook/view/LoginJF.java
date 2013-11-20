package br.com.Openbook.view;


/**
 * @author Thiago Henrique
 * @description janela principal do sistema
 * */

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Point;

public class LoginJF extends JFrame	{
	
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnSobreNs;
	private JButton btnEntrar;
	private TratadorDeEventos evento;
	
	public LoginJF() {
		super("Principal");
		
		evento = new TratadorDeEventos();
		
		Container container = getContentPane();
		
		container.setFont(new Font("Tahoma", Font.PLAIN, 22));
		container.setBackground(new Color(255, 153, 0));
		container.setLayout(null);
		setVisible(true);
		setSize(780,500);
		setLocation(new Point(300, 100));
		
		JLabel lblBemvindo = new JLabel("Bem-Vindo!");
		lblBemvindo.setForeground(Color.WHITE);
		lblBemvindo.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblBemvindo.setBounds(411, 62, 249, 73);
		container.add(lblBemvindo);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLogin.setBounds(44, 213, 102, 37);
		container.add(lblLogin);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(136, 213, 198, 33);
		container.add(textField);
		textField.setColumns(10);
		textField.addActionListener(evento);
		
		JLabel lblNewLabel = new JLabel("Senha:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(44, 284, 83, 37);
		container.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(136, 286, 198, 35);
		container.add(passwordField);
		passwordField.addActionListener(evento);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setForeground(SystemColor.textHighlight);
		btnEntrar.setForeground(SystemColor.textHighlight);
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnEntrar.setBounds(162, 357, 172, 48);
		btnEntrar.addActionListener(evento);
		container.add(btnEntrar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\material da faculdade\\2\u00BA semestre\\Laboratorio de programa\u00E7\u00E3o\\projeto - livraria\\logo.fw.png"));
		label.setBounds(10, 11, 301, 142);
		container.add(label);
		
		btnSobreNs = new JButton("Sobre n\u00F3s!");
		btnSobreNs.setForeground(SystemColor.textHighlight);
		btnSobreNs.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSobreNs.setBounds(488, 357, 172, 48);
		btnSobreNs.addActionListener(evento);
		container.add(btnSobreNs);
		
		JLabel lblNewLabel_1 = new JLabel("Saiba mais sobre nossos objetivos!");
		lblNewLabel_1.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(395, 247, 375, 48);
		container.add(lblNewLabel_1);
	}
	
	/*
	 * @description: classe para tratamento de eventos
	 */
	public class TratadorDeEventos implements ActionListener	{

		@Override
		public void actionPerformed(ActionEvent evento) {
			if(evento.getSource() == btnEntrar)	{
				/*
				 * Instruções para login
				 */
			}
			if(evento.getSource() == btnSobreNs)	{
				/*
				 * Instruções para mostrar algumas informações sobre a empresa
				 */
			}
			
			
		}
		
	}
	
	/*
	 * metodos para recuperar os campos preenchidos
	 */
	public String getTextField() {
		return textField.getText();
	}

	public String setPasswordField() {
		//tranformando o array de caracteres em uma unidade tipo String
		String cont = "";
		char []password = this.passwordField.getPassword();
		for(int x = 0; x < password.length; x++)	{
			cont += password[x];
		}
		return cont;
	}
	
	
	
	
	//metodo para testar a janela; deve ser apagado no terminio do projeto
	public static void main(String args[])	{
		new LoginJF();
	}
}
