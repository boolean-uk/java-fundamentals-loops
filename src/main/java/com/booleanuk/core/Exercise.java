package com.booleanuk.core;

public class Exercise {
    public int[] numsZeroToThree = new int[4];
    public int[] numsFiveToTen = new int[6];
    public int[] countdown = new int[4];

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    public void stepOne() {
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array
        for (int i = 0; i <= 3; i++){
            numsZeroToThree[i] = i;
        }

    }

    public void stepTwo() {
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array

        for (int i = 0; i <= 5; i++){
            numsFiveToTen[i] = 5 + i;
        }

    }

    public void stepThree() {
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array

        int a = 3;
        for (int i = 0; i < countdown.length; i++){
            countdown[i] = a--;

        }
    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array

        for (int i = 0; i < favouriteNumbers.length; i++){
            if(num == favouriteNumbers[i]) return true;
        }

        return false;
    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array

        for (int i = 0; i < myHobbies.length; i++){
            if(hobby == myHobbies[i]) return true;
        }

        return false;
    }
}
