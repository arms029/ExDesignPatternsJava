package br.com.arms.utilidades;

import java.math.BigDecimal;

import br.com.arms.modelos.nota_fiscal.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota {

    private BigDecimal fator = new BigDecimal("0");

    public Multiplicador(BigDecimal fator){
        this.fator = fator;
    }

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("valor bruto multiplicado por " + this.fator + " :" + nf.getValorBruto().multiply(this.fator));
    }

}