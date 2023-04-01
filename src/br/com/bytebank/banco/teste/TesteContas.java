package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
			ContaEspecial ce = new ContaEspecial(123, 4444);
			ce.deposita(70.0);
			
			ContaCorrente cc = new ContaCorrente(111, 111);
			cc.deposita(100.0);
			
			ContaPoupanca cp = new ContaPoupanca(222, 222);
			cp.deposita(200.0);

//transfere da conta de origem a esquerda, para conta de destino a direita
			cc.transfere(10.0, cp); 
			cc.transfere(10.0, cp); 
			

//Agora os saques da CC estão sujeitos as taxas da Classe CC
			
			System.out.println("Saldo CE: " + ce.getSaldo());
			System.out.println("Saldo CC: " + cc.getSaldo());
			System.out.println("Saldo CP: " + cp.getSaldo());

			}		
			

	}
			
	


