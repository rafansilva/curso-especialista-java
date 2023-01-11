public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Picanha 1kg (peça)", 50);

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);
    }
}