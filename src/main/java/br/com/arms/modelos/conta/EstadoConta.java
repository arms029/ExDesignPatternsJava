package br.com.arms.modelos.conta;

import java.math.BigDecimal;

public interface EstadoConta {
    public void sacar(Conta conta, BigDecimal valor);
    public void depositar(Conta conta, BigDecimal valor);
}