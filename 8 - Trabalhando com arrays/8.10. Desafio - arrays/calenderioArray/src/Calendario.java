public class Calendario {

    static String obterNomeMes(int numeroMes) {
        if (numeroMes < 1 || numeroMes > 12) {
            return "Mês inválido.";
        }

        String[] mes = {
                "Janeiro",
                "Fevereiro",
                "Março",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                "Dezembro"
        };

        return mes[numeroMes - 1];
    }

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(11);

        System.out.println(mes);
    }
}
