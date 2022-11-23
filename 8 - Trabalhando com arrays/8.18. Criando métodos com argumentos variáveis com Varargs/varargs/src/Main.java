public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

//        String[] emailsCobranca = new String[2];
//        emailsCobranca[0] = "joao@email.com";
//        emailsCobranca[1] = "maria@email.com";
//        servicoDeCobranca.pagar(fatura, emailsCobranca);

//        String[] emailsCobranca = {"joao@gmail.com", "maria@email.com"};
//        servicoDeCobranca.pagar(fatura, emailsCobranca);

//        servicoDeCobranca.pagar(fatura, new String[]{"joao@email.com", "maria@email.com"});

//        servicoDeCobranca.pagar(fatura, new String[0]);
//        servicoDeCobranca.pagar(fatura, new String[]{});

//        servicoDeCobranca.pagar(fatura, "joao@email.com", "maria@email.com");

        servicoDeCobranca.pagar(fatura);
    }
}