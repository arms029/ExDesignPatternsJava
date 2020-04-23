package br.com.arms.investimentos;

import java.math.BigDecimal;
import java.util.Random;

import br.com.arms.modelos.conta.Conta;

public class Moderado implements Investimento {

    private static double qtdeChamadas;
    private static double cinquentaPorCento;
    private static double outrosCinquentaPorCento;
    private Random random;

    public Moderado(){
        this.random = new Random();
    }

    @Override
    public BigDecimal calcula(Conta conta) {
        qtdeChamadas++;
        boolean acerto = random.nextDouble() <= 0.50;

        //Chance de 50%
        if (acerto == true) {
            cinquentaPorCento++;
            return conta.getSaldo().multiply(new BigDecimal("0.025"));
        }
        
        //Chance de 50%
        outrosCinquentaPorCento++;
        return conta.getSaldo().multiply(new BigDecimal("0.007"));
    }
    //Método de teste para testar as chances de determinado tipo de investimento
    public static void verificaChances(){
        System.out.println("MODERADO");
        System.out.println("Chance de investimento maior: " + cinquentaPorCento * 100 /qtdeChamadas + "%");
        System.out.println("Chance de investimento menor: " + outrosCinquentaPorCento * 100 /qtdeChamadas + "%");
    }
}