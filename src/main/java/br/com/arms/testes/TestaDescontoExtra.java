package br.com.arms.testes;

import java.math.BigDecimal;

import br.com.arms.modelos.orcamento.Orcamento;



public class TestaDescontoExtra {
    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(new BigDecimal("500"));

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());
        
        reforma.aprova();

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());

        // reforma.finaliza();
        // reforma.aplicaDescontoExtra(); //É lançada uma exceção, orçamentos finalizados não podem receber desconto extra!
        // System.out.println(reforma.getValor());

    }
}