package com.algabank;

import com.javabank.Conta;
import com.javabank.ContaCorrente;

import java.util.Objects;

public class ContaCorrenteComTributacao implements Conta {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    private Conta contaOriginal;

    public ContaCorrenteComTributacao(Conta contaOriginal) {
        Objects.requireNonNull(contaOriginal);
        this.contaOriginal = contaOriginal;
    }

    @Override
    public double geSaldo() {
        return contaOriginal.geSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void aplicarInvestimento(double valor) {
        contaOriginal.aplicarInvestimento(valor);
        debitarImpostoMovimentacao(valor);
    }

    public void debitarImpostoMovimentacao(double valor) {
        contaOriginal.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}
