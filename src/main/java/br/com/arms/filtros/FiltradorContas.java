package br.com.arms.filtros;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.arms.modelos.conta.Conta;


public class FiltradorContas {
    public List<Conta> filtra(List<Conta> contas, Predicate<Conta> filtro) {
        List<Conta> resultado = new ArrayList<Conta>();
        for (Conta conta : contas) {
            if (filtro.test(conta)) {
                resultado.add(conta);
            }
        }
        return resultado;
    }
}