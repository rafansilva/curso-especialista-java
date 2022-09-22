public class Principal {

    public static void main(String[] args) {
        FolhaPagamento pagamento = new FolhaPagamento();

        double horasNormais = 8;
        double horasExtras = 3;
        double valorHoraNormal = 50;
        double valorHoraExtra = 20;

        double totalPagamento = pagamento.calcularSalario(
                horasNormais,
                horasExtras,
                valorHoraNormal,
                valorHoraExtra);

        System.out.println(totalPagamento);
    }
}
