package com.algaworks;

import com.algaworks.crm.Contato;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Contato> contatos = new LinkedHashSet<>();

        System.out.println("----");
        contatos.add(new Contato("Maria", "maria@email.com", 40));
        contatos.add(new Contato("José", "jose@email.com", 30));
        contatos.add(new Contato("João", "joao@email.com", 25));
        contatos.add(new Contato("Rosa", "rosa@email.com", 35));
        contatos.add(new Contato("Ana", "ana@email.com", 50));
        System.out.println("---");

        contatos.add(null);

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}