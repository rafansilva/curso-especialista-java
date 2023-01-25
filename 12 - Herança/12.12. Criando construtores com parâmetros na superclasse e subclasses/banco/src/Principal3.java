import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal3 {

    public static void main(String[] args) {
        Titular titular = new Titular("Rafael Silva", "12345678999");
        ContaEspecial conta1 = new ContaEspecial(titular, 123, 123456, 30);
        conta1.setLimiteChequeEspecial(1000);

        conta1.imprimirDemonstrativo();

        conta1.depositar(500);
        conta1.imprimirDemonstrativo();

        conta1.sacar(700);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();

//        Object obj = new Object();
//        obj.equals();
    }
}
