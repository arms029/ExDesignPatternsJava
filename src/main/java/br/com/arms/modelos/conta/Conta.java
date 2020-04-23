package br.com.arms.modelos.conta;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Conta {
    private String titular;
    private String banco;
    private Integer agencia;
    private Integer conta;
    protected BigDecimal saldo;
    private String phone;
    private String endereco;
    private String email;
    private LocalDate dataAbertura;
    protected EstadoConta estadoAtual;

    public Conta(String titular, String banco, Integer agencia, Integer conta, 
                BigDecimal saldo, String phone, String endereco, String email, LocalDate dataAbertura) {
        validarConta(titular, banco, agencia, conta, saldo);

        if (saldo.compareTo(new BigDecimal("0")) >= 0) this.estadoAtual = new SaldoPositivo();
        else                                           this.estadoAtual = new SaldoNegativo();

        this.titular = titular;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.phone = phone;
        this.endereco = endereco;
        this.email = email;
        this.dataAbertura = dataAbertura;
    }

    public void depositar(BigDecimal valor) {
        estadoAtual.depositar(this, valor);
    }
    public void sacar(BigDecimal valor) {
        estadoAtual.sacar(this, valor);
    }

    private void validarConta(String titular, String banco, Integer agencia, Integer conta, BigDecimal saldo) {
        if (agencia < 0)
            throw new IllegalArgumentException("O número da agência não pode ser negativo");
        if (conta < 0)
            throw new IllegalArgumentException("O número da conta não pode ser negativo");
        if (titular == null || titular.isEmpty())
            throw new IllegalArgumentException("O campo titular não pode ser nulo ou vazio");
        if (banco == null || banco.isEmpty())
            throw new IllegalArgumentException("O campo banco não pode ser nulo ou vazio");
        if (saldo == null)
            throw new IllegalArgumentException("O campo saldo não pode ser nulo ou vazio");
    }

    @Override
    public String toString() {
        return "\nagencia=" + agencia + ", banco=" + banco + ", conta=" + conta + ", dataAbertura=" + dataAbertura
                + ", email=" + email + ", endereco=" + endereco + ", phone=" + phone + ", saldo=" + saldo + ", titular="
                + titular;
    }

    //GETTERS AND SETTERS
    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public String getTitular() {
        return titular;
    }

    public String getBanco() {
        return banco;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getConta() {
        return conta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public String getPhone() {
        return phone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public EstadoConta getEstadoAtual() {
        return estadoAtual;
    }


}