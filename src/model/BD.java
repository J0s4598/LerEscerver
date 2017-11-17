package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {
	//Atributos
	private ArrayList<Cliente> clientes;
	private String fileName = "clientes.txt";
	private DocumentWriter dw;
	private DocumentReader dr;
	
	//metodo construtor
	public BD(){
		//Instanciar o ArrayList
		this.clientes = new ArrayList<Cliente>();
		//Instanciar o DocumentReader
		this.dr = new DocumentReader();
		//Instanciar o DocumentoWrite
		this.dw = new DocumentWriter();
	}
	
	/*metodo que carrega todos os clintes do arquivo
	  para ArrayList*/	
	public void carregarClientes(){
		//Ler as linhas do aquivo
		ArrayList<String> linhas = dr.read(fileName);
		//Percorrer o ArrayList criando os clientes
		for (int i = 0; i < linhas.size(); i++) {
			//separa a linha em um araay de srting
			String[] linhaCliente = linhas.get(i).split(";");
			//cria o cliente com os dados da linha
			Cliente c = new Cliente(linhaCliente[0], linhaCliente[1], Integer.parseInt(linhaCliente[2]));
			//coloca o clinte no ArrayList
			this.clientes.add(c);
		}
	}
	
	//metodoque grava cliente
	public void gravarCliente(Cliente c){
		//colocar o cliente no ArrayList
		this.clientes.add(c);
		//Gravaro cliente no arquivo
		dw.write(this.fileName, c.toLinha());
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	//Metodo que verifice se ja existe cliente com o CPF informado
	public boolean existeCliente(String CPF){
		boolean retorno = false;
		//percore o Arraylist
		for (int i = 0; i < this.clientes.size(); i++) {
			//Verificar se existe cliente com o mesmo CPF
			if (this.clientes.get(i).getCPF().equals(CPF)) {
				retorno = true;
			}
		}
		return retorno;
	}
	
	
	
	
	
	
	
	

}
