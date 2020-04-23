package br.com.arms.utilidades;

import br.com.arms.modelos.nota_fiscal.NotaFiscal;

public interface AcaoAposGerarNota {
    void executa(NotaFiscal nf);
}