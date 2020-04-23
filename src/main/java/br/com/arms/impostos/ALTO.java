package br.com.arms.impostos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;

public class ALTO extends Imposto {
    public ALTO(){}

    public ALTO(Imposto outroImposto){
        super(outroImposto);
    }
    //i = 20%*M
    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.20")).add(addProximoImposto(orcamento)); 
    }
}