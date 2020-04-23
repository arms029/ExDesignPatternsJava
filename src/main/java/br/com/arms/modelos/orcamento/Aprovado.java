package br.com.arms.modelos.orcamento;

import java.math.BigDecimal;

public class Aprovado implements EstadoOrcamento{
    private boolean descontoAplicado = false;
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento){
        if (!descontoAplicado){
            orcamento.valor = orcamento.valor.subtract(orcamento.valor.multiply(new BigDecimal("0.02")));
            descontoAplicado = true;
            return;
        }
        
        throw new RuntimeException("Orçamento já possui um desconto aplicado no estado aprovado");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está aprovado!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos aprovados não podem ser reprovados!");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }

}