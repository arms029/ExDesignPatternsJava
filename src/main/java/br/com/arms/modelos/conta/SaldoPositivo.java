package br.com.arms.modelos.conta;

import java.math.BigDecimal;

public class SaldoPositivo implements EstadoConta {

    @Override
    public void sacar(Conta conta, BigDecimal valor) {
        conta.saldo = conta.saldo.subtract(valor);
        if (conta.saldo.compareTo(new BigDecimal("0")) < 0) conta.estadoAtual = new SaldoNegativo();
    }

    @Override
    public void depositar(Conta conta, BigDecimal valor) {
        conta.saldo = conta.saldo.add(valor.multiply(new BigDecimal("0.98")));
    }

}