import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Titular titular = new Titular("Rafael Silva", "1234567899");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 90);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(300);

        contaEspecial.debitarTarifaMensal();

        // upcasting explícito
        //Conta conta = (Conta) contaEspecial;
        Conta conta = contaEspecial;

//        ContaInvestimento contaInvestimento = (ContaInvestimento) contaEspecial;

        System.out.println(contaEspecial.getClass().getName());
        System.out.println(conta.getClass().getName());
        System.out.println(contaEspecial == conta);

    }
}
