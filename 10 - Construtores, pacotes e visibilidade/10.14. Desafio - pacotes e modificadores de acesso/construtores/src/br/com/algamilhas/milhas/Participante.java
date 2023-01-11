package br.com.algamilhas.milhas;

import java.util.Objects;

public class Participante {

    static final int SALDO_PONTOS_INICIAL = 0;

    private String nome;
    private int saldoDePontos;

    public Participante(String nome) {
        this(nome, SALDO_PONTOS_INICIAL);
    }

    private Participante(String nome, int saldoDePontosInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if (saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("Saldo de pontos inicial não pode ser negativo.");
        }

        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }

    public void creditarPontos(int pontos) {
        if (pontos < 0) {
            throw new IllegalArgumentException("Pontos a creditar não pode ser negativo");
        }

        this.saldoDePontos += pontos;
    }

    public String getName(){
        return this.nome;
    }

    public int getSaldoPontosInicial(){
        return this.saldoDePontos;
    }

}
