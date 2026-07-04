import com.algaworks.loja.Carrinho;
import com.algaworks.loja.ItemCarrinho;
import com.algaworks.loja.pagamento.CartaoCredito;
import com.algaworks.loja.pagamento.MetodoPagamento;
import com.algaworks.loja.pagamento.Transferencia;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Mouse", 600));

        MetodoPagamento metodoPagamento = new Transferencia("123123", "123123");

        carrinho.finalizar(metodoPagamento);
    }
}