package com.booleanuk.core;

import java.util.Arrays;

public class Exercise {
    public int[] numsZeroToThree;
    public int[] numsFiveToTen;
    public int[] countdown;

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    public void stepOne() {
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array
        numsZeroToThree = new int[4];
        for (int i = 0; i < 4; i++){
            numsZeroToThree[i] = i;
        }

    }

    public void stepTwo() {
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array
        int len = 11 - 5;
        numsFiveToTen = new int[len];
        for (int i = 5; i < 11; i++){
            numsFiveToTen[i - 5] = i;
        }

    }

    public void stepThree() {
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array
        int len = 4 - 0;
        countdown = new int[len];
        int j = 0;
        for (int i = 3; i > 0; i--){
            countdown[j] = i;
            j++;
        }

    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array
        for (int i = 0; i < favouriteNumbers.length; i++){
            if (favouriteNumbers[i] == num)
                return true;
        }



        return false;
    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array
        for (int i = 0; i < myHobbies.length; i++){
            if (myHobbies[i].equals(hobby))
                return true;
        }


        return false;
    }

}
