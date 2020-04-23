package br.com.arms.utilidades;

import br.com.arms.modelos.Requisicao;
import br.com.arms.modelos.conta.Conta;
import br.com.arms.respostas.CSV;
import br.com.arms.respostas.JSON;
import br.com.arms.respostas.PorCento;
import br.com.arms.respostas.Resposta;
import br.com.arms.respostas.SemResposta;
import br.com.arms.respostas.XML;

public class SelecionadorDeRequisicao {
    public String seleciona(Requisicao req, Conta conta){
        Resposta r1 = new JSON();
        Resposta r2 = new XML();
        Resposta r3 = new CSV();
        Resposta r4 = new PorCento();
        Resposta r5 = new SemResposta();

        r1.setProxima(r2);
        r2.setProxima(r3);
        r3.setProxima(r4);
        r4.setProxima(r5);

        return r1.enviaResposta(req, conta);
    }
}