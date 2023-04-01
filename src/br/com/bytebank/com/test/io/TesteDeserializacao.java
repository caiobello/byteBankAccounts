package br.com.bytebank.com.test.io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDeserializacao {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    	
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
            ContaCorrente cc = (ContaCorrente) ois.readObject();
            ois.close();
           
            System.out.println("Saldo: " + cc.getSaldo());
            System.out.println("Nome: " + cc.getTitular().getNome());
            System.out.println("Agencia: " + cc.getAgencia() + " Numero: " + cc.getNumero());
          
    }

}