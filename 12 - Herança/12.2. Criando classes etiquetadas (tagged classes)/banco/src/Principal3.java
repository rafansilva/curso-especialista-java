import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal3 {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Rafael Silva", "12345678999"));
        conta1.setAgencia(112233);
        conta1.setNumero(123);
        conta1.setTipo(Conta.ESPECIAL);
        conta1.setLimiteChequeEspecial(1000);
        conta1.setTarifaMensal(30);

        conta1.imprimirDemonstrativo();

        conta1.depositar(500);
        conta1.imprimirDemonstrativo();

        conta1.sacar(700);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();

//        conta1.sacar(801);
//        conta1.imprimirDemonstrativo();
    }
}
