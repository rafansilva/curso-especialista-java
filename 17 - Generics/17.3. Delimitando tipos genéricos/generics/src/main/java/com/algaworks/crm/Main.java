package com.algaworks.crm;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       Funcionario[] funcionarios = {
               new Funcionario("João", 40),
               new Funcionario("José", 20),
               new Funcionario("Maria", 30)
       };

       Cliente[] clientes = {
               new Cliente("Supermecado Pague e Leve", 2_0000),
               new Cliente("Posto de Gasolina Boa", 800_0000),
               new Cliente("Java Consultoria", 58_000_000)
       };

       Funcionario funcionarioEncontrado = Pesquisador.obterPorNome(funcionarios, "José");
        System.out.println(funcionarioEncontrado);

        Cliente clienteEncontrado = Pesquisador.obterPorNome(clientes, "Posto de Gasolina Boa");
        System.out.println(clienteEncontrado);
    }
}