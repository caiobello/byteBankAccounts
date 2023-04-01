package br.com.bytebank.banco.modelo;

/**
 * Classe "SeguroDeVida" que implementa a interface "Tributavel". Responsavel
 * por representar seguros de vida em um sistema. Obrigada a fornecer uma
 * implementaçao para todos os metodos abstratos da interface "Tributavel", o
 * que significa que ela precisa ter comportamentos relacionados a tributos.
 * 
 * A classe "SeguroDeVida" pode ter propriedades e metodos adicionais que sao
 * especificos para seguros de vida e nao estao presentes na interface
 * "Tributavel". Ela representa um tipo de produto financeiro que pode ser
 * tributavel e precisa seguir as regras da interface "Tributavel" para garantir
 * que seus comportamentos relacionados a tributos estejam corretos.
 * 
 * 
 *  @version 1.0
 *  @author Caio Bello
 *
 */

/** Classe "SeguroDeVida", uma classe que implementa a interface Tributavel. */
public class SeguroDeVida implements Tributavel {

	/**
	 * classe SeguroDeVida tem um metodo getValorImposto, anotado com @Override.
	 * Isso significa que ele sobrescreve o metodo da mesma assinatura na interface
	 * Tributavel. O metodo getValorImposto retorna o valor 0.
	 */
	@Override
	public double getValorImposto() {
		return 0;
	}

}
