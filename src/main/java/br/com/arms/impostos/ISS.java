package br.com.arms.impostos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;



public class ISS extends Imposto {

    public ISS(){}

    public ISS(Imposto outroImposto){
            super(outroImposto);
    }

    //i = 6%*M
    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06")).add(addProximoImposto(orcamento));
    }
}