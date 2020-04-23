package br.com.arms.modelos.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.arms.modelos.Item;

public class Orcamento {
    
    protected BigDecimal valor;
    private List<Item> itens;
    protected EstadoOrcamento estadoAtual;

    public Orcamento(BigDecimal valor){
         this.valor = valor;
         this.itens = new ArrayList<Item>();
         this.estadoAtual = new EmAprovacao();
    }

    public EstadoOrcamento getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void addItem(Item item){
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public boolean contemItemDeNome(String nomeItem){
        for (Item item : itens) {
            if (item.getNome().equals(nomeItem)) return true;
        }
        return false;
    }

	public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }
    
    public void aprova(){
        estadoAtual.aprova(this);
    }
    public void reprova(){
        estadoAtual.reprova(this);
    }
    public void finaliza(){
        estadoAtual.finaliza(this);
    }



}