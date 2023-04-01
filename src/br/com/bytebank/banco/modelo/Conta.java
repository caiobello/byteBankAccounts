package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * Classe "Conta" declarada como uma classe abstrata, o que significa que ela
 * nao pode ser instanciada sozinha, mas deve ser extendida por uma classe
 * concreta. Classes abstratas são usadas como um modelo ou molde para outras
 * classes. Elas possuem metodos abstratos, que sao metodos sem implementaçao e
 * precisam ser implementados nas classes filhas. Alem disso, classes abstratas
 * tambem podem ter metodos com implementacao, que podem ser reutilizados pelas
 * classes filhas sem a necessidade de serem reescritos.
 * 
 * * Orientacao a Objetos, Encapsulamento Privado, Polimorfismo e Excecoes
 * 
 * 
 * 
 *  @version 1.0
 *  @author Caio Bello
 * 
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	/**
	 * Atributos: Protected compartilhando a informacao com a classe filha Private
	 * restringindo a informacao apenas para esta classe
	 */
	protected double saldo;
	public int agencia;
	public int numero;
	private Cliente titular;
//	private transient Cliente titular;
	private String banco;

	/**
	 * A variavel "total" fica estatica, ou seja, pertence a classe Conta e nao a um
	 * objeto especifico da classe. Isso significa que todos os objetos da classe
	 * compartilham o mesmo valor para essa variavel, independentemente de quantos
	 * objetos da classe foram criados. O atributo "total" fica utilizado para
	 * manter a contagem de quantas contas foram criadas ate o momento, e entao
	 * acessado por meio dos metodos getTotal e setTotal.
	 */
	private static int total;

	/** Primeiro Construtor */
	public Conta() {
	}

	/**
	 * O construtor inicializa as variaveis agancia e numero da conta com os valores
	 * passados como argumentos e incrementa o atributo estatico total em 1. Alem
	 * disso, fica impresso na saida padrao o valor atual de total de contas e as
	 * informacoes da nova agencia e conta criadas.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total de contas é :" + total);

		this.agencia = agencia;
		this.numero = numero;

		System.out.println("Agencia e Conta: " + this.agencia + " " + this.numero);
	}

	/**
	 * Metodo "deposita" abstrato, o que significa que ele precisa ser
	 * implementado por uma subclasse concreta. Este metodo permite que o usuario
	 * deposite dinheiro em uma conta bancaria e recebe como parametro um valor do
	 * tipo double, que representa o valor a ser depositado.
	 * 
	 * @param valor
	 */
	public abstract void deposita(double valor);

	/**
	 * Metodo "sacar" que retira dinheiro de uma conta bancaria. Ele
	 * verifica se o saldo esta suficiente e, se nao for, lanca uma excecao. Caso o
	 * saldo seja suficiente, o valor sera subtraído do saldo da conta.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Valor Invadilo, Saldo: " + this.saldo + ", Valor a sacar: " + valor);
		}
		this.saldo -= valor;

	}

	/**
	 * Metodo "transfere" que permite que o usuario transfira dinheiro de
	 * uma conta para outra. O metodo recebe como parametros o valor a ser
	 * transferido e a conta destino. Ele verifica se o saldo da conta atual for
	 * suficiente e, se nao for, lanca uma excecao. Caso o saldo seja suficiente, o
	 * valor sera depositado na conta destino e subtraido do saldo da conta atual.
	 * 
	 * @param valor
	 * @param destino
	 * @throws SaldoInsuficienteException
	 */
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Valor Invadilo, Saldo: " + this.saldo + ", Valor a sacar: " + valor);
		}
		destino.deposita(valor);
		this.saldo -= valor;

	}

	/*
	 * //[SACAR] Método que define o comportamento para sacar public boolean
	 * sacar(double valor) {
	 * 
	 * //If Se o valor do saldo for maior que o valor do saque, sacar if (saldo >=
	 * valor) {
	 * 
	 * //Saldo - Valor saldo = (saldo - valor);
	 * System.out.println("Saque Efetuado!"); return true; }
	 * 
	 * //Else Saque Negado por Falta de Saldo else {
	 * System.out.println("Saque negado, saldo insuficiente."); return false; } }
	 * 
	 * //[TRANSFERIR] Método que define o comportamento para transferir public
	 * boolean transfere(double valor, Conta destino) {
	 * 
	 * //If Se o valor do saldo for maior que o valor do saque, pode transferir if
	 * (saldo >= valor) {
	 * 
	 * //Saldo (-=valor) menos valor, envia o dinheiro para o destino += valor saldo
	 * -= valor; destino.saldo += valor;
	 * System.out.println("Transferência Efetuada!"); return true; } //Else
	 * Transferência negada por valor insuficiente else {
	 * System.out.println("Transferência negada, saldo insuficiente."); return
	 * false; }
	 */

	// Método tornando publico o Saldo2 que está com atributo private

	/**
	 * Metodo "getSaldo" que retorna o saldo atual de uma conta bancaria.
	 * Ele retorna um valor do tipo double que representa o saldo atual da conta.
	 * 
	 * @return
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * metodo "setSaldo" que permite que o saldo de uma conta bancaria seja
	 * definido. Ele recebe como parametro um valor do tipo double, que representa o
	 * novo saldo da conta, e atribui esse valor ao atributo "saldo" da conta.
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metodo "getAgencia" que retorna o numero da agencia de uma conta
	 * bancaria. Ele retorna um valor do tipo int que representa o numero da agencia
	 * da conta.
	 * 
	 * @return
	 */
	public int getAgencia() {
		return this.agencia;
	}

	/**
	 * Metodo "setAgencia" que define o numero da agencia de uma conta bancária. Ele
	 * recebe como parametro um valor do tipo int que representa o novo número da
	 * agência e verifica se ele é menor ou igual a zero. Se for, uma mensagem é
	 * impressa indicando que o número da agência não pode ser menor ou igual a
	 * zero.
	 * 
	 * @param agencia
	 */
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia não pode ser menor igual a zero");
			this.agencia = agencia;
		}
	}

	/**
	 * O metodo getNumero() retorna o numero da conta. Ja o metodo setNumero() e
	 * responsavel por definir o numero da conta, desde que este nao seja menor ou
	 * igual a zero. Caso contrario, uma mensagem "Numero nao pode ser menor ou
	 * igual a zero" sera exibida.
	 */
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Numero não pode ser menor igual a zero");
			this.numero = numero;
		}
	}

	/**
	 * * O metodo getBanco() retorna o nome do banco ao qual a conta esta vinculada.
	 * Ja o metodo setBanco() fica responsavel por definir o nome do banco ao qual a
	 * conta esta vinculada.
	 */
	public String getBanco() {
		return this.banco;

	}

	public void setBanco(String banco) {
		this.banco = banco;

	}

	/**
	 * A classe "Conta" possui os metodos getTitular() e setTitular(). O metodo
	 * getTitular() retorna os dados do titular da conta. Ja o metodo setTitular()
	 * fica responsavel por definir os dados do titular da conta.
	 */
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;

	}

	/**
	 * A classe "Conta" possui os metodos estaticos getTotal() e setTotal(). O
	 * metodo getTotal() retorna o numero total de contas criadas. Ja o metodo
	 * setTotal() Fica responsável por definir o numero total de contas criadas.
	 */
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}
	
	
	/**equals*/
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;

        if(this.agencia != outra.agencia) {
            return false;
        }

        if(this.numero != outra.numero) {
            return false;
        }

        return true;
    }
	
    @Override
    public int compareTo(Conta outra) {
    	return Double.compare(this.saldo, outra.saldo);
    }
    
    /**toString*/
	public String toString() {
	return "Numero: " + this.numero + ", Agencia: "	+ this.agencia + ", R$" + this.saldo;
	}
	}
