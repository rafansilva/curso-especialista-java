package com.algaworks;

import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

//        cadastro.removerPorCidade("Fortim/CE");
//        cadastro.remover(new Hotel("Vila Selvagem", "Fortim/CE", 1400));
        cadastro.removerTodos();


        ArrayList<Hotel> hoteis = cadastro.obterTodos();
//        hoteis.set(3, new Hotel("Teste", "Teste", 0)); // substitui o objeto
//        hoteis.add(3, new Hotel("Teste", "Teste", 0)); // adiciona o objeto
        imprimirHoteis(hoteis);
    }

    public static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);

            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

}