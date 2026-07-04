package com.algaworks.tempo;

public class CalculadoraTempo {

// Caso as constantes tenham uma forte relação com a classe que irá utiliza-las
// então a melhor opção é criar-lá dentro da classe que irá utiliza-la:

//    public static final int SEGUNDOS_POR_HORA = 3600;

//    public static final int SEGUNDOS_POR_MINUTO = 60;

    public static double converterSegundosEmHoras(int segundos) {
        return (double) segundos / TempoConstantes.SEGUNDOS_POR_HORA;
    }

    public static double converterSegundosEmMinutos(int segundos) {
        return (double) segundos / TempoConstantes.SEGUNDOS_POR_MINUTO;
    }
}
