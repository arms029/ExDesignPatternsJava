package br.com.arms.utilidades;

import br.com.arms.modelos.nota_fiscal.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("nota enviada por sms");
    }
}