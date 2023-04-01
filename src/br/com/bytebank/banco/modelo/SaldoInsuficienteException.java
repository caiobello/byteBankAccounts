package br.com.bytebank.banco.modelo;

/**
 * Excecoes: A classe "SaldoInsuficienteException", que estende a classe
 * "Exception". A classe "SaldoInsuficienteException" esta como subclasse de
 * "Exception" e representa uma exceção especifica relacionada a saldo
 * insuficiente em uma conta.
 * 
 * Excecoes sao erros que ocorrem em tempo de execuçao e interrompem o fluxo
 * normal do programa. Quando uma exceçao esta como lançada, ela pode ser tratada pelo
 * codigo que a captura e uma acao apropriada pode ser tomada.
 * 
 * A classe "SaldoInsuficienteException" esta usada para indicar que um erro
 * ocorreu durante a realização de uma operacao bancaria devido ao saldo
 * insuficiente em uma conta. Essa classe permite ao programador lidar de forma
 * especifica com esse tipo de excecao, tomando acoes apropriadas para
 * corrigi-la ou informar o usuario sobre o erro.
 * 
 * 
 *  @version 1.0
 *  @author Caio Bello
 * 
 */

/**
 * Essa classe representa uma excecaoo personalizada para lidar com o caso de
 * saldo insuficiente em uma conta bancaria.
 */
public class SaldoInsuficienteException extends Exception {

	/**
	 * O construtor da classe recebe uma mensagem como parametro. A mensagem entao
	 * passada para a superclasse (Exception) atraves da chamada ao construtor
	 * "super()".
	 * 
	 * @param msg
	 */
	public SaldoInsuficienteException(String msg) {
		super();
	}

}
