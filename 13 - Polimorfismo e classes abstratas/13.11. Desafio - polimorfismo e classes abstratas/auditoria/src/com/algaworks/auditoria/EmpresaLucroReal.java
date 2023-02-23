package com.algaworks.auditoria;

public class EmpresaLucroReal extends PessoaJuridica{

    public static final double ALIQUOTA_IMPOSTOS_LUCRO = 0.25;

    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        return getLucroAnual() * ALIQUOTA_IMPOSTOS_LUCRO;
    }
}
