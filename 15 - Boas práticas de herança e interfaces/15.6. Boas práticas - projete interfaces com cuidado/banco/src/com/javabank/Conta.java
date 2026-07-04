package com.javabank;

public interface Conta {

    double getSaldo();

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta conta, double valor);

    void aplicarInvestimento(double valor);

    default void imprimirSaldo() {
        System.out.printf("Seu saldo é de: R$%.2f%n", getSaldo());
    }
}
