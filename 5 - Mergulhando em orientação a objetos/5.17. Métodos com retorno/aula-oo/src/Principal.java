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
        meuCarro.precoCompra = 120000;
        meuCarro.proprietario = eu;


        Pessoa voce = new Pessoa();
        voce.nome = "João da Silva";
        voce.cpf = "112.232.355-44";
        voce.anoNascimento = 1997;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;

        double valorRevenda = meuCarro.calcularValorRevenda();

        System.out.printf("Tempo de uso (anos): %d%n", 2022 - meuCarro.anoFabricacao);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);

//        seuCarro.calcularValorRevenda();

//        System.out.println("Meu Carro");
//        System.out.println("---------");
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);
//
//        System.out.println();
//
//        System.out.println("Seu Carro");
//        System.out.println("---------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
    }
}
