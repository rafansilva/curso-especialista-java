package com.algaworks.cartaobeneficio.service;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Estabelecimento;
import com.algaworks.cartaobeneficio.Recibo;

public class PagamentoOnlineService {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        if (cartao.saldo < valor) {
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        cartao.saldo -= valor;

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.titular, "Pagamento", valor);
    }
}
