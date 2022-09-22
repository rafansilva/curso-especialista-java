public class Principal {

    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();

        double altura = 1.82;
        double peso = 101;

        IndiceMassaCorporal imc = calculadoraImc.calcular(peso, altura);

        if (imc.estaComObesidade()) {
            System.out.printf("CalculadoraImc com altura de %.2f e peso de %.2f " +
                    "está com obesidade. %n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
