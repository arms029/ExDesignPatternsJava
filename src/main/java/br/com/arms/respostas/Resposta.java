package br.com.arms.respostas;


import br.com.arms.modelos.Requisicao;
import br.com.arms.modelos.conta.Conta;

public interface Resposta {
    public String enviaResposta(Requisicao req, Conta conta);
    public void setProxima(Resposta proximo);
}