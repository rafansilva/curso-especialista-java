public class Principal2 {

    public static void main(String[] args) {
        // Com tipos wrappers é necessario validar se é null antes
        Integer idade = null;

        // NullPointerException em todos as instruções abaixo
        System.out.println(idade + 10);
        System.out.println(idade == 100);
        System.out.println(idade.equals(100));
    }
}
