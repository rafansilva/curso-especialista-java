package com.algaworks.cartaobeneficio.service;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Estabelecimento;
import com.algaworks.cartaobeneficio.Recibo;

public class PagamentoOnlineService {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        cartao.debitar(valor);

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
