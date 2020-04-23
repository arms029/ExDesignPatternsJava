package br.com.arms.relatorios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.com.arms.modelos.conta.Conta;



public class RelatorioComplexo extends TemplateRelatorio {

    @Override
    protected String cabecalho() {
        return "Banco: ARMS --- endereco: Rua Maria Estacio, 548 --- telefone: 011 12345-6789";
    }

    @Override
    protected String corpo(List<Conta> contas) {
        String corpo = "\n";

        for (Conta conta : contas) {
            corpo += "titular: " + conta.getTitular() + " ----- agência: " + conta.getAgencia() + 
            " ----- conta: " + conta.getConta() + " ----- saldo: " + conta.getSaldo() + "\n";
        }

        return corpo;
    }

    @Override
    protected String rodape() {
        return "email: banco@email.com --- data de emissão: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
}