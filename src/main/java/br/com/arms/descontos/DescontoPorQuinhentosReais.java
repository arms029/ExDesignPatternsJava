package br.com.arms.descontos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;

public class DescontoPorQuinhentosReais implements Desconto {

    private Desconto proximo;

    @Override
    public BigDecimal desconto(Orcamento orcamento){
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) 
            return orcamento.getValor().multiply(new BigDecimal("0.07"));

        return proximo.desconto(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}