package com.algaworks.seguradora.service;

import com.algaworks.seguradora.model.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        double valorPremio = bem.calcularValorPremio();

        System.out.println("------------------");
        System.out.println("Proposta de seguro");
        System.out.println("------------------");

        System.out.println(bem.descrever());

        System.out.printf("Prêmio: R$%.2f%n", valorPremio);
    }
}
