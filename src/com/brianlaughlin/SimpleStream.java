package com.brianlaughlin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    // Maps does a transformation. In this example the stream is coming in as an Integer and I'll convert it to a String
    public void doubleEvenTransformString() {

        System.out.println(
                list.stream()
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .reduce(Integer::sum).toString()
        );
    }

    // Adding use of stream Collectors. Do not do shared mutability.
    // An example would be modifying a shared variable in a stream statement.
    // Example will show assigned the value during the List creation.

    public void doubleOfEvenMethod() {
        List<Integer> doubleOfEven =
                list.stream()
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .collect(Collectors.toList());
        // note you could do this to a toSet and remove duplicates

        System.out.println(doubleOfEven);
    }

    public void countsheep() {
        Boolean[] arrayOfSheeps =
                {true, true, true, false,
                        true, true, true, true,
                        true, false, true, false,
                        true, false, false, true,
                        true, true, true, true,
                        false, false, true, true};

        if (arrayOfSheeps == null) System.out.println("Null value");
        System.out.println(

                Arrays.stream(arrayOfSheeps)
                        .filter(e -> e == true)
                        .count()

        );

    }
        public int countSheepsAnotherWay (Boolean[]arrayOfSheeps){
            // TODO May the force be with you
            return Arrays.stream(arrayOfSheeps).filter(x -> x != null).filter(x -> x == true).toArray().length;
        }

    }

}

