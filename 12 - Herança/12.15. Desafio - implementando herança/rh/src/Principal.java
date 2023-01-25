import com.algaworks.rh.Funcionario;
import com.algaworks.rh.Holerite;
import com.algaworks.rh.Programador;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao Silva", 40);
        System.out.println(funcionario1);
        Holerite holerite1 = funcionario1.gerarHolerite(180, "Jan/2023");
        holerite1.imprimir();

        System.out.println();

        Programador programador1 = new Programador("Rafael", 80);
        programador1.setValorBonus(1500);
        System.out.println(programador1);
        Holerite holerite2 = programador1.gerarHolerite(160, "Jan/2023");
        holerite2.imprimir();
    }
}
