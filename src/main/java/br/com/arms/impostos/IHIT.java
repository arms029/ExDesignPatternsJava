package br.com.arms.impostos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.arms.modelos.Item;
import br.com.arms.modelos.orcamento.Orcamento;

//EXERCÍCIO
//Crie o imposto IHIT, que tem a seguinte regra:
//caso existam 2 itens com o mesmo nome, o imposto deve ser de 13% mais R$100,00.
//Caso contrário, o valor do imposto deverá ser (1% * o número de ítens no orçamento).
public class IHIT extends TemplateImpostoCondicional {

    public IHIT(){}
    
    public IHIT(Imposto outroImposto){
        super(outroImposto);
    }

    @Override
    protected BigDecimal taxaMin(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal((0.01*orcamento.getItens().size())));
    }

    @Override
    protected BigDecimal taxaMax(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.13")).add(new BigDecimal("100"));
    }

    @Override
    protected boolean usarTaxaMax(Orcamento orcamento) {
        List<String> noOrcamento = new ArrayList<String>();

        for (Item item : orcamento.getItens()){
            if (noOrcamento.contains(item.getNome())) return true;
            else noOrcamento.add(item.getNome());
        }

        return false;
    }

}