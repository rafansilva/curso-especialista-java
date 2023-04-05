import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.pagamento.Beneficiario;
import com.algaworks.contaspagar.pagamento.MetodoPagamento;
import com.algaworks.contaspagar.pagamento.Pix;
import com.algaworks.contaspagar.pagamento.Transferencia;
import com.algaworks.contaspagar.servico.ServicoContaPagar;

public class Principal {

    public static void main(String[] args) {
//        MetodoPagamento metodoPagamento = new Pix();
        MetodoPagamento metodoPagamento = new Transferencia();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Rafael Silva", "11955889979", "66548777");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria Ralphs Treinamentos", "11988774455", "66988544");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);
    }
}
