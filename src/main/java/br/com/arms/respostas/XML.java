package br.com.arms.respostas;


import br.com.arms.modelos.Requisicao;
import br.com.arms.modelos.conta.Conta;

public class XML implements Resposta {

    private Resposta proximo;

    @Override
    public String enviaResposta(Requisicao req, Conta conta) {
        if (req.getFormato().toString() == "XML") {
            return ("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() +"</saldo></conta>");
        }
        return proximo.enviaResposta(req, conta);
    }

    @Override
    public void setProxima(Resposta proximo) {
        this.proximo = proximo;
    }

}