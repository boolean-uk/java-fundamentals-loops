package com.booleanuk.extension;

public class Extension {
    public int[] numsEven;

    public void stepOne() {
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to evenNums

        int upper = 6;

        numsEven = new int[(upper / 2) + 1];
        int i = 0;
        for (int j = 0; j <= upper; j++) {
            if(j % 2 == 0) {
                numsEven[i] = j;
                i++;
            }
        }
        
    }
}
