package com.algaworks.crm;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
//        var clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Supermercado Pague e Leve", 8000_00));
        clientes.add(new Cliente("Posto Gasolina Boa", 800_00));
//        clientes.add("Jose");

        double totalFaturamento = 0d;

        for (Cliente cliente : clientes) {
            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.println(totalFaturamento);
    }
}