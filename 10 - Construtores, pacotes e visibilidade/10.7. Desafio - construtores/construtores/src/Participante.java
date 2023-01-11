import java.util.Objects;

public class Participante {

    static final int SALDO_PONTOS_INICIAL = 0;

    String nome;
    int saldoDePontos;

    Participante(String nome) {
        this(nome, SALDO_PONTOS_INICIAL);
    }

    Participante(String nome, int saldoDePontosInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if (saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("Saldo de pontos inicial não pode ser negativo.");
        }

        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }
}
