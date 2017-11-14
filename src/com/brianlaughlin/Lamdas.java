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


        DisplayArray displayArray = new DisplayArray();
        displayArray.show();


        SimpleStream simpleStream = new SimpleStream();
        System.out.println("Calling: " + simpleStream.getClass().getSimpleName());
        simpleStream.doubleEvenImperative();

        System.out.println("==============Functional even double ===============");
        simpleStream.doubleEvenFuncational();
        simpleStream.doubleOfEvenMethod();

        System.out.println("==============collect ===============");
        Sample sample = new Sample();
        sample.groupingByMethod();

        System.out.println("==============Infinate Stream ===============");
        InfinateStream infinateStream = new InfinateStream();
        infinateStream.show();


    }
}
