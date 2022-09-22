public class FolhaPagamento {

    final static double porcentagemAdicionalParaFilhos = 0.10;

    double calcularSalario(
            double horasNormais,
            double horasExtras,
            ContratoTrabalho contratoTrabalho) {
        double valorTotalHorasTrabalhadas = horasNormais * contratoTrabalho.valorHoraNormal;
        double valorTotalHorasExtras = horasExtras * contratoTrabalho.valorHoraExtra;

        double valorTotal = valorTotalHorasTrabalhadas + valorTotalHorasExtras;

        if (contratoTrabalho.possuiAdicionalParaFilhos()) {
            valorTotal += (valorTotal * porcentagemAdicionalParaFilhos);
        }

        return valorTotal;
    }
}
