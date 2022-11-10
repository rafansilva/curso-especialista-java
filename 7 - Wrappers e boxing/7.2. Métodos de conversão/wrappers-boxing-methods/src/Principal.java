public class Principal {

    public static void main(String[] args) {
        // casting de tipos
        int idade = 20;
        short idadeShort = (short) idade;

        Integer diasEntrega = Integer.valueOf(30);
//        short diasEntregaShort = diasEntrega.shortValue();
        Short diasEntregaShort = Short.valueOf(diasEntrega.shortValue());

        //Cuidado com perda de precisão.
        Double valorTotal = Double.valueOf(1500.2);
        int valorTotalInt = Integer.valueOf(valorTotal.intValue());

        System.out.println(valorTotalInt);
    }
}
