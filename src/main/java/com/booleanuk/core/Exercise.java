package com.booleanuk.core;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Exercise {
    public int[] numsZeroToThree;
    public int[] numsFiveToTen;
    public int[] countdown;

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    public void stepOne() {
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array
//        numsZeroToThree = new int[4];
//        for (int i = 0; i < 4; i++) {
//         numsZeroToThree[i] = i;
//        }
        numsZeroToThree = IntStream.range(0, 4).toArray();
    }

    public void stepTwo() {
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array
//         numsFiveToTen = new int[6];
//         for (int i = 5; i < 11; i++) {
//             numsFiveToTen[i - 5] = i;
//         }
        numsFiveToTen = IntStream.range(5, 11).toArray();
    }

    public void stepThree() {
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array
//         countdown = new int[4];
//         for (int i = 0; i < 4; i++) {
//             countdown[i] = 3 - i;
//         }
        countdown = IntStream
                .range(0, 4)
                .map(i -> 3 - i)
                .toArray();
    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array
//         for (var n : favouriteNumbers) {
//             if (n == num) {
//                 return true;
//             }
//         }
//         return false;
        return Arrays.stream(favouriteNumbers)
                .boxed()
                .toList()
                .contains(num);
    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array
//        for (var h : myHobbies) {
//            if (h.equals(hobby)) {
//                return true;
//            }
//        }
//        return false;

        return Arrays.stream(myHobbies)
                .toList()
                .contains(hobby);
    }
}
