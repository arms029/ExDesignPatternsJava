package br.com.arms.modelos.orcamento;

import java.math.BigDecimal;

public class EmAprovacao implements EstadoOrcamento {
    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento){
        if (!descontoAplicado){
            orcamento.valor = orcamento.valor.subtract(orcamento.valor.multiply(new BigDecimal("0.05")));
            descontoAplicado = true;
            return;
        }
        
        throw new RuntimeException("Orçamento já possui um desconto aplicado no estado em aprovação");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Aprovado();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos em aprovação precisam ser aprovados primeiro antes de finalizados!");
    }
}