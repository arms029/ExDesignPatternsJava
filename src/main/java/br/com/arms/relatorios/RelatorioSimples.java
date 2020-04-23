package br.com.arms.relatorios;

import java.util.List;

import br.com.arms.modelos.conta.Conta;



public class RelatorioSimples extends TemplateRelatorio {

    @Override
    protected String cabecalho() {
        return "Banco: ARMS";
    }

    @Override
    protected String corpo(List<Conta> contas) {
        String corpo = "\n";

        for (Conta conta : contas) {
            corpo += "titular: " + conta.getTitular() + " ----- saldo: " + conta.getSaldo() + "\n";
        }

        return corpo;
    }

    @Override
    protected String rodape() {
        return "telefone: 011 12345-6789";
    }

}