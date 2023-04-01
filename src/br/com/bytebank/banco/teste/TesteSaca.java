package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200);
		try {
		conta.sacar(290);
/*catch(Exception ex)*/	 
		} catch(SaldoInsuficienteException ex) {
			System.out.println("" + ex.getMessage());
			
		}
		System.out.println(conta.getSaldo());
	}
	}