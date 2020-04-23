package br.com.arms.testes;

import br.com.arms.investimentos.Arrojado;
import br.com.arms.investimentos.Investimento;
import br.com.arms.investimentos.Moderado;
import br.com.arms.modelos.conta.Conta;
import br.com.arms.testes.cria_objetos.CriaConta;
import br.com.arms.utilidades.RealizadorDeInvestimentos;

public class TestaChancesInvestimento {
    public static void main(String[] args) {
        Conta conta = CriaConta.criaUmaConta();
        
        RealizadorDeInvestimentos investir = new RealizadorDeInvestimentos();

        Investimento moderado = new Moderado();
        Investimento arrojado = new Arrojado();
        
        for (int i = 0; i < 10000; i++) {
            investir.realizaCalculo(conta, moderado);
        }
        Moderado.verificaChances();

        for (int i = 0; i < 10000; i++) {
            investir.realizaCalculo(conta, arrojado);
        }
        Arrojado.verificaChances();
    }
}