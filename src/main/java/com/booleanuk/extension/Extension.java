package com.booleanuk.extension;

public class Extension {
    public int[] numsEven;

    public void stepOne() {
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to evenNums
        this.numsEven = new int[4];
        int j =0;
        for (int i = 0; i<=6; i+=2){
            this.numsEven[j] = i;
            j++;
        }

    }
}
