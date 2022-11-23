public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();
//        servicoDeCobranca.pagar(fatura, "joao@email.com", "maria@email.com");

        servicoDeCobranca.pagar(fatura, "joao@email.com", "maria@email.com", "calvo@email.com");
    }
}