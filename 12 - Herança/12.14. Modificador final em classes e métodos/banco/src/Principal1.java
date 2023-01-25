import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Titular titular = new Titular("Rafael Silva", "12345678999");
        Conta conta1 = new Conta(titular, 123, 123456);

        conta1.imprimirDemonstrativo();

        conta1.depositar(500);
        conta1.imprimirDemonstrativo();

        conta1.sacar(100);
        conta1.imprimirDemonstrativo();

    }
}
