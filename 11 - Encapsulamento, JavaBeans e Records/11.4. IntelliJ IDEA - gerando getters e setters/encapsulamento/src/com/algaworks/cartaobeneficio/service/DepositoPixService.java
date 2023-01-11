package com.algaworks.cartaobeneficio.service;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Recibo;

public class DepositoPixService {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        cartao.creditar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }
}
