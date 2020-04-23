package br.com.arms.descontos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;

public class SemDesconto implements Desconto {

    @Override
    public BigDecimal desconto(Orcamento orcamento) {
        return new BigDecimal("0");
    }

    @Override
    public void setProximo(Desconto proximo) {
    }

}