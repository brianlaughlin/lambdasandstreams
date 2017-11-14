package com.brianlaughlin;

import java.util.stream.*;

public class InfinateStream {

    // This is an example of extremely Lazy. shows a pipe header and is smart to do this.
    public void show(){

                Stream.iterate(100, e->e+1)
                .limit(10)
                .forEach(System.out::println);

    }

    public int compute(int k, int n){

        return Stream.iterate(k, e->e+1)                // unbounded, lazy
                     .filter(e->e % 2 ==0)              // unbounded, lazy
                     .filter(e-> Math.sqrt(e) > 20)     // unbounded, lazy
                     .mapToInt(e -> e * 2)              // unbounded, lazy
                     .limit(n)                          // sized, lazy
                     .sum();                            // Triggers the evaluation
    }
}
