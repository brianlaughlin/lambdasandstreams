package com.brianlaughlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MasterArray {

    public static List<Integer> list = new ArrayList<>();
    private static Random rand = new Random();

    public MasterArray() {
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
    }

    public static void createArray(){
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
    }

}
