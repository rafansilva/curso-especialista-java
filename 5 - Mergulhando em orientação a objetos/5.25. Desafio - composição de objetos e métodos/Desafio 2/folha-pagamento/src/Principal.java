public class Principal {

    public static void main(String[] args) {
        Funcionario rafael = new Funcionario();
        rafael.nome = "Rafael";
        rafael.quantidadeFilhos = 2;

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = rafael;
        contrato.valorHoraNormal = 51.8;
        contrato.valorHoraExtra = 10.5;

        FolhaPagamento pagamento = new FolhaPagamento();

        double totalPagamento = pagamento.calcularSalario(140, 10, contrato);

        System.out.printf("Salário devedor de %s: %.2f%n", rafael.nome, totalPagamento);
    }
}
