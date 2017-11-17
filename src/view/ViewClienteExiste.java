package view;

import javax.swing.JOptionPane;

public class ViewClienteExiste {
	
	//Metodo para exibir mensagem de cliente existem
	public void exibirMensageClienteExiste(){
		JOptionPane.showMessageDialog(null, "Cliente já existe","ERRO",  JOptionPane.ERROR_MESSAGE);
	}

}
