package com.algaworks.contaspagar.servico;

import com.algaworks.contaspagar.pagamento.*;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {
        // Poderia ter outras regras de negocio aqui
        // como por exemplo registrar no banco de dados,
        // enviar uma notificação por e-mail, etc.

        metodoPagamento.pagar(documento);
    }
}
