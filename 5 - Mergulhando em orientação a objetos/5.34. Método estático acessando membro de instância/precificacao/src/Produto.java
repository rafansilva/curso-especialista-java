public class Produto {

    static double custoEmbalagem;
    double precoCusto;
    double precoVenda;

    // um metodo de classe não pode acessar uma variavel de instancia.
//    static double calcularCustosTotais() {
//        return this.precoCusto + Produto.custoEmbalagem;
//    }

    static double calcularCustosTotais(Produto produto) {
        return produto.precoCusto + Produto.custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    static void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    static void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f%n", custoEmbalagem);
    }
}
