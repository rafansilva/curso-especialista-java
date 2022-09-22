public class CalcularArea {

    static final double PI = 3.14159265358979323846;

    static double calcularAreaQuadrado(double medidaDoLado) {
        return medidaDoLado * medidaDoLado;
    }

    static double calcularAreaCirculo(double raio) {
        return (raio * raio) * CalcularArea.PI;
    }
}
