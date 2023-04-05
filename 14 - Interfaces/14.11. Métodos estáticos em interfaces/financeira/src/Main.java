import com.algaworks.financeira.modelo.ClienteFinanciavel;
import com.algaworks.financeira.modelo.Fazenda;
import com.algaworks.financeira.modelo.Funcionario;
import com.algaworks.financeira.modelo.Industria;
import com.algaworks.financeira.servico.ServicoFinanciamento;

public class Main {

    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 5_000_000, false);
        var funcionario = new Funcionario("Rafael Silva", 18_000);

        System.out.println(ClienteFinanciavel.isFinanciamentoPequenoValor(500));

//        servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
//        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
//        servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
    }
}