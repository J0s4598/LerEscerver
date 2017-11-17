package main;


import control.ControleCadastraCliente;
import control.ControleExibirCliente;
import model.BD;

public class Principal {

	public static void main(String[] args) {
		//Instanciar o BD
		BD bd = new BD();
		//Carregar os clintes do arquivo
		bd.carregarClientes();
		//Instanciar controleExibirClientes
		ControleExibirCliente cec = new ControleExibirCliente(bd);
		//Instanciar ControleCadastraCliente
		ControleCadastraCliente ccc = new ControleCadastraCliente(bd);
		
		//Exibir clientes
		cec.exibirClientes();
		
		//inserir um novo cliente
		ccc.cadastraCliente();
		
		//Exibir todos os clintes novamente
		cec.exibirClientes();
		}
		
		

}
