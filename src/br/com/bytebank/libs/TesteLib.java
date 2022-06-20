package br.com.bytebank.libs;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLib {

	
	
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 123);
		
		conta.deposita(100);
		
		System.out.println(conta.getSaldo());
	}
}
