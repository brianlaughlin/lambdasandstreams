package com.brianlaughlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
    Working through Lambdas and Streams
    Source: https://www.youtube.com/watch?v=1OpAgZvYXLQ
 */

public class Lamdas {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for(int i =0; i < 10; i++){
            list.add(rand.nextInt(100));
        }

//        for (Integer integer : list) {
//            System.out.println(Integer.valueOf(integer));
//        }

        list.forEach(System.out::println);

        System.out.println("===============Ugly way below============");
        list.forEach(e-> {
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
                    .reduce(0,Integer::sum)
        );

    }
}
