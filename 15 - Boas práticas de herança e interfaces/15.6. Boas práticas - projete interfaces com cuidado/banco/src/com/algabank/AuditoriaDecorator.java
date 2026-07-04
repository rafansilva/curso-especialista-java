package com.algabank;

import com.javabank.Conta;

public class AuditoriaDecorator extends ContaBaseDecorator{

    private int quantidadeOperacoes;

    public AuditoriaDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    public int getQuantidadeOperacoes() {
        return quantidadeOperacoes;
    }

    @Override
    public void sacar(double valor) {
        quantidadeOperacoes++;
        getContaOriginal().sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        quantidadeOperacoes++;
        getContaOriginal().depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        quantidadeOperacoes++;
        getContaOriginal().transferir(conta, valor);
    }

    @Override
    public void aplicarInvestimento(double valor) {
        quantidadeOperacoes++;
        getContaOriginal().aplicarInvestimento(valor);
    }

    @Override
    public void imprimirSaldo() {
        quantidadeOperacoes++;
        getContaOriginal().imprimirSaldo();
    }
}
