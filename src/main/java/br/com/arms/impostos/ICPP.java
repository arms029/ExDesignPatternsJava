package br.com.arms.impostos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;



public class ICPP extends TemplateImpostoCondicional{

    public ICPP(){}
    
    public ICPP(Imposto outroImposto){
        super(outroImposto);
    }

	@Override
    public BigDecimal taxaMin(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public BigDecimal taxaMax(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.07"));
    }

    //i = 5%*M se M <= 500
    //i = 7%*M se M > 500
    @Override
    public boolean usarTaxaMax(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) >= 0 ) 
            return true;

        return false;
    }
}