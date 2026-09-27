package com.algaworks.agencia;

import java.util.*;

public class CadastroPacoteViagem {

    // TODO declarar lista de pacotes de viagem aqui
    private List<PacoteViagem> pacotes =  new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        // TODO adicionar pacote na lista, validando antes se
        //  já existe usando contains (lançar exceção)
        PacoteViagem pacoteViagem =  new PacoteViagem(descricao, precoDiaria);
        if (pacotes.contains(pacoteViagem)) {
            throw new PacoteViagemJaExistenteException("Pacote de Viagem já existente");
        }

        pacotes.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        // TODO retornar lista de pacotes
        return pacotes;
    }

    public void ordenar() {
        // TODO ordenar pacotes pela ordem natural
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        // TODO ordenar pacotes pelo preço (decrescente)
        pacotes.sort(new PacoteViagemComparator().reversed());
    }

    public void removerPorDescricao(String descricao) {
        // TODO iterar nos pacotes com Iterator e remover aqueles com descrição informada,
        //  lançando exceção se nenhum pacote foi removido
        Iterator<PacoteViagem> pacoteIterator = pacotes.iterator();
        while (pacoteIterator.hasNext()) {
            PacoteViagem pacote = pacoteIterator.next();
            if (pacote.getDescricao().equals(descricao)) {
                pacoteIterator.remove();
            }
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        // TODO iterar pacotes com enhanced for, localizar e retornar
        //  pacote com descrição informada (ou lançar exceção se não encontrar)
        if (descricao == null) {
            throw new IllegalArgumentException("Descrição não pode ser vazia");
        }

        PacoteViagem pacoteViagem = null;
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)) {
                pacoteViagem = pacote;
            }
        }

        if (pacoteViagem == null) {
            throw new PacoteViagemNaoEncontrado("Pacote de viagem informado não foi encontrado");
        }

        return pacoteViagem;
    }

}