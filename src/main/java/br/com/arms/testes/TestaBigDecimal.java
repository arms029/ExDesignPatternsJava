package br.com.arms.testes;

import java.math.BigDecimal;

public class TestaBigDecimal {
    public static void main(String[] args){
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.1");

        System.out.println(a.add(b));
    }
}