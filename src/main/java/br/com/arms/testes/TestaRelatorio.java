package br.com.arms.testes;

import java.util.List;

import br.com.arms.modelos.conta.Conta;
import br.com.arms.relatorios.Relatorio;
import br.com.arms.relatorios.RelatorioComplexo;
import br.com.arms.relatorios.RelatorioSimples;
import br.com.arms.testes.cria_objetos.CriaConta;
import br.com.arms.utilidades.ImpressorDeRelatorios;

public class TestaRelatorio {
    public static void main (String[] args){
        List<Conta> listaConta = CriaConta.criaListaConta();
        Relatorio complexo = new RelatorioComplexo();
        Relatorio simples = new RelatorioSimples();
        ImpressorDeRelatorios impressor = new ImpressorDeRelatorios();

        System.out.println(impressor.imprimeRelatorio(listaConta, complexo));
        System.out.println("\n****************************************\n");
        System.out.println(impressor.imprimeRelatorio(listaConta, simples));

    }
}