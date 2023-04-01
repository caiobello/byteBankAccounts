package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * A classe "ContaCorrente" é uma subclasse de "Conta" e implementa a interface
 * "Tributavel". Ela é usada para representar uma conta corrente bancária, que é
 * um tipo de conta bancária usada para movimentações diárias como saques,
 * depósitos, transferências, entre outros. Além disso, como implementa a
 * interface "Tributavel", essa classe deve implementar os métodos da interface,
 * o que significa que a classe precisa ter a capacidade de calcular o seu
 * próprio imposto.
 * 
 * Orientacao a Objetos, Polimorfismo e Excecoes
 * 
 * @version 1.0
 * @author Caio Bello
 */

public class ContaCorrente extends Conta implements Tributavel, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Construtor da conta corrente respondendo pelo construtor da classe superior
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	/**
	 * É um método para sacar dinheiro de uma conta bancária. Ele tem a anotação
	 * "@Override", o que significa que ele está sobrescrevendo um método da classe
	 * base. Ele adiciona uma taxa de 0,2 ao valor a ser sacado e, em seguida, chama
	 * um método "sacar" na classe superior(base). Se não houver saldo suficiente na
	 * conta, uma exceção "SaldoInsuficienteException" será lançada.
	 */
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		double valorETaxa = valor + 0.2;
		super.sacar(valorETaxa);
	}

	/**
	 * É um método para depositar dinheiro em uma conta bancária. Ele tem a anotação
	 * "@Override", o que significa que ele está sobrescrevendo um método da classe
	 * base. O método adiciona o valor do depósito ao saldo atual da conta.
	 * 
	 */
	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;

	}

	/**
	 * É um método para obter o valor de imposto devido em uma conta bancária. Ele
	 * tem a anotação "@Override", o que significa que ele está sobrescrevendo um
	 * método da classe base. O método retorna 1% do saldo da conta, que é obtido
	 * através da chamada ao método "saldo" da classe base.
	 */

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}
	

}


