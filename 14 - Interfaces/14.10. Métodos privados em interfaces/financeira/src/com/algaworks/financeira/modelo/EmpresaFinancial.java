package com.algaworks.financeira.modelo;

public abstract class EmpresaFinancial extends Empresa implements ClienteFinanciavel{

    public EmpresaFinancial(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularJuros(double valorSolicitado) {
        return 0.8;
    }
}
