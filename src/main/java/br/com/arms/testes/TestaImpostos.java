package br.com.arms.testes;

import java.math.BigDecimal;

import br.com.arms.impostos.ICMS;
import br.com.arms.impostos.ISS;
import br.com.arms.impostos.Imposto;
import br.com.arms.modelos.orcamento.Orcamento;
import br.com.arms.utilidades.CalculadorDeImpostos;

public class TestaImpostos {
    public static void main(String args[]){
        BigDecimal Valorimposto;
        
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadorDeImpostos calc = new CalculadorDeImpostos();

        //Calcula o valor do ICMS
        Valorimposto = calc.realizaCalculo(orcamento,icms);
        System.out.println(Valorimposto);

        //Calcula o valor do ISS
        Valorimposto = calc.realizaCalculo(orcamento,iss);
        System.out.println(Valorimposto);

    }
}