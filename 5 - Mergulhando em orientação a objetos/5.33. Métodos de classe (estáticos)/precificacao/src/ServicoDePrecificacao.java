public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        //poderia ter cálculos muito mais complexos aqui

        double precoVendaCalculado = MatematicaUtil.calcularAcrescimo(
                produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
