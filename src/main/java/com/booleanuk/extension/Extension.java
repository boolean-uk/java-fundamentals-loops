package com.booleanuk.extension;

public class Extension {
    public int[] numsEven;

    public void stepOne() {
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to evenNums

        numsEven = new int[4];
        int i = 0;
        for (int n = 0; n <= 6; n += 2) {
            numsEven[i] = n;
            i += 1;
        }

        
    }
}
