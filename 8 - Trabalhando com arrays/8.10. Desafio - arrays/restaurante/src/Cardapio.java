import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indiceDeExclusao) {
        ItemCardapio[] novosItens = new ItemCardapio[itens.length - 1];

        System.arraycopy(itens, 0, novosItens, 0, indiceDeExclusao);

        System.arraycopy(itens, indiceDeExclusao + 1, novosItens,
                indiceDeExclusao, novosItens.length - indiceDeExclusao);

        itens = novosItens;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

}
