package com.booleanuk.core;

public class Exercise {
    public int[] numsZeroToThree;
    public int[] numsFiveToTen = new int[6];
    public int[] countdown;

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    public void stepOne() {
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array


    }

    public void stepTwo() {
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array
        for (int i =0 ;i<numsFiveToTen.length;i++) {
            numsFiveToTen[i] = i+5;
        }

    }

    public void stepThree() {
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array


    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array
        for (int number:favouriteNumbers) {
            if(number == num){
                return true;
            }
            return false;
        }


        return false;
    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array



        return false;
    }
}
