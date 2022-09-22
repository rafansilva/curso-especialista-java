public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double adicionalParaFilhos;

    double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + adicionalParaFilhos;
    }

    void imprimir() {
        System.out.println("HOLERITE");
        System.out.println("----------------------------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.nome);
        System.out.printf("Quantidade de filhos: %s%n", funcionario.quantidadeFilhos);
        System.out.printf("Valor horas normais: %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor horas extras: %.2f%n", valorTotalHorasExtras);
        System.out.printf("Valor do adicional para filhos: %.2f%n", adicionalParaFilhos);
        System.out.printf("Valor total: %.2f%n", calcularValorTotal());
    }
}
