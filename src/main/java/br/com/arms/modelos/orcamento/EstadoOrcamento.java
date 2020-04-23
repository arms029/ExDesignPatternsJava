package br.com.arms.modelos.orcamento;

public interface EstadoOrcamento {
    public void aplicaDescontoExtra(Orcamento orcamento);
    public void aprova(Orcamento orcamento);
    public void reprova(Orcamento orcamento);
    public void finaliza(Orcamento orcamento);
}