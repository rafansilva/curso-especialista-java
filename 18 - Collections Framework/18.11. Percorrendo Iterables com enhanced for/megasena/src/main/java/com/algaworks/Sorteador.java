package com.algaworks;

import java.util.Iterator;

public class Sorteador implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        System.out.println("ENHANCED FOR USA O ITERABLES POR BAIXO DOS PANOS");
        return new SorteadorIterator();
    }
}
