import java.util.Scanner;

public class CalculadoraIMC {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite 1 para (M), 2 para (F): ");
        char sexo = 'M';

        if (entrada.nextShort() != 1) {
            sexo = 'F';
        }

        System.out.print("Digite seu peso: ");
        int peso = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if ((imc < 19.1 && sexo == 'F') || (imc < 20.7 && sexo == 'M')) {
            System.out.printf("Seu imc é %.2f e você está abaixo do peso.%n", imc);
        } else if ((imc >= 19.1 && imc < 25.8 && sexo == 'F')
                || (imc >= 20.8 && imc < 26.4 && sexo == 'M')) {
            System.out.printf("Seu imc é %.2f e você está no peso ideal.%n", imc);
        } else if ((imc >= 25.9 && imc < 27.3 && sexo == 'F')
                || (imc >= 26.5 && imc < 27.8 && sexo == 'M')) {
            System.out.printf("Seu imc é %.2f e você está um pouco acima do peso.%n", imc);
        } else if ((imc >= 27.4 && imc < 32.3 && sexo == 'F')
                || (imc >= 27.9 && imc < 31.1 && sexo == 'M')) {
            System.out.printf("Seu imc é %.2f e você está acima do peso ideal. %n", imc);
        } else {
            System.out.printf("Seu imc é %.2f e você está obeso. %n", imc);
        }
    }

}
