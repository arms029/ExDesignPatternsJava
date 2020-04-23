package br.com.arms.testes;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.arms.impostos.IHIT;
import br.com.arms.impostos.Imposto;
import br.com.arms.modelos.Item;
import br.com.arms.modelos.orcamento.Orcamento;
import br.com.arms.utilidades.CalculadorDeImpostos;

public class TestaIHIT {
    public static void main(String args[]){
        BigDecimal Valorimposto;
        
        Imposto ihit = new IHIT();

        Orcamento orcamento = new Orcamento(new BigDecimal("1000"));
        adicionaItens(orcamento);

        CalculadorDeImpostos calc = new CalculadorDeImpostos();

        Valorimposto = calc.realizaCalculo(orcamento,ihit);
        System.out.println(Valorimposto.setScale(2, RoundingMode.HALF_UP)); //R$25,00

    }
    
    private static void adicionaItens(Orcamento orcamento) {
        orcamento.addItem(new Item("caneta",new BigDecimal("2.50")));
        // orcamento.addItem(new Item("caneta",new BigDecimal("2.50")));
        orcamento.addItem(new Item("lápis",new BigDecimal("1.50")));
        orcamento.addItem(new Item("borracha",new BigDecimal("1.00")));
        orcamento.addItem(new Item("régua",new BigDecimal("5.00")));
        orcamento.addItem(new Item("microondas",new BigDecimal("490.00")));
        orcamento.addItem(new Item("ventilador",new BigDecimal("500.00")));
    }
}