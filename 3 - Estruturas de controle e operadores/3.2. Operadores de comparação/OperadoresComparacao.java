public class OperadoresComparacao {

    public static void main (String[] args) {
        int pesoProduto = 1000;
        int limitePesoCaminhao = 1000;

        boolean cargaExcedida = pesoProduto > limitePesoCaminhao;
        System.out.printf("Carga excedida: %b%n", cargaExcedida);

        // boolean cargaLiberada = pesoProduto < limitePesoCaminhao;
        // boolean cargaLiberada = pesoProduto <= limitePesoCaminhao;
        boolean cargaLiberada = limitePesoCaminhao >= pesoProduto;
        System.out.printf("Carga liberada: %b%n", cargaLiberada);
    }
}
