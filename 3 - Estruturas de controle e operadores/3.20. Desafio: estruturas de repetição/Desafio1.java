import java.util.Scanner;

public class Desafio1 {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaNumerosDigitados = 0;

        for (int numeroAtual = 1; numeroAtual <= 10; numeroAtual++) {
            System.out.printf("Digite um número par: ");
            int numeroDigitado = entrada.nextInt();

            if (numeroDigitado % 2 != 0) {
                System.out.println("Digite apenas números pares");
                numeroAtual--;
            } else {
                somaNumerosDigitados += numeroDigitado;
            }
        }

        System.out.printf("Soma dos números digitados: %d%n", somaNumerosDigitados);
    }
}
