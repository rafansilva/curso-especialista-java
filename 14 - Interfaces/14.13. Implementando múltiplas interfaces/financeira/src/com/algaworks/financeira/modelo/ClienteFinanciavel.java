package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    double JUROS_BAIXO_RISCO = 1.0;

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)) {
            return JUROS_BAIXO_RISCO;
        }

        if (isFinancimentoGrandeValor(valorSolicitado)) {
            return 1.5;
        }

        return 2.0;
    }

    static boolean isFinancimentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 100_000_000;
    }

    static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }

}
