public class Main {
    public static void main(String[] args) {
        ServicoCadastroAnuncio servicoCadastroAnuncio = new ServicoCadastroAnuncio();
        servicoCadastroAnuncio.cadastrar("999", "Teste");

        System.out.println("Anuncio cadastrado com sucesso.");
    }
}