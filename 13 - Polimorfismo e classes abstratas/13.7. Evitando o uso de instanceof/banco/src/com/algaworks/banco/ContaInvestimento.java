package com.algaworks.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public boolean possuiGratuidadeImpressao() {
        return getValorTotalRendimentos() > 0;
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros) {

        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(valorRendimentos);

    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + (getTitular() != null ? getTitular().getNome() : null)  +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", valorTotalRendimentos=" + getValorTotalRendimentos() +
                '}';
    }
}
