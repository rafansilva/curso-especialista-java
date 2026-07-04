import com.algaworks.estoque.Produto;
import com.algaworks.estoque.exception.ProdutoInativoException;
import com.algaworks.estoque.exception.ProdutoSemEstoqueException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);
        produto.ativar();

        comprar(produto);
    }

    public static void comprar(Produto produto) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Quantidade: ");
                int quatidade = scanner.nextInt();

                efetuarBaixaEstoque(produto, quatidade);
                System.out.println("Compra Efetuada!");

                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro na compra: " + e.getMessage());
            } catch (ProdutoSemEstoqueException e) {
                System.out.println("Erro na compra: " + e.getMessage());
            } catch (ProdutoInativoException e) {
                System.out.println("Erro na compra: " + e.getMessage());

                System.out.println("Deseja ativar o produto? ");

                if (scanner.nextBoolean()) {
                    produto.ativar();
                    System.out.println("Ok. Produto já foi ativado.");
                } else {
                    System.out.println("Ok. Compra não pode ser realizada");
                    break;
                }
            }
        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quatidade) {
        produto.retirarEstoque(quatidade);

        System.out.printf("%d unidade retiradas do estoque. Estoque atual: %d%n",
                quatidade, produto.getQuantidadeEstoque());
    }
}