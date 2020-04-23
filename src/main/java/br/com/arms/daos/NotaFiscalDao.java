package br.com.arms.daos;

import br.com.arms.modelos.nota_fiscal.NotaFiscal;
import br.com.arms.utilidades.AcaoAposGerarNota;

public class NotaFiscalDao implements AcaoAposGerarNota{
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("nota gravada no banco de dados");
    }
}