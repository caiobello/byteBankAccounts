package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe "Cliente", uma classe que representa um cliente. Ela possui tres
 * variaveis de instancia, nome, CPF e endereco, que armazenam informacoes
 * basicas sobre um cliente.
 * 
 *  @version 1.0
 *  @author Caio Bello
 */
public class Cliente implements Serializable {

	/**
	 * Classe Cliente, uma classe que representa um cliente. Ela possui tres
	 * variaveis de instância, nome, CPF e endereco, que armazenam informacoes
	 * basicas sobre um cliente.
	 */
	private String nome;
	private String CPF;
	private String Endereco;
	private String Profissao;

	/**
	 * A variável de instância nome é usada para armazenar o nome do cliente. Ela
	 * pode ser acessada através do método getNome() e modificada através do método
	 * setNome().
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * A variavel de instancia CPF, usada para armazenar o CPF do cliente. Ela pode
	 * ser acessada atraves do metodo getCPF() e modificada atraves do metodo
	 * setCPF().
	 */
	public String getCPF() {
		return CPF;
	}

	public void setCpf(String Cpf) {
		CPF = Cpf;
	}

	/**
	 * Variavel de Instancia Endereco
	 * 
	 * A variavel de instancia Enderecoo, usada para armazenar o endereco do
	 * cliente. Ela pode ser acessada atraves do metodo getEndereco() e modificada
	 * atraves do metodo setEndereco().
	 */
	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getProfissao() {
		return Profissao;
		}


	public String setProfissao(String profissao) {
		return this.Profissao = profissao;
		
	}}
