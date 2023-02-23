import com.algaworks.banco.CaixaEletronico;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaSalario;
import com.algaworks.banco.Titular;

public class Principal {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("Rafael Silva", "1234567899"), 1234,
                999999, 30);
        conta1.setLimiteChequeEspecial(1000);

        ContaEspecial conta2 = new ContaEspecial(new Titular("Gabriel Silva", "9876543211"), 4321,
                888888, 30);

        ContaSalario conta3 = new ContaSalario(new Titular("Berenice Silva", "9987654321"), 4421,
                77777, 18_000);

        conta1.depositar(300);

        caixaEletronico.transferir(conta1, conta3, 50);

        conta1.imprimirDemonstrativo();
        conta3.imprimirDemonstrativo();
    }
}
