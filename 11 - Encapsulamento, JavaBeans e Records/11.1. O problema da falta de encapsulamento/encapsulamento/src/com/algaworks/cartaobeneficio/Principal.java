package com.algaworks.cartaobeneficio;

import com.algaworks.cartaobeneficio.service.DepositoPixService;
import com.algaworks.cartaobeneficio.service.PagamentoOnlineService;

public class Principal {

    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("Rafael Silva");

        cartao.saldo = -700; // ISSO NÂO PODE ACONTECER. Isso deixa o objetos em um estado inconsistente.

//        var servicoDeDeposito = new DepositoPixService();
//        Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao, 500);
//        reciboDeposito.imprimir();
//
//        var servicoDePagamento = new PagamentoOnlineService();
//        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado, cartao, 100);
//        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.titular);
        System.out.printf("Saldo: R$%.2f%n", cartao.saldo);
    }
}
