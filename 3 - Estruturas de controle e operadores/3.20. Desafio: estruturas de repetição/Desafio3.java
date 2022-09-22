import java.util.Scanner;

public class Desafio3 {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaNumerosDigitados = 0;

        while (somaNumerosDigitados < 100) {
            System.out.print("Digite um número inteiro: ");
            int numeroDigitado = entrada.nextInt();

            somaNumerosDigitados += numeroDigitado;
        }

        System.out.printf("A soma dos números digitados é: %d%n", somaNumerosDigitados);
    }
}


