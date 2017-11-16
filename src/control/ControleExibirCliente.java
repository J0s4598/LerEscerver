package control;

import java.util.ArrayList;

import model.BD;
import model.Cliente;
import view.ViewExibirClientes;

public class ControleExibirCliente {
	//Atributos
	private BD bd;
	private ViewExibirClientes vec;
	
	//Metodo construtor
	public ControleExibirCliente(BD bd){
		this.bd = bd;
		//Instanciar a view
		this.vec = new ViewExibirClientes();
	}
	//Metodo que recupera os clientes e exibe
	public void exibirClientes(){
		//Retornar o arryalist
		ArrayList<Cliente> clientes = this.bd.getClientes();
		//Executar o metodo
		this.vec.exibirClientes(clientes);
	}

}
