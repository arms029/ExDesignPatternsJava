package br.com.arms.descontos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximo;

    @Override
    public BigDecimal desconto(Orcamento orcamento){
        if (orcamento.contemItemDeNome("lápis") && orcamento.contemItemDeNome("caneta")) 
            return orcamento.getValor().multiply(new BigDecimal("0.05"));

        return proximo.desconto(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

}