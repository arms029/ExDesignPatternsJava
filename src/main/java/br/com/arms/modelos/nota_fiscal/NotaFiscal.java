package br.com.arms.modelos.nota_fiscal;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class NotaFiscal {
    private String razaoSocial;
    private String cnpj;
    private LocalDateTime dataEmissao;
    private BigDecimal valorBruto;
    private BigDecimal impostos;
    public List<ItemDaNota> itens;
    public String observacoes;

    public NotaFiscal(String razaoSocial, String cnpj, LocalDateTime dataEmissao, BigDecimal valorBruto,
            BigDecimal impostos, List<ItemDaNota> itens, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataEmissao = dataEmissao;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public BigDecimal getValorBruto() {
        return valorBruto;
    }

    public BigDecimal getImpostos() {
        return impostos;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public String getObservacoes() {
        return observacoes;
    }

    @Override
    public String toString() {
        return "NotaFiscal [cnpj=" + cnpj + ", dataEmissao=" + dataEmissao + ", impostos=" + impostos + ", itens="
                + itens + ", observacoes=" + observacoes + ", razaoSocial=" + razaoSocial + ", valorBruto=" + valorBruto
                + "]";
    }
    
}