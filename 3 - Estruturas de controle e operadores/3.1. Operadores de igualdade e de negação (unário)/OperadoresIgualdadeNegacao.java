public class OperadoresIgualdadeNegacao {

    public static void main (String[] args) {
        // boolean numerosIguais = 10 == 10;
        // boolean numerosIguais = (4 + 6) == (5 * 2);

        int numero1 = 10;
        int numero2 = 11;
        // boolean numerosIguais = numero1 == 10;
        boolean numerosIguais = numero1 == numero2;

        // boolean numerosDiferentes = !numerosIguais;
        boolean numerosDiferentes = numero1 != numero2;

        System.out.printf("Números iguais: %b%n", numerosIguais);
        // System.out.printf("Números iguais: %b%n", numero1 == numero2);

        System.out.printf("Números Diferentes: %b%n", numerosDiferentes);
    }
}
