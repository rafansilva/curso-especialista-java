package br.com.algamilhas;

import br.com.algamilhas.milhas.Participante;

public class Princital {

    public static void main(String[] args) {
        Participante participante1 = new Participante("Rafael");

        participante1.creditarPontos(10_000);

        System.out.printf("%s tem %d pontos%n", participante1.getName(), participante1.getSaldoPontosInicial());
    }
}
