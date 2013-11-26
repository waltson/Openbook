package br.com.Openbook.negocio;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class UtilGui {
	private static Icon successIcon = new ImageIcon("ic_msg_success.png");
	private static Icon errorIcon = new ImageIcon("ic_msg_error.png");
	
	public UtilGui() {
		// TODO Auto-generated constructor stub
	}
	
	public final static void successMessage(String message){
		JOptionPane.showMessageDialog(null, message,"Sucesso",0,successIcon);
	}
	
	public final static void errorMessage(String message){
		
		JOptionPane.showMessageDialog(null, message,"Erro",0,errorIcon);

	}

}
