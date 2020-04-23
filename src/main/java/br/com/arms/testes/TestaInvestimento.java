package br.com.arms.testes;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.arms.investimentos.Arrojado;
import br.com.arms.investimentos.Conservador;
import br.com.arms.investimentos.Investimento;
import br.com.arms.investimentos.Moderado;
import br.com.arms.modelos.conta.Conta;
import br.com.arms.testes.cria_objetos.CriaConta;
import br.com.arms.utilidades.RealizadorDeInvestimentos;

public class TestaInvestimento {
    public static void main(String args[]){
        BigDecimal valor;
        Conta conta = CriaConta.criaUmaConta();

        Investimento conservador = new Conservador();
        Investimento moderado = new Moderado();
        Investimento arrojado = new Arrojado();

        RealizadorDeInvestimentos investimento = new RealizadorDeInvestimentos();

        valor = investimento.realizaCalculo(conta, conservador);
        System.out.println(valor.setScale(2, RoundingMode.HALF_UP));
        investimento.investirValor(conta, valor, new BigDecimal("0.25"));
        System.out.println(conta.getSaldo().setScale(2, RoundingMode.HALF_UP));

        valor = investimento.realizaCalculo(conta, moderado);
        System.out.println(valor.setScale(2, RoundingMode.HALF_UP));
        investimento.investirValor(conta, valor, new BigDecimal("0.25"));
        System.out.println(conta.getSaldo().setScale(2, RoundingMode.HALF_UP));

        valor = investimento.realizaCalculo(conta, arrojado);
        System.out.println(valor.setScale(2, RoundingMode.HALF_UP));
        investimento.investirValor(conta, valor, new BigDecimal("0.25"));
        System.out.println(conta.getSaldo().setScale(2, RoundingMode.HALF_UP));

    }
}