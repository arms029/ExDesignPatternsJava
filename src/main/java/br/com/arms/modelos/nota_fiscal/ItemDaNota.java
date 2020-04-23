package br.com.arms.modelos.nota_fiscal;

import java.math.BigDecimal;

public class ItemDaNota {
    private String nome;
    private BigDecimal valor;

    public ItemDaNota(String nome, BigDecimal valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "ItemDaNota [nome=" + nome + ", valor=" + valor + "]";
    }

}
