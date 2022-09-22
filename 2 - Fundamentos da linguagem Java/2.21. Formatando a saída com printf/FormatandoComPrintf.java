 public class FormatandoComPrintf {

    public static void main (String[] args) {
        String nome = "Rafael";

        System.out.printf("Olá, %s%n", nome);

        int quantidade = 23;
        System.out.printf("Quantidade: %d itens%n", quantidade);

        double peso = 452.33;
        // System.out.printf("Peso: %f%n", peso);
        // System.out.printf("Peso: %.2f%n", peso);
        System.out.printf("Peso: %10.2f%n", peso);
    }
 }

