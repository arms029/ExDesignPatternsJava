package br.com.arms.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.arms.modelos.nota_fiscal.ItemDaNota;
import br.com.arms.modelos.nota_fiscal.NotaFiscal;
import br.com.arms.modelos.nota_fiscal.NotaFiscalBuilder;

public class TestaNotaFiscal {
    public static void main(String[] args) {

        NotaFiscal nf = new NotaFiscalBuilder()
            .paraEmpresa("ARMS")
            .comCnpj("12.345.678/0001-12")
            .comItem(new ItemDaNota("leite 1l", new BigDecimal("1.50")))
            .comItem(new ItemDaNota("refrigerante 1l", new BigDecimal("3.50")))
            .comItem(new ItemDaNota("frigideira inox", new BigDecimal("19.99")))
            .comObservacoes("compra no varejo")
            .naData(LocalDateTime.of(2020, 1, 31, 5, 32, 57))
            .build();

        System.out.println(nf);
    }
}