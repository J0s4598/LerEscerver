package control;

import model.BD;
import model.Cliente;
import view.ViewCadastraCliente;

public class ControleCadastraCliente {
	//
	private BD bd;
	//Metodo construtor
	public ControleCadastraCliente(BD bd){
		this.bd = bd;
	}
	
	//Metodo para obter dados do cliente e gravar no bd
	public void cadastraCliente(){
		//Instanciar a view
		ViewCadastraCliente vcc = new ViewCadastraCliente();
		//Chamar metodo
		vcc.obterDadosCliente();
		//
		Cliente c = new Cliente(vcc.getNome(), vcc.getCPF(), Integer.parseInt(vcc.getIdade()));
		//
		this.bd.gravarCliente(c);
	}

}
