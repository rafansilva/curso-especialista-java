package com.algaworks;

import com.algaworks.crm.Contato;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Maria", "maria@email.com", 40);
        Contato contato2 = new Contato("José", "jose@email.com", 30);
        Contato contato3 = new Contato("João", "joao@email.com", 25);
        Contato contato4 = new Contato("João da Silva", "joao@email.com", 35);

        System.out.println(contato1.hashCode());
        System.out.println(contato2.hashCode());
        System.out.println(contato3.hashCode());
        System.out.println(contato4.hashCode());

        System.out.println(contato4.equals(contato3));
        System.out.println(contato4.hashCode() == contato3.hashCode());
    }
}