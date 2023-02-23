package com.algaworks.auditoria;

public class PessoaFisica extends Pessoa{

    public static final double RECEITA_ANUAL_ISENCAO = 50000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitalAnual;

    public PessoaFisica(String nome, double receitalAnual) {
        super(nome);
        this.receitalAnual = receitalAnual;
    }

    public double getReceitalAnual() {
        return receitalAnual;
    }

    @Override
    public double calcularImpostos() {
        double impostos = receitalAnual * ALIQUOTA_IMPOSTO_RENDA;

        if (receitalAnual <= RECEITA_ANUAL_ISENCAO) {
           impostos = 0;
        }

        return impostos;
    }
}
