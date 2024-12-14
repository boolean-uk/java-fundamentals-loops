package com.booleanuk.extension;

public class Extension {
    public int[] numsEven = {0, 0, 0, 0};

    public void stepOne() {
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to evenNums
        for (int i = 0; i < 4 ; i++) {
            numsEven[i] = i * 2;
        }

        
    }
}
