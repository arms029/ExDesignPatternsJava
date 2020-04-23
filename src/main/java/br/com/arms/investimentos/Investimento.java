package br.com.arms.investimentos;

import java.math.BigDecimal;

import br.com.arms.modelos.conta.Conta;

public interface Investimento {
    public BigDecimal calcula(Conta conta);
}