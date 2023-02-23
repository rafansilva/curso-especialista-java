import com.algaworks.banco.*;

public class Principal {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("Rafael Silva", "1234567899"), 1234,
                999999, 30);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("Berenice Silva", "9987654321"), 4421,
                77777);

        conta2.depositar(90);
        conta2.creditarRendimentos(10);

        ContaSalario conta3 = new ContaSalario(new Titular("Berenice Silva", "9987654321"), 4421,
                77777, 18_000);

        conta3.depositar(300);

        caixaEletronico.imprimirDemonstrativo(conta3);

    }
}
