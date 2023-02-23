package com.algaworks.auditoria;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void adicionar(Pessoa pessoa) {
        valorTotalImpostos += pessoa.calcularImpostos();
        imprimir(pessoa);
    }

    public void imprimir(Pessoa pessoa) {
        System.out.printf("Impostos devido de %s: %.2f%n", pessoa.getNome(), pessoa.calcularImpostos());
    }
}
