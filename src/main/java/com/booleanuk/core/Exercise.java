package com.booleanuk.core;

public class Exercise {
    public int[] numsZeroToThree;
    // Assuming we can just initialize the arrays
    public int[] numsFiveToTen = new int[6];
    public int[] countdown = new int[4];

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    public void stepOne() {
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array
        int[] tempArray = new int[4];
        for (int i = 0; i < 4; i++) {
            tempArray[i] = i;
        }
        this.numsZeroToThree = tempArray;
    }

    public void stepTwo() {
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array
        int index = 0;
        for (int i = 5; i < 11; i++) {
            this.numsFiveToTen[index] = i;
            index++;
        }
    }

    public void stepThree() {
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array
        int index = 0;
        for (int i = 3; i >= 0; i--) {
            this.countdown[index] = i;
            index++;
        }
    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array
        for (int numbb : this.favouriteNumbers) {
            if (numbb == num) {
                return true;
            }
        }
        return false;
    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array
        for (String hobb : this.myHobbies) {
            if (hobb.equals(hobby)) {
                return true;
            }
        }
        return false;
    }
}
