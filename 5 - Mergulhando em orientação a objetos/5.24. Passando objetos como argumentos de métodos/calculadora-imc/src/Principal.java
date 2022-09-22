public class Principal {

    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();

        Paciente rafael = new Paciente();
        rafael.altura = 1.82;
        rafael.peso = 101;

        IndiceMassaCorporal imc = calculadoraImc.calcular(rafael);

        if (imc.estaComObesidade()) {
            System.out.printf("CalculadoraImc com altura de %.2f e peso de %.2f " +
                    "está com obesidade. %n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
