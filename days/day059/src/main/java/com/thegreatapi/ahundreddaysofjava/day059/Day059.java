package com.thegreatapi.ahundreddaysofjava.day059;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day059 {

    public static void main(String[] args) {
        /*
         A Predicate<T> is the same as Function<T, Boolean>.
         It consumes a T and returns a Boolean.
         */
        Predicate<Integer> isEven = intValue -> intValue % 2 == 0;

        List<Integer> numbers = getNumbers();
        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println);
    }

    private static List<Integer> getNumbers() {
        return IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
    }
}