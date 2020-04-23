package br.com.arms.impostos;

import java.math.BigDecimal;

import br.com.arms.modelos.Item;
import br.com.arms.modelos.orcamento.Orcamento;


public class IKCV extends TemplateImpostoCondicional{

    public IKCV(){}
    
    public IKCV(Imposto outroImposto){
        super(outroImposto);
    }

    private boolean ItemValorMaiorCemReais(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor().compareTo(new BigDecimal("100")) > 0)
                return true;
        }
        return false;
    }

    @Override
    public BigDecimal taxaMin(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

    @Override
    public BigDecimal taxaMax(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.10"));
    }

    @Override
    public boolean usarTaxaMax(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0 && ItemValorMaiorCemReais(orcamento))
            return true;

        return false;
    }
}