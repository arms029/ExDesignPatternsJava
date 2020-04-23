package br.com.arms.utilidades;

import java.math.BigDecimal;

import br.com.arms.impostos.Imposto;
import br.com.arms.modelos.orcamento.Orcamento;


public class CalculadorDeImpostos {
    public BigDecimal realizaCalculo(Orcamento orcamento, Imposto imposto){
        return imposto.calcula(orcamento);
    }
}