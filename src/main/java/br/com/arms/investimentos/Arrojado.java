package br.com.arms.investimentos;

import java.math.BigDecimal;
import java.util.Random;

import br.com.arms.modelos.conta.Conta;

public class Arrojado implements Investimento {

    private static double qtdeChamadas;
    private static double vintePorCento;
    private static double trintaPorCento;
    private static double cinquentaPorCento;
    private Random random;

    public Arrojado(){
        this.random = new Random();
    }

    @Override
    public BigDecimal calcula(Conta conta) {
        qtdeChamadas++;
        Double chance = random.nextDouble();

        //Chance de 20%
        if (chance <= 0.20) {
            vintePorCento++;
            return conta.getSaldo().multiply(new BigDecimal("0.05"));
        }

        //Chance de 30%
        if (chance <= 0.50) {
            trintaPorCento++;
            return conta.getSaldo().multiply(new BigDecimal("0.03"));
        }
        
        //Chance de 50%
        cinquentaPorCento++;
        return conta.getSaldo().multiply(new BigDecimal("0.006"));
    }
    //Método de teste para testar as chances de determinado tipo de investimento
    public static void verificaChances(){
        System.out.println("ARROJADO");
        System.out.println("Chance de investimento maior: " + vintePorCento * 100 /qtdeChamadas + "%");
        System.out.println("Chance de investimento médio: " + trintaPorCento * 100 /qtdeChamadas + "%");
        System.out.println("Chance de investimento menor: " + cinquentaPorCento * 100 /qtdeChamadas + "%");
    }
}