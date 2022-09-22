public class FolhaPagamento {

    final static double porcentagemAdicionalParaFilhos = 0.10; // 10%

    Holerite calcularSalario(
            double horasNormais,
            double horasExtras,
            ContratoTrabalho contrato) {
        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorTotalHorasNormais = horasNormais * contrato.valorHoraNormal;
        holerite.valorTotalHorasExtras = horasExtras * contrato.valorHoraExtra;

        double subTotal = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            holerite.adicionalParaFilhos = subTotal * porcentagemAdicionalParaFilhos;

        }

        return holerite;
    }
}
