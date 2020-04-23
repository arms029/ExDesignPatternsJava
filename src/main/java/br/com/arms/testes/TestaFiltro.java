package br.com.arms.testes;

import java.util.List;
import java.util.function.Predicate;

import br.com.arms.filtros.ConstantesFraudes;
import br.com.arms.filtros.FiltradorContas;
import br.com.arms.modelos.conta.Conta;
import br.com.arms.testes.cria_objetos.CriaConta;

public class TestaFiltro {

    public static void main(String args[]){
        List<Conta> contas = CriaConta.criaListaConta();
        FiltradorContas filtrador = new FiltradorContas();

        Predicate<Conta> saldoAlto = c -> c.getSaldo().compareTo(ConstantesFraudes.SALDO_ALTO_SUSPEITO) > 0;
        Predicate<Conta> saldoBaixo = c -> c.getSaldo().compareTo(ConstantesFraudes.SALDO_BAIXO_SUSPEITO) < 0;
        Predicate<Conta> abertaPorUmMes = c -> c.getDataAbertura().compareTo(ConstantesFraudes.UM_MES_ATRAS_SUSPEITO) > 0;

        System.out.println("-----------------SALDO-ALTO---------------------------------------------");
        System.out.println(filtrador.filtra(contas, saldoAlto));
        System.out.println("-----------------SALDO-BAIXO--------------------------------------------");
        System.out.println(filtrador.filtra(contas, saldoBaixo));
        System.out.println("-----------------ABERTA-POR-MENOS-DE-UM-MES-----------------------------");
        System.out.println(filtrador.filtra(contas, abertaPorUmMes));

    }
}