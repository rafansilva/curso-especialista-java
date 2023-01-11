import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    final String codigo;
    String nome;
    int quantidadeEstoque;

    Produto(){
        this("Sem nome");
    }

    Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    Produto(String nome, int quantidadeEstoque) {
        Objects.requireNonNull(nome, "Nome é obrigatório.");

        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.codigo = UUID.randomUUID().toString();
    }
}
