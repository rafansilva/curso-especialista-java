package com.javabank;

public interface Conta {

    double geSaldo();

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta conta, double valor);

    void aplicarEmInvestimento(double valor);

}
