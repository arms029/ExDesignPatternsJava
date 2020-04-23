package br.com.arms.testes;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.arms.modelos.conta.Conta;

public class TestaContaEstados {
    public static void main(String[] args){
        Conta conta = new Conta("arms", "ARMS", 1234, 5678, new BigDecimal("1000"), 
        "011 12345-6789", "Rua São Miguel, 98", "teste@email.com", LocalDate.now());

        conta.depositar(new BigDecimal("1000"));
        imprimirResultado(conta);
        conta.sacar(new BigDecimal("480"));
        imprimirResultado(conta);
        conta.sacar(new BigDecimal("2000"));
        imprimirResultado(conta);
        conta.depositar(new BigDecimal("500"));
        imprimirResultado(conta);
        conta.depositar(new BigDecimal("50"));
        imprimirResultado(conta);
        // conta.sacar(new BigDecimal("2000"));
        // imprimirResultado(conta);
    }

    private static void imprimirResultado(Conta conta) {
        System.out.println(conta.getSaldo());
        System.out.println(conta.getEstadoAtual());
    }
}