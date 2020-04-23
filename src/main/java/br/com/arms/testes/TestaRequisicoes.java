package br.com.arms.testes;


import br.com.arms.modelos.Formato;
import br.com.arms.modelos.Requisicao;
import br.com.arms.modelos.conta.Conta;
import br.com.arms.testes.cria_objetos.CriaConta;
import br.com.arms.utilidades.SelecionadorDeRequisicao;

public class TestaRequisicoes {
    public static void main(String[] args) {
        SelecionadorDeRequisicao selecionadorDeRequisicao = new SelecionadorDeRequisicao();
        Conta conta = CriaConta.criaUmaConta();
        
        String resposta;

        Requisicao requisicaoXML = new Requisicao(Formato.XML);
        Requisicao requisicaoCSV = new Requisicao(Formato.CSV);
        Requisicao requisicaoJSON = new Requisicao(Formato.JSON);
        Requisicao requisicaoPorCento = new Requisicao(Formato.PORCENTO);

        resposta = selecionadorDeRequisicao.seleciona(requisicaoXML, conta);
        System.out.println(resposta);

        resposta = selecionadorDeRequisicao.seleciona(requisicaoCSV, conta);
        System.out.println(resposta);

        resposta = selecionadorDeRequisicao.seleciona(requisicaoJSON, conta);
        System.out.println(resposta);

        resposta = selecionadorDeRequisicao.seleciona(requisicaoPorCento, conta);
        System.out.println(resposta);
        
    }
}