import com.algaworks.banco.*;

public class Principal2 {

    public static void main(String[] args) {
        Titular titular = new Titular("Rafael Silva", "1234567899");
//        ContaInvestimento contaInvestimento = new ContaSalario(titular, 1234,99999, 12000);
        Conta conta = new ContaSalario(titular, 1234,99999, 12000);
    }
}
