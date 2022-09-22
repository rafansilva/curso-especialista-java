import java.util.Scanner;

public class Desafio5 {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean digitarProximo = true;
        int somaNumerosImpares = 0;
        int somaNumerosPares = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            int numeroDigitado = entrada.nextInt();

            if (numeroDigitado % 2 == 0) {
                somaNumerosPares += numeroDigitado;
            } else {
                somaNumerosImpares += numeroDigitado;
            }

            System.out.print("Deseja continuar? ");
            digitarProximo = entrada.nextBoolean();
        } while (digitarProximo);

        System.out.printf("Soma dos números pares: %d%n", somaNumerosPares);
        System.out.printf("Soma dos números ímpares: %d%n", somaNumerosImpares);
    }
}




