package com.booleanuk.extension;

public class Extension {
    public int[] numsEven;

    public void stepOne() {
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to evenNums
        int[] num = new int[4];
        int index = 0;
        for(int i = 0; i < 7; i++) {
            if(i % 2 == 0) {
                 num[index] = i;
                 index++;
            }
        }
        this.numsEven = num;
        
    }
}
