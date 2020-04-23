package br.com.arms.descontos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;

public class DescontoPorCincoItens implements Desconto{

    private Desconto proximo;

    @Override
    public BigDecimal desconto(Orcamento orcamento){
        if (orcamento.getItens().size() > 5)
            return orcamento.getValor().multiply(new BigDecimal("0.1"));

        return proximo.desconto(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}