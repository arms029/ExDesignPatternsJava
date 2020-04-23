package br.com.arms.modelos.conta;

import java.math.BigDecimal;

public class SaldoNegativo implements EstadoConta {

    @Override
    public void sacar(Conta conta, BigDecimal valor) {
        throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
    }

    @Override
    public void depositar(Conta conta, BigDecimal valor) {
        conta.saldo = conta.saldo.add(valor.multiply(new BigDecimal("0.95")));
        if (conta.saldo.compareTo(new BigDecimal("0")) >= 0) conta.estadoAtual = new SaldoPositivo();
    }
}