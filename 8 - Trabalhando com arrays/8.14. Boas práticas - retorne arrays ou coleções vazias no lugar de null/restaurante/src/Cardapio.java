import java.util.ArrayList;

public class Cardapio {

    ArrayList<ItemCardapio> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item){
        itens.add(item);
    }

    void removerItem(int indice){
        itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if(item.possuiPrecoEntre(precoMinimo, precoMaximo)){
                item.imprimir();
            }
        }
    }

    public ArrayList<ItemCardapio> consultarItensBaratos(double precoMinimo, double precoMaximo) {
        ArrayList<ItemCardapio> itensEncontrados = new ArrayList<>();

        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                itensEncontrados.add(item);
            }
        }

        // boa pratica - sempre retornar uma coleçao ou array vazio;
        return itensEncontrados;

        // má pratica - pode causar NullPointerException
//        return itensEncontrados.isEmpty() ? null : itensEncontrados;
    }
}
