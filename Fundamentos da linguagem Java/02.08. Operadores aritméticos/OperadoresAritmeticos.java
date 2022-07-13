public class OperadoresAritmeticos {

    public static void main (String[] args) {
        int minhaIdade = 23;
        int suaIdade = 45;

        // Adição
        int totalidade = minhaIdade + suaIdade;
        System.out.println("\nTotal das idades: " + totalidade + "\n");

        // Subtração
        int diferencaIdades = suaIdade - minhaIdade;
        System.out.println("Diferença das idades: " + diferencaIdades + "\n");

        // Multiplicação
        int dobroDaIdade = 2 * minhaIdade;
        System.out.println("Dobro da minha idade: " + dobroDaIdade + "\n");

        // Divisão
        int metadeIdade = minhaIdade / 2;
        System.out.println("Metade da minha idade: " + metadeIdade + "\n");

        // Módulo
        int restoDivisão = 7 % 2;
        System.out.println("Resto da divição (módulo): " + restoDivisão + "\n");
    }
}
