package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)) {
            return 1.0;
        }

        if (isFinancimentoGrandeValor(valorSolicitado)) {
            return 1.5;
        }

        return 2.0;
    }

    private static boolean isFinancimentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 100_000_000;
    }

    private static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }

}
