package com.brianlaughlin;

import static com.brianlaughlin.MasterArray.list;

public class DisplayArray {

    public void show(){
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
