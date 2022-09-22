import java.util.Scanner;

public class Desafio4 {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = numeroDigitado = entrada.nextInt();

        int numeroPendenteInversao = numeroDigitado;
        int numeroInvertido = 0;

        while (numeroPendenteInversao > 0) {
            // numeroInvertido = 10 * numeroInvertido + numeroPendenteInversao % 10;

            int resto = numeroPendenteInversao % 10;
            numeroInvertido = numeroInvertido * 10 + resto;

            numeroPendenteInversao /= 10;
        }

        System.out.printf("O inverso de %d é %d%n", numeroDigitado, numeroInvertido);
    }
}



