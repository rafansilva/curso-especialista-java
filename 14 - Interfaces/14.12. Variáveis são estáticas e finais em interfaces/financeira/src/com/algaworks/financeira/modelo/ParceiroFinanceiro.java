package com.algaworks.financeira.modelo;

public class ParceiroFinanceiro extends Empresa {

    private double valorTotalAplicado;

    public ParceiroFinanceiro(String razaoSocial, double totalFaturamento, double valorTotalAplicado) {
        super(razaoSocial, totalFaturamento);
        this.valorTotalAplicado = valorTotalAplicado;
    }

    public double getValorTotalAplicado() {
        return valorTotalAplicado;
    }

    public void adicionarNovaAplicacao(double valorAplicado) {
        this.valorTotalAplicado += valorAplicado;
    }
}
