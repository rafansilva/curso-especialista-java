public class ExemploString1 {

    public static void main (String[] args) {
        System.out.println("Fala, mergulhador!");

        int x = 10;
        int y = 5;
        int z = x + y;

        // não ira fazer a operação pois existe um texto no começo,
        // então o compilador entende que deve concatenar
        // System.out.println("Resultado: " + x + y);

        // isso compila pois o compilador só faz a concatenação a partir do momento
        // que ele enconta um texto.
        // System.out.println(x + y + " foi o resultado");

        System.out.println("Resultado: " + (x + y));
    }
}

