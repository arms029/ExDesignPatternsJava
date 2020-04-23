package br.com.arms.impostos;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;



public abstract class TemplateImpostoCondicional extends Imposto {

    public TemplateImpostoCondicional(Imposto outroImposto){
        super(outroImposto);
    }

    public TemplateImpostoCondicional(){}

	@Override
    public BigDecimal calcula(Orcamento orcamento) {
        if (usarTaxaMax(orcamento)) {
            return taxaMax(orcamento).add(addProximoImposto(orcamento));
        } else {
            return taxaMin(orcamento).add(addProximoImposto(orcamento));
        }
    }

    protected abstract BigDecimal taxaMin(Orcamento orcamento);

    protected abstract BigDecimal taxaMax(Orcamento orcamento);

    protected abstract boolean usarTaxaMax(Orcamento orcamento);

}