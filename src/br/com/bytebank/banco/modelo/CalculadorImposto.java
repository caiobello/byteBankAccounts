package br.com.bytebank.banco.modelo;

/**
 * Classe "CalculadorImposto" responsavel por calcular impostos para
 * diferentes tipos de objetos que implementam a interface "Tributavel".
 * 
 * A classe "CalculadorImposto" uma classe de utilidade que pode ser usada para
 * calcular o valor total de impostos para um conjunto de objetos "Tributavel".
 * Ela implementa a interface "Tributavel" para garantir que seja possivel obter
 * o valor de imposto para um determinado objeto que implemente a interface.
 * 
 * A classe "CalculadorImposto" pode ter metodos adicionais para ajudar no
 * calculo dos impostos, como metodos para adicionar objetos "Tributavel",
 * remover objetos "Tributavel", ou calcular o valor total de impostos para
 * todos os objetos "Tributavel" adicionados.
 * 
 * 
 *  @version 1.0
 *  @author Caio Bello
 */

public class CalculadorImposto implements Tributavel {

	private double totalImposto;

	/**
	 * Metodo "registra" da classe "CalculadorImposto". Registra um objeto
	 * "Tributavel" e adiciona seu valor de imposto ao total de impostos armazenado
	 * no atributo "totalImposto". Recebe como entrada um objeto "Tributavel", e usa
	 * o metodo "getValorImposto" da interface "Tributavel" para obter o valor de
	 * imposto para esse objeto. O valor de imposto fica entao adicionado ao
	 * atributo "totalImposto". Este metodo permite que os objetos "Tributavel"
	 * sejam registrados e que seu valor de imposto seja incluido no total de
	 * impostos da classe "CalculadorImposto".
	 */
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

	/**
	 * Metodo "TotalImposto" da classe "CalculadorImposto" retorna o valor total de
	 * impostos armazenado no atributo "totalImposto".
	 */
	public double TotalImposto() {
		return totalImposto;
	}

	/**
	 * O metodo "getValorImposto" na classe "CalculadorImposto" anotado com
	 * "@Override", o que significa que ele esta sobrescrevendo o metodo
	 * "getValorImposto" da interface "Tributavel". Este metodo necessario porque a
	 * classe "CalculadorImposto" implementa a interface "Tributavel", e fica
	 * necessario fornecer uma implementação para o metodo "getValorImposto". O
	 * metodo "getValorImposto" na classe "CalculadorImposto" simplesmente retorna
	 * 0, pois a classe "CalculadorImposto" não esta tributável em si.
	 */
	@Override
	public double getValorImposto() {
		return 0;
	}

}
