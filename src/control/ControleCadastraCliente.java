package control;

import model.BD;
import model.Cliente;
import view.ViewCadastraCliente;
import view.ViewClienteExiste;

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
		
		//Verificar se o cliente ja existe
		if (this.bd.existeCliente(vcc.getCPF())) {
			//Instanciar a view
			ViewClienteExiste vce = new ViewClienteExiste();
			//Exibir Message
			vce.exibirMensageClienteExiste();
		}else{
			//Instanciar um objeto da classe cliente com os dados digitados
			Cliente c = new Cliente(vcc.getNome(), vcc.getCPF(), Integer.parseInt(vcc.getIdade()));
			//Guardar cliente no BD
			this.bd.gravarCliente(c);
		}
				
	}

}
