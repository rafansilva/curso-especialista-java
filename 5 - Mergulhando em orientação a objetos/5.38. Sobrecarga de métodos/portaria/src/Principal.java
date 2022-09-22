public class Principal {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 12;

       CadastroPortaria cadastroPortaria = new CadastroPortaria();
       cadastroPortaria.cadastrar(novoVisitante, 2);
    }
}
