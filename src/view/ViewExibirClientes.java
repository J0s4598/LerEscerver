package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Cliente;

public class ViewExibirClientes {
	//
	public void exibirClientes(ArrayList<Cliente> clientes){
		//
		String todosClientes = "";
		//
		for (int i = 0; i < clientes.size(); i++) {
			todosClientes = todosClientes + clientes.get(i).toString() + "\n";
		}
		//
		JOptionPane.showMessageDialog(null, todosClientes);
	}

}
