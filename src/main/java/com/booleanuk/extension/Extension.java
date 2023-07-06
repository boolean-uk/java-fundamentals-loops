package com.booleanuk.extension;

public class Extension {
    public int[] numsEven;

    public void stepOne() {
        numsEven = new int[4];

        int index = 0;

        for (int i = 0; i <= 6; i++) {
            if (i % 2 == 0) {
                numsEven[index] = i;
                index++;
            }
        }
    }
}
