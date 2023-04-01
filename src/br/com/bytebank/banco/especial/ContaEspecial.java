package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

/**
 * A classe "ContaEspecial", uma subclasse de "Conta" e herda todos seus
 * atributos e metodos. A classe "ContaEspecial" tem um construtor que recebe
 * dois argumentos, agencia e numero, que sao passados para a superclasse
 * "Conta".
 * 
 *  @version 1.0
 *  @author Caio Bello
 */
public class ContaEspecial extends Conta {

	/**
	 * Construtores/
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);

	}

	/**
	 * O metodo "deposita" fica anotado com "@Override", indicando que ele sobrescreve
	 * o metodo da superclasse "Conta". O metodo adiciona o valor fornecido ao saldo
	 * da conta, acessando o atributo "saldo" da superclasse "Conta" atraves do
	 * operador "super".
	 */
	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
