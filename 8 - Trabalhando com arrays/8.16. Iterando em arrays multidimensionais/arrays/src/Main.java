import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[][] TodasCidades = new String[3][];
        TodasCidades[0] = new String[3];
        TodasCidades[0][0] = "Uberlândia";
        TodasCidades[0][1] = "Uberaba";
        TodasCidades[0][2] = "Belo Horizonte";

        TodasCidades[1] = new String[2];
        TodasCidades[1][0] = "São Paulo";
        TodasCidades[1][1] = "Ribeirão Preto";

        TodasCidades[2] = new String[1];
        TodasCidades[2][0] = "Fortaleza";

//        for (int i = 0; i < TodasCidades.length; i++) {
//            for (int j = 0; j < TodasCidades[i].length; j++) {
//                System.out.println(TodasCidades[i][j]);
//            }
//        }

        for (String[] cidadePorEstado : TodasCidades) {
            for (String cidade : cidadePorEstado) {
                System.out.println(cidade);
            }
        }
    }
}
