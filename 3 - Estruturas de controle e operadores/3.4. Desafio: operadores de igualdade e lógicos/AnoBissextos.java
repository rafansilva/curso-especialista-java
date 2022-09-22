import java.util.Scanner;

public class AnoBissextos {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = entrada.nextInt();

       // boolean anoMultiplo1 = ano % 400 == 0;
       // boolean anoMultiplo2 = ano % 4 == 0 && ano % 100 != 0;
       // boolean anoBissextos =  anoMultiplo1 || anoMultiplo2;

        boolean anoBissextos =  ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

        System.out.printf("O ano %d é bissexto: %b%n", ano, anoBissextos);
    }
}
