import com.algaworks.estoque.Produto;
import com.algaworks.estoque.exception.BaixaEstoqueException;
import com.algaworks.estoque.exception.ProdutoException;
import com.algaworks.estoque.exception.ProdutoInativoException;

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
            } catch (BaixaEstoqueException e) {
                System.out.println("Erro na compra: " + e.getCause().getMessage());
            }
        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quatidade) throws BaixaEstoqueException {
        try {
            produto.retirarEstoque(quatidade);

            System.out.printf("%d unidade retiradas do estoque. Estoque atual: %d%n",
                    quatidade, produto.getQuantidadeEstoque());
        } catch (IllegalArgumentException | ProdutoException e) {
            throw new BaixaEstoqueException("Erro ao dar baixa no estoque.", e);
        }
    }
}