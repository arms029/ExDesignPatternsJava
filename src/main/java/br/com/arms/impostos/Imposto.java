package br.com.arms.impostos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;


public abstract class Imposto {

    protected Imposto outroImposto;

    public Imposto(Imposto outroImposto){
        this.outroImposto = outroImposto;
    }

    public Imposto(){
        this.outroImposto = null;
    }

    public abstract BigDecimal calcula(Orcamento orcamento);

    protected BigDecimal addProximoImposto(Orcamento orcamento) {
        if (outroImposto == null) 
            return BigDecimal.ZERO;

        return outroImposto.calcula(orcamento);
    }
}