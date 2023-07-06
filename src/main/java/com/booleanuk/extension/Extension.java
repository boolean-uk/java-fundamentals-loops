package com.booleanuk.extension;

import java.util.stream.IntStream;

public class Extension {
    public int[] numsEven;

    public void stepOne() {
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to evenNums
//        numsEven = new int[4];
//        for (int i = 0; i < 4; i++) {
//            numsEven[i] = i * 2;
//        }
        numsEven = IntStream.range(0, 4)
                .map(i -> i * 2)
                .toArray();
    }
}
