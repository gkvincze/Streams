package com.codecool.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1","a2","b1","c2","c1");
        myList
                .stream()
                .filter(s->s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        /*
        List cs = myList.stream().filter(a->a.charAt(0) == 'c').
                map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).sorted()
                .collect(Collectors.toList());
        cs.forEach(System.out::println);

         */
    }

}
