public class IndiceMassaCorporal {

    final static int nivelIdentificadorDeObesidade = 30;

    double resultado;
    double peso;
    double altura;

    boolean estaComObesidade() {
        return resultado >= nivelIdentificadorDeObesidade;
    }
}
