package br.com.Openbook.negocio;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//Não permite que esta classe seja herdada
public final class UtilGui {
	
	private static Icon successIcon = new ImageIcon(UtilGui.class.getResource("/imgs/ic_msg_success.png"));
	private static Icon errorIcon = new ImageIcon(UtilGui.class.getResource("/imgs/ic_msg_error.png"));
	
	//Não permite que esta classe seja criada.
	private UtilGui() {
	
	}
	
	public final static void successMessage(String message){
		JOptionPane.showMessageDialog(null, message,"Sucesso",0,successIcon);
	}
	
	public final static void errorMessage(String message){
		
		JOptionPane.showMessageDialog(null, message,"Erro",0,errorIcon);

	}

}
