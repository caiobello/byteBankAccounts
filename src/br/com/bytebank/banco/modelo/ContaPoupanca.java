package br.com.bytebank.banco.modelo;

/**
 * Classe "ContaPoupanca", estende a classe "Conta" e implementa a
 * interface "Tributavel". classe "ContaPoupanca" uma subclasse da classe
 * "Conta" e herda todas as propriedades e metodos da classe "Conta". Alem
 * disso, a classe "ContaPoupanca" implementa a interface "Tributavel", o que
 * significa que ela fica obrigada a fornecer uma implementacao para todos os
 * metodos abstratos da interface "Tributavel".
 * 
 * A classe "ContaPoupanca" responsavel por representar contas de poupança em
 * um sistema bancario. Ela pode ter propriedades e metodos adicionais que sao
 * especificos para contas de poupança e nao estao presentes na classe "Conta"
 * ou na interface "Tributavel".
 * 
 *  @version 1.0
 *  @author Caio Bello
 * */


public class ContaPoupanca extends Conta implements Tributavel {

	/**
	 * Construtor ContaPoupanca: uma subclasse da classe Conta e implementa a
	 * interface Tributavel. Ela possui um construtor que recebe como parametros a
	 * agencia e o numero da conta. Este construtor faz a chamada ao construtor da
	 * classe mae (Conta) para inicializar os atributos da superclasse.
	 */
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	/**
	 * Metodo sacar: A classe ContaPoupanca tem uma implementacao do metodo sacar,
	 * sobrescrito da classe mae. O metodo realiza a retirada de valor da conta,
	 * cobrando uma taxa adicional de 0,2. Em seguida, chama o metodo sacar da
	 * classe mae para realizar a operacaoo.
	 */
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		double valorETaxa = valor + 0.2;
		super.sacar(valorETaxa);
	}

	/**
	 * Metodo deposita: A classe ContaPoupanca tem uma implementação do metodo
	 * deposita, sobrescrito da classe mãe. O método adiciona o valor passado como
	 * parametro ao saldo da conta.
	 */
	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;

	}

	/**
	 * Metodo getValorImposto: A classe ContaPoupanca tem uma implementacao do
	 * metodo getValorImposto, herdado da interface Tributavel. Neste caso, o metodo
	 * retorna o valor 0.
	 */
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
		
		
	}
	@Override
	public String toString() {
		return "ContaPoupanca, " + super.toString();
	}
	
}
