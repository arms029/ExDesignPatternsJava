package br.com.arms.respostas;


import br.com.arms.modelos.Requisicao;
import br.com.arms.modelos.conta.Conta;

public class JSON implements Resposta {

    private Resposta proximo;

    @Override
    public String enviaResposta(Requisicao req, Conta conta) {
        if (req.getFormato().toString() == "JSON") {
            return ("{ \"conta\": { \"titular\": \"" + conta.getTitular() + "\",\"saldo\": " + conta.getSaldo() + " } }");
        }
        return proximo.enviaResposta(req, conta);
    }

    @Override
    public void setProxima(Resposta proximo) {
        this.proximo = proximo;
    }
}