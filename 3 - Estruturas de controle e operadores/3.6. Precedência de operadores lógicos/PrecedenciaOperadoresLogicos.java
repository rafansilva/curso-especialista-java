 public class PrecedenciaOperadoresLogicos {

    public static void main (String[] args) {
        int x = 10;
        int y = 20;

        // O operador logico && tem prioridade
        // boolean resultado = (x == 13 && x == 15) || y == 20; // true
        // boolean resultado = x == 13 && x == 15 || y == 20; // true
        boolean resultado = x == 13 && (x == 15 || y == 20); // false

        System.out.println(resultado);
    }
 }

