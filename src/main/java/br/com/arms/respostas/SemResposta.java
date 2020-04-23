package br.com.arms.respostas;


import br.com.arms.modelos.Requisicao;
import br.com.arms.modelos.conta.Conta;

public class SemResposta implements Resposta {

    @Override
    public String enviaResposta(Requisicao req, Conta conta) {
        throw new RuntimeException("Formato de resposta não encontrado");
    }

    @Override
    public void setProxima(Resposta proximo) {
    }

}