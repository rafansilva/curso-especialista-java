package com.algaworks.crm;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] nomes = {"José", "Maria", "Carlos"};
//        String nomeSorteado = Sorteador.<String>sortear(nomes);
        String nomeSorteado = Sorteador.sortear(nomes);
        System.out.println(nomeSorteado);

        Cliente[] clientes = {
                new Cliente("Supermercado Pague e Leve", 8_000_00),
                new Cliente("Posto Gasolina Boa", 800_000),
                new Cliente("Javac Consultoria", 58_000_000)
        };

//        Cliente clienteSorteado = Sorteador.<Cliente>sortear(clientes);
        Cliente clienteSorteado = Sorteador.sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }
}