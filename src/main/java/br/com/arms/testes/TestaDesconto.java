package br.com.arms.testes;

import java.math.BigDecimal;

import br.com.arms.modelos.Item;
import br.com.arms.modelos.orcamento.Orcamento;
import br.com.arms.utilidades.CalculadorDeDescontos;

public class TestaDesconto {
    public static void main(String[] args) {
        CalculadorDeDescontos calcDesconto = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(new BigDecimal("1000.00"));
        adicionaItens(orcamento);

        BigDecimal descontoFinal = calcDesconto.calcula(orcamento);
        System.out.println(descontoFinal);
    }

    private static void adicionaItens(Orcamento orcamento) {
        orcamento.addItem(new Item("caneta",new BigDecimal("2.50")));
        orcamento.addItem(new Item("lápis",new BigDecimal("1.50")));
        orcamento.addItem(new Item("borracha",new BigDecimal("1.00")));
        orcamento.addItem(new Item("régua",new BigDecimal("5.00")));
        orcamento.addItem(new Item("microondas",new BigDecimal("490.00")));
        orcamento.addItem(new Item("ventilador",new BigDecimal("500.00")));
    }
}