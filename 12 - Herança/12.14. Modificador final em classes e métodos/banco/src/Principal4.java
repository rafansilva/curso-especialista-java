import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal4 {

    public static void main(String[] args) {
        Titular titular = new Titular("Rafael Silva", "12345678999");
//        Conta conta1 = new Conta(titular, 123, 123456);
//        ContaInvestimento conta1 = new ContaInvestimento(titular, 123,123456);
        ContaEspecial conta1 = new ContaEspecial(titular, 123, 123456, 30);


        System.out.println(conta1);
    }
}
