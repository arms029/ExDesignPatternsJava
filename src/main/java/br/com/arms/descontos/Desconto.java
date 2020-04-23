package br.com.arms.descontos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;

public interface Desconto {
    public BigDecimal desconto(Orcamento orcamento);
    public void setProximo(Desconto proximo);
}