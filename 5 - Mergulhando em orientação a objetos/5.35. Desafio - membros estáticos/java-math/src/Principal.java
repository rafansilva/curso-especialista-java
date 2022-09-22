public class Principal {

    public static void main(String[] args) {
        double areaQuadrado = CalcularArea.calcularAreaQuadrado(5.2);
        double areaCirculo = CalcularArea.calcularAreaCirculo(10.2);

        System.out.printf("Área do Quadrado: %.2f %n", areaQuadrado);
        System.out.printf("Área do Circulo: %.2f %n", areaCirculo);
    }
}
