package com.algaworks.tempo;


//Caso as constantes não tenham uma relação forte com a classe que está utilizando ela, então a melhor opção
// é criar uma classe utilitária final para declarar essas constantes:
public final class TempoConstantes {

    public static final int SEGUNDOS_POR_HORA = 3600;

    public static final int SEGUNDOS_POR_MINUTO = 60;

    // classe utilitária para não poder ser instanciada e herdada.
    private TempoConstantes() {
    }
}
