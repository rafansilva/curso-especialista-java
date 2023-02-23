package com.algaworks.auditoria;

public class EmpresaSimples extends PessoaJuridica {

    public static final double ALIQUOTA_IMPOSTOS_FATURAMENTO = 0.06;

    public EmpresaSimples(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        return getFaturamentoAnual() * ALIQUOTA_IMPOSTOS_FATURAMENTO;
    }
}
