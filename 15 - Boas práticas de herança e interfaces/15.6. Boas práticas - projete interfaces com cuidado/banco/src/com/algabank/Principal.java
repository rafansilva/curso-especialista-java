package com.algabank;

import com.javabank.ContaCorrente;

public class Principal {

    public static void main(String[] args) {
        AuditoriaDecorator conta1 = new AuditoriaDecorator(new ContaCorrente());

        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.sacar(100);
        conta1.imprimirSaldo();

        System.out.printf("Saldo da conta 1: R$%.2f%n", conta1.getSaldo());
        System.out.printf("Quantidade de operações: %d%n", conta1.getQuantidadeOperacoes());
    }
}
