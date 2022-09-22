public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    void calcularValorRevenda() {
        System.out.printf("Calcular valor de revenda de: %s %d%n",
                modelo, anoFabricacao);
    }
}
