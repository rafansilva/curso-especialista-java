import com.algaworks.crm.Cliente;
import com.algaworks.crm.ServicoCadastroCliente;

public class Main {

    public static void main(String[] args) {
        ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();
        Cliente clienteCadastrado = servicoCadastroCliente.cadastrar("Rafael", 15);

        System.out.printf("Cliente cadastrado: %s%n", clienteCadastrado.getNome());
    }
}