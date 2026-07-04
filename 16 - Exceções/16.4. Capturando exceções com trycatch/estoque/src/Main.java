import com.algaworks.estoque.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);
//        produto.ativar();

        comprar(produto);
    }

    public static void comprar(Produto produto) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade: ");
        int quatidade = scanner.nextInt();

        efetuarBaixaEstoque(produto, quatidade);
        System.out.println("Compra Efetuada!");
    }

    private static void efetuarBaixaEstoque(Produto produto, int quatidade) {
        try {
            produto.retirarEstoque(quatidade);

            System.out.printf("%d unidade retiradas do estoque. Estoque atual: %d%n",
                    quatidade, produto.getQuantidadeEstoque());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao efetuar baixa no estoque: " + e.getMessage());
        }
    }
}