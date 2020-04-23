package br.com.arms.utilidades;

import java.math.BigDecimal;

import br.com.arms.descontos.Desconto;
import br.com.arms.descontos.DescontoPorCincoItens;
import br.com.arms.descontos.DescontoPorQuinhentosReais;
import br.com.arms.descontos.DescontoPorVendaCasada;
import br.com.arms.descontos.SemDesconto;
import br.com.arms.modelos.orcamento.Orcamento;


public class CalculadorDeDescontos {
    public BigDecimal calcula(Orcamento orcamento){
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorQuinhentosReais();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);

        return d1.desconto(orcamento);
    }
}