package com.booleanuk.extension;

public class Extension {
    public int[] numsEven;

    public void stepOne() {
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to evenNums
        int countEven = 0;
        int evenAdded = 0;
        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0) {
                countEven++;
            }
        }

        numsEven = new int[countEven];

        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0) {
                numsEven[evenAdded++] = i;
            }
        }

        /*
        Alternative:
        List<Integer> evenNums = new ArrayList<>;
        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0) {
                evenNums.add(i);
            }
        }

        numsEven = evenNums.stream.mapToInt(Integer::intValue).toArray();
         */
    }
}
