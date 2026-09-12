package com.algaworks;

import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Sorteador sorteador = new Sorteador();
        Iterator<Integer> iterator = sorteador.iterator();

        for (Integer i :  sorteador) {
            System.out.println(i);
        }

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        System.out.println(iterator.next());

    }
}
