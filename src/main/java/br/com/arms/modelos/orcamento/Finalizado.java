package br.com.arms.modelos.orcamento;

public class Finalizado implements EstadoOrcamento{
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento){
        throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está finalizado!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está finalizado!");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está finalizado!");
    }

}