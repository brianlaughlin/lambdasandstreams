package com.brianlaughlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.brianlaughlin.MasterArray.list;

/*
    Working through Lambdas and Streams
    Source: https://www.youtube.com/watch?v=1OpAgZvYXLQ

    Also a good article: http://www.baeldung.com/foreach-java
 */

public class Lamdas {
    public static void main(String[] args) {

        MasterArray.createArray();
        list.forEach(System.out::println);

        System.out.println("===============Ugly way below============");
        list.forEach(e -> {
            System.out.println(e);
        });


        System.out.println("===============Stream filter============");
        list.stream()
                .filter(e -> e < 50)
                .forEach(System.out::println);

        System.out.println("===============Method reference============");
        System.out.println(
//                list.stream()
//                    .reduce(0,(total, e) -> Integer.sum(total, e))
                // since the parameters are the same being passed we change rewrite
                // this to a method reference.
                list.stream()
                        .reduce(0, Integer::sum)
        );

    }
}
