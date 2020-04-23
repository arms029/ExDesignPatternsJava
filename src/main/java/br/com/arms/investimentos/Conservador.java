package br.com.arms.investimentos;

import java.math.BigDecimal;

import br.com.arms.modelos.conta.Conta;



public class Conservador implements Investimento {

    @Override
    public BigDecimal calcula(Conta conta) {
        return conta.getSaldo().multiply(new BigDecimal("0.008"));
    }
}