package br.com.bytebank.banco.test.util;
import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

        public static void main(String[] args) {

        //Generics
        LinkedList<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 12);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 12);        
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for(Conta conta : lista) {
                System.out.println(conta);
        }
    }
}