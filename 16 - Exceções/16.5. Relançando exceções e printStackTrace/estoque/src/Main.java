import com.algaworks.estoque.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);
        produto.ativar();

        comprar(produto);
    }

    public static void comprar(Produto produto) {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Quantidade: ");
                int quatidade = scanner.nextInt();

                efetuarBaixaEstoque(produto, quatidade);
                System.out.println("Compra Efetuada!");

                break;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("Erro na compra: " + e.getMessage());
            }
        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quatidade) {
        produto.retirarEstoque(quatidade);

        System.out.printf("%d unidade retiradas do estoque. Estoque atual: %d%n",
                quatidade, produto.getQuantidadeEstoque());
    }
}