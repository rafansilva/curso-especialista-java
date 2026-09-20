package com.algaworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(8);
        numeros.add(30);
        numeros.add(1);
        numeros.add(6);

//        Collections.sort(numeros);
        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println(numeros);
    }
}
