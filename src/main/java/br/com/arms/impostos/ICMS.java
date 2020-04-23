package br.com.arms.impostos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;

public class ICMS extends Imposto{

    public ICMS(){}
    
    public ICMS(Imposto outroImposto){
        super(outroImposto);
    }

    //i = 5%*M + 50
    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05")).add(new BigDecimal("50")).add(addProximoImposto(orcamento));
    }
}