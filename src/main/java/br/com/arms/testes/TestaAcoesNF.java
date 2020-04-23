package br.com.arms.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.arms.daos.NotaFiscalDao;
import br.com.arms.modelos.nota_fiscal.ItemDaNota;
import br.com.arms.modelos.nota_fiscal.NotaFiscal;
import br.com.arms.modelos.nota_fiscal.NotaFiscalBuilder;
import br.com.arms.utilidades.EnviadorDeEmail;
import br.com.arms.utilidades.EnviadorDeSms;
import br.com.arms.utilidades.Impressora;
import br.com.arms.utilidades.Multiplicador;

public class TestaAcoesNF {
    public static void main(String... args){
        
        NotaFiscal nf = new NotaFiscalBuilder()
            .paraEmpresa("ARMS")
            .comCnpj("12.345.678/0001-12")
            .comItem(new ItemDaNota("leite 1l", new BigDecimal("1.50")))
            .comItem(new ItemDaNota("refrigerante 1l", new BigDecimal("3.50")))
            .comItem(new ItemDaNota("frigideira inox", new BigDecimal("19.99")))
            .comObservacoes("compra no varejo")
            .naData(LocalDateTime.of(2020, 1, 31, 5, 32, 57))
            .addAcao(new EnviadorDeEmail())
            .addAcao(new EnviadorDeSms())
            .addAcao(new Impressora())
            .addAcao(new NotaFiscalDao())
            .addAcao(new Multiplicador(new BigDecimal("2")))
            .build();

        System.out.println(nf);
    }
}