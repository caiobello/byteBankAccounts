package br.com.bytebank.banco.modelo;

/**
 * Uma interface, um tipo especial de classe que fornece uma lista de metodos
 * que devem ser implementados por classes que a implementam. Esses metodos
 * definem o comportamento que as classes que a implementam precisam ter. Ela
 * serve como um contrato entre a interface e as classes que a implementam,
 * garantindo que as classes tenham determinadas funcionalidades. Alem disso, as
 * interfaces permitem que voce implemente varias classes diferentes com
 * comportamentos semelhantes em seu projeto.
 * 
 * 
 *  *  @version 1.0
 *  @author Caio Bello
 */

public interface Tributavel {

	/**
	 * Este metodo abstrato na interface "Tributavel". Metodos abstratos sao metodos
	 * que nao tem corpo e precisam ser implementados por classes que a implementam.
	 * O metodo "getValorImposto" retorna um valor do tipo double e fica responsavel
	 * por retornar o valor do imposto que deve ser pago. As classes que implementam
	 * a interface "Tributavel" precisam fornecer uma implementacao concreta para
	 * esse metodo.
	 */
	public abstract double getValorImposto();

}
