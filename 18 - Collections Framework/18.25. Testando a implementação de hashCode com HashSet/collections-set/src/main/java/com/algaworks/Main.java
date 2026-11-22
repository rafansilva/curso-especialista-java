package com.algaworks;

import com.algaworks.crm.Contato;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Contato> contatos = new HashSet<>();

        System.out.println("----");
        contatos.add(new Contato("Maria", "maria@email.com", 40));
        contatos.add(new Contato("José", "jose@email.com", 30));
        contatos.add(new Contato("João", "joao@email.com", 25));
        contatos.add(new Contato("Rosa", "rosa@email.com", 35));
        contatos.add(new Contato("Ana", "ana@email.com", 50));
        System.out.println("---");
        contatos.add(new Contato("Josefina", "josefina@email.com", 70));
        System.out.println("---");
        contatos.add(new Contato("Josefina", "josefina@email.com", 70));
        contatos.add(null);

        System.out.println("---");

//        System.out.println(contatos);

        boolean resultado = contatos.contains(new Contato("Janaina", "janaina@email.com", 40));
        System.out.println(resultado);
    }
}