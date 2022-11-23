import java.util.Arrays;

public class Principal1 {

    public static void main(String[] args) {
        int[] numerosJogoAtual = {25, 11, 8, 46, 37, 14, 55};
        int[] numerosJogoNovo = new int[numerosJogoAtual.length - 1];

        int indiceExclusao = 0;

        // [25, 11, 8, 46, 37, 14, 55]
        // [0, 0, 0, 0, 0, 0]

        System.arraycopy(numerosJogoAtual, 0, numerosJogoNovo, 0, indiceExclusao);

        System.arraycopy(numerosJogoAtual, indiceExclusao + 1, numerosJogoNovo,
                indiceExclusao, numerosJogoNovo.length - indiceExclusao);

        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(numerosJogoNovo));
    }
}
