public class Principal {

    public static void main(String[] args) {
        Funcionario rafael = new Funcionario();
        rafael.nome = "Rafael";
        rafael.quantidadeFilhos = 1;

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = rafael;
        contrato.valorHoraNormal = 51.8;
        contrato.valorHoraExtra = 10.5;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(40, 3, contrato);
        holerite.imprimir();
    }
}
