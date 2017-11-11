package com.brianlaughlin;

import static com.brianlaughlin.MasterArray.list;

public class SimpleStream {

    public SimpleStream() {
        MasterArray.createArray();
    }

    // given the vlaues, double the even and sum for total
    public void doubleEvenImperative() {
        int result = 0;
        for (int e : list) {
            if (e % 2 == 0) {
                result += e * 2;
            }
        }
        System.out.println("Result is " + result);
    }


    public void doubleEvenFuncational() {
        System.out.println(
                list.stream()
                        .filter(e -> e % 2 == 0)
                        .mapToInt(e -> e * 2)
                        .sum()
        );
    }
}
