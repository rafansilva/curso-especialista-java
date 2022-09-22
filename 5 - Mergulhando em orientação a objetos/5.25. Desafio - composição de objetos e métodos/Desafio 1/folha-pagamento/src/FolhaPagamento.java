public class FolhaPagamento {

    double calcularSalario(
            double horasNormais,
            double horasExtras,
            double valorHoraNormal,
            double valorHoraExtra) {

        double valorTotalHorasTrabalhadas = horasNormais * valorHoraNormal;
        double valorTotalHorasExtras = horasExtras * valorHoraExtra;

        return valorTotalHorasTrabalhadas + valorTotalHorasExtras;
    }
}
