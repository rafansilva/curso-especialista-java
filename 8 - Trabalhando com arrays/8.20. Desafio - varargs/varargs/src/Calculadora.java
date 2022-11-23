import java.lang.reflect.Array;
import java.util.Arrays;

public class Calculadora {

    static double calcularMedia(double primeiroNumero, double segundoNumero, double... numerosAdicionais) {
        double numerosSomados = somarNumerosAdicionais(primeiroNumero + segundoNumero,
                numerosAdicionais);

        int quantidadeDeArgumentos = 2;
        int quantidadeNumeros = numerosAdicionais.length + quantidadeDeArgumentos;

        return numerosSomados / quantidadeNumeros;
    }

    static private double somarNumerosAdicionais(double primeirosNumeros, double[] numerosAdicionais) {
        for (double numeros : numerosAdicionais) {
            primeirosNumeros += numeros;
        }

        return primeirosNumeros;
    }

//    static double calcularMedia(double numeroA, double numeroB, double... demaisNumeros) {
//        double[] todosNumeros = Arrays.copyOf(demaisNumeros, demaisNumeros.length + 2);
//        todosNumeros[todosNumeros.length - 2] = numeroA;
//        todosNumeros[todosNumeros.length - 1] = numeroB;
//
//        double soma = 0;
//
//        for (double numeros : todosNumeros) {
//            soma += numeros;
//        }
//
//        return soma / todosNumeros.length;
//    }
}

