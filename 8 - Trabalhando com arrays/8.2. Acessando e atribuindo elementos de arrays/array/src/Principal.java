public class Principal {

    public static void main(String[] args) {
        int[] notas = new int[]{9, 5, 8, 10, 6};

        notas[0] = 10;
        notas[1] = 4;

        System.out.println(notas[0]);
        System.out.println(notas[2]);
        System.out.println(notas[4]);

        int total = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
        System.out.println(total);

        int posicao = 2;

        System.out.println(notas[posicao - 1]);
    }
}
