package br.com.arms.utilidades;

import java.math.BigDecimal;

import br.com.arms.investimentos.Investimento;
import br.com.arms.modelos.conta.Conta;

public class RealizadorDeInvestimentos {
    public BigDecimal realizaCalculo(Conta conta, Investimento investimento){
        return investimento.calcula(conta);
    }

    public void investirValor(Conta conta, BigDecimal valor, BigDecimal descontoInvestimento){
        if (descontoInvestimento.compareTo(new BigDecimal("1")) > 0 || descontoInvestimento.compareTo(new BigDecimal("0")) < 0)
            throw new IllegalArgumentException("o valor do desconto deve ser um número entre 0 e 1 ");

        conta.depositar(valor.multiply(new BigDecimal("1").subtract(descontoInvestimento)));
    }
}