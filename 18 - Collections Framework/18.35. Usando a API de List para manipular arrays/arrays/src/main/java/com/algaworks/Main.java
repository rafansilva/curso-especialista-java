package com.algaworks;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] numeros1 = { 1, 2 };
        List<Integer> numeros2 = Arrays.asList(numeros1);

//        numeros2.set(0, 4);
//        numeros1[0] = 5;

        numeros2.add(10); // A lista tem o mesmo tamanho q o array, arrays tem tamanho fixo.

//        System.out.println(Arrays.toString(numeros1));
//        System.out.println(numeros2);

//        for (int i = 0; i < numeros1.length; i++) {
//            System.out.println(numeros1[i]);
//        }
//
//        for (int i = 0; i < numeros2.size(); i++) {
//            System.out.println(numeros2.get(i));
//        }
    }
}