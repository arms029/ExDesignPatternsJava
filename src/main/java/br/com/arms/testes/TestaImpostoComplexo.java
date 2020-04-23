package br.com.arms.testes;

import java.math.BigDecimal;

import br.com.arms.impostos.ALTO;
import br.com.arms.impostos.ICMS;
import br.com.arms.impostos.ICPP;
import br.com.arms.impostos.IKCV;
import br.com.arms.impostos.ISS;
import br.com.arms.impostos.Imposto;
import br.com.arms.modelos.orcamento.Orcamento;


public class TestaImpostoComplexo {

    public static void main(String[] args){
        BigDecimal valor;
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto icpp = new ICPP();
        Imposto complexo = new ISS(new ICMS(new ICPP()));
        Imposto outroComplexo = new ICPP(new IKCV(new ALTO(new ISS())));

        Orcamento orcamento = new Orcamento(new BigDecimal("500"));

        //R$30,00
        valor = iss.calcula(orcamento);
        System.out.println(valor);
        //R$75,00
        valor = icms.calcula(orcamento);
        System.out.println(valor);
        //R$35,00
        valor = icpp.calcula(orcamento);
        System.out.println(valor);
        //Σi
        //R$140,00
        valor = complexo.calcula(orcamento);
        System.out.println(valor);
        //R$195,00
        valor = outroComplexo.calcula(orcamento);
        System.out.println(valor);

    }
    
}