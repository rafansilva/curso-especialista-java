public class Principal {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Rafael Nascimento";
        eu.cpf = "111.222.333-44";
        eu.anoNascimento = 1998;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = eu;

//        meuCarro.proprietario = new Pessoa();
//        meuCarro.proprietario.nome = "Rafael Nascimento";
//        meuCarro.proprietario.cpf = "111.222.333-44";
//        meuCarro.proprietario.anoNascimento = 1998;

        Pessoa voce = new Pessoa();
        voce.nome = "João da Silva";
        voce.cpf = "112.232.355-44";
        voce.anoNascimento = 1997;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.proprietario = voce;

        System.out.println("Meu Carro");
        System.out.println("---------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);

        System.out.println();

        System.out.println("Seu Carro");
        System.out.println("---------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
    }
}
