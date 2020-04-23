package br.com.arms.testes;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.arms.impostos.ICCC;
import br.com.arms.impostos.Imposto;
import br.com.arms.modelos.orcamento.Orcamento;
import br.com.arms.utilidades.CalculadorDeImpostos;

public class TestaICCC {
    public static void main(String args[]){
        BigDecimal Valorimposto;
        
        Imposto iccc = new ICCC();

        Orcamento orcamento1 = new Orcamento(new BigDecimal("500"));
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"));
        Orcamento orcamento3 = new Orcamento(new BigDecimal("2000"));
        Orcamento orcamento4 = new Orcamento(new BigDecimal("3000"));
        Orcamento orcamento5 = new Orcamento(new BigDecimal("4000"));

        CalculadorDeImpostos calc = new CalculadorDeImpostos();

        //Calcula o valor do ICCC p/ o orçamento 1
        Valorimposto = calc.realizaCalculo(orcamento1,iccc);
        System.out.println(Valorimposto.setScale(2, RoundingMode.HALF_UP)); //R$25,00

        //Calcula o valor do ICCC p/ o orçamento 2
        Valorimposto = calc.realizaCalculo(orcamento2,iccc);
        System.out.println(Valorimposto.setScale(2, RoundingMode.HALF_UP)); //R$70,00

        //Calcula o valor do ICCC p/ o orçamento 3
        Valorimposto = calc.realizaCalculo(orcamento3,iccc);
        System.out.println(Valorimposto.setScale(2, RoundingMode.HALF_UP)); //R$140,00

        //Calcula o valor do ICCC p/ o orçamento 4
        Valorimposto = calc.realizaCalculo(orcamento4,iccc);
        System.out.println(Valorimposto.setScale(2, RoundingMode.HALF_UP)); //R$210,00

        //Calcula o valor do ICCC p/ o orçamento 5
        Valorimposto = calc.realizaCalculo(orcamento5,iccc);
        System.out.println(Valorimposto.setScale(2, RoundingMode.HALF_UP)); //R$350,00

    }
}