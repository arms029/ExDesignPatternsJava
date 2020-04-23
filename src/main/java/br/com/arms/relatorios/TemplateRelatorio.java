package br.com.arms.relatorios;

import java.util.List;

import br.com.arms.modelos.conta.Conta;



public abstract class TemplateRelatorio implements Relatorio {

    @Override
    public String escrever(List<Conta> contas) {
        return cabecalho() + "\n-----------------------------------------------------------------------------\n" + 
                   corpo(contas) + "\n-----------------------------------------------------------------------------\n" + 
                   rodape();
    }

    protected abstract String cabecalho();

    protected abstract String corpo(List<Conta> contas);

    protected abstract String rodape();
}