package br.com.arms.testes.cria_objetos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import br.com.arms.modelos.conta.Conta;



public class CriaConta {
    public static Conta criaUmaConta(){
        return new Conta("Pedro", "ARMS", 1234, 5678, new BigDecimal("1000"), 
        "011 12345-6789", "Rua São Miguel, 98", "teste@email.com", LocalDate.now());
    }

    public static ArrayList<Conta> criaListaConta(){
        ArrayList<Conta> lista = new ArrayList<Conta>();
        lista.add(new Conta("Pedro", "ARMS", 1234, 5555, new BigDecimal("1000"), 
        "011 12345-6789", "Rua São Miguel, 928", "teste@email.com", LocalDate.of(2020, 3, 19)));
        lista.add(new Conta("MISTER M", "ARMS", 1234, 5555, new BigDecimal("1000"), 
        "011 12345-6789", "Rua São Miguel, 928", "teste@email.com", LocalDate.now()));
        lista.add(new Conta("Mario", "ARMS", 2231, 5556, new BigDecimal("10000"), 
        "011 12345-6789", "Rua Sir Francis, 918", "chuchu@email.com", LocalDate.of(1991, 12, 31)));
        lista.add(new Conta("Marcella", "ARMS", 1111, 5433, new BigDecimal("1000000"), 
        "011 12345-6789", "Av São Jorge, 798", "mimi@email.com", LocalDate.of(2001, 11, 30)));
        lista.add(new Conta("Joao", "ARMS", 4534, 4343, new BigDecimal("500"), 
        "011 12345-6789", "Rua São Miguel, 698", "lala@email.com", LocalDate.of(1991, 12, 31)));
        lista.add(new Conta("Julio", "ARMS", 4444, 2990, new BigDecimal("200"), 
        "011 12345-6789", "Rua São Miguel, 298", "alway@email.com", LocalDate.of(1910, 7, 23)));
        lista.add(new Conta("Jorge", "ARMS", 3333, 2222, new BigDecimal("100"), 
        "011 12345-6789", "Rua São Visconde, 18", "hihihi@email.com", LocalDate.of(2005, 12, 31)));
        lista.add(new Conta("Leon", "ARMS", 6656, 2222, new BigDecimal("50"), 
        "011 12345-6789", "Rua São Carlos, 68", "teste@email.com", LocalDate.of(1910, 5, 22)));
        lista.add(new Conta("Amanda", "ARMS", 1221, 2232, new BigDecimal("1500"), 
        "011 12345-6789", "Av São Miguel, 98", "affs@email.com", LocalDate.of(1910, 10, 29)));
        lista.add(new Conta("Zeca Urubu", "ARMS", 6565, 2322, new BigDecimal("700"), 
        "011 12345-6789", "Rua do Carlos, 98", "chuchu@email.com", LocalDate.of(1910, 2, 25)));
        lista.add(new Conta("Pica pau", "ARMS", 4545, 2322, new BigDecimal("0.20"), 
        "011 12345-6789", "Rua São Miguel, 98", "mer@email.com", LocalDate.of(2020, 4, 13)));
        return lista;
    }
}