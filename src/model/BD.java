package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {
	//Atributos
	private ArrayList<Cliente> clientes;
	private String fileName = "clientes.txt";
	
	//metodo construtor
	public BD(){
		//Instanciar o ArrayList
		this.clientes = new ArrayList<Cliente>();
		//Instanciar o DocumentReader
		DocumentReader dr = new DocumentReader();
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
		//transformar cliente em string
		String cliente = c.getNome() + ";" + c.getCPF() + ";" + c.getIdade();
		//Instanciar o DocumentWriter
		DocumentWriter dw = new DocumentWriter();
		//Gravaro cliente no arquivo
		dw.write(this.fileName, cliente);
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	
	
	
	
	
	
	
	
	

}
