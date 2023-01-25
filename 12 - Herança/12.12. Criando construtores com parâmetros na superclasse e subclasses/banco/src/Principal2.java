import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        Titular titular = new Titular("Rafael Silva", "12345678999");
        ContaInvestimento conta1 = new ContaInvestimento(titular, 123,123456);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }
}
