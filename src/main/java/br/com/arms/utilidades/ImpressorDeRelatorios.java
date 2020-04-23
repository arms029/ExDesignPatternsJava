package br.com.arms.utilidades;

import java.util.List;

import br.com.arms.modelos.conta.Conta;
import br.com.arms.relatorios.Relatorio;

public class ImpressorDeRelatorios {
    public String imprimeRelatorio(List<Conta> contas, Relatorio relatorio){
        return relatorio.escrever(contas);
    }
}