package br.com.arms.relatorios;

import java.util.List;

import br.com.arms.modelos.conta.Conta;



public interface Relatorio {
    public String escrever(List<Conta> contas);
}