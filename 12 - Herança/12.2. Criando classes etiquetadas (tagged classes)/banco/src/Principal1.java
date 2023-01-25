import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Rafael Silva", "12345678999"));
        conta1.setAgencia(112233);
        conta1.setNumero(123);
        conta1.setTipo(Conta.NORMAL);
//        conta1.setLimiteChequeEspecial(100);

        conta1.imprimirDemonstrativo();

        conta1.depositar(500);
        conta1.imprimirDemonstrativo();

        conta1.sacar(100);
        conta1.imprimirDemonstrativo();

//        conta1.creditarRendimentos(6);
    }
}
