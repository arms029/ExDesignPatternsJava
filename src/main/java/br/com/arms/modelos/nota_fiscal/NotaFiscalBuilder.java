package br.com.arms.modelos.nota_fiscal;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.arms.utilidades.AcaoAposGerarNota;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    private BigDecimal valorBruto = new BigDecimal("0");
    private BigDecimal impostos = new BigDecimal("0");
    private String observacoes;
    private LocalDateTime data;

    private List<AcaoAposGerarNota> executarAcoes;
    
    public NotaFiscalBuilder() {
        this.data = LocalDateTime.now();
        this.executarAcoes = new ArrayList<AcaoAposGerarNota>();
    }

    public NotaFiscalBuilder addAcao(AcaoAposGerarNota acao){
        this.executarAcoes.add(acao);
        return this;
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto = valorBruto.add(item.getValor());
        impostos = impostos.add(item.getValor().multiply(new BigDecimal("0.05")));
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naData(LocalDateTime data) {
        this.data = data;
        return this;
    }

    public NotaFiscal build() {
        NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
        executarAcoes.forEach(acao -> acao.executa(nf));
        return nf;
    }

}