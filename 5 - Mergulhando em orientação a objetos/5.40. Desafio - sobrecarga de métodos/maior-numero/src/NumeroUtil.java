public class NumeroUtil {

    static int descobrirMaiorNumero(int a, int b) {
        // return a > b ? a : b;
        return Math.max(a, b);
    }

    static int descobrirMaiorNumero(int a, int b, int c){
        return descobrirMaiorNumero(descobrirMaiorNumero(a,b), c);
    }

    static double descobrirMaiorNumero(double a, double b) {
        return Math.max(a, b);
    }

    static double descobrirMaiorNumero(double a, double b, double c) {
       return descobrirMaiorNumero(descobrirMaiorNumero(a, b), c);
    }
}
