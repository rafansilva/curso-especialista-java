public class ConversaoDoubleParaInt {

    public static void main (String[] args) {
       double largura = 100.45;
       // int tamanho = largura; // não compila

       int tamanho = (int) largura; // isso compila

       System.out.println(tamanho);
    }
}
