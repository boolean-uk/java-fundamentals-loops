package com.booleanuk.core;

public class Exercise {
    public int[] numsZeroToThree;
    public int[] numsFiveToTen;
    public int[] countdown;

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    public void stepOne() {
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array
        int[] tmp = new int[4];
        for (int i=0; i<=3; i++){
            tmp[i] = i;
        }
        this.numsZeroToThree = tmp;
    }

    public void stepTwo() {
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array
        int[] tmp = new int[6];
        for (int i=0; i<=5; i++) {
            tmp[i] = i + 5;
        }
        this.numsFiveToTen = tmp;
    }

    public void stepThree() {
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array
        int[] tmp = new int[4];
        for (int i=0; i<=3; i++){
            tmp[i] = 3 - i;
        }
        this.countdown = tmp;
    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array
        for (int favoriteNumber: favouriteNumbers) {
            if (num == favoriteNumber){
                return true;
            }
        }
        return false;
    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array
        for (String myHobby: myHobbies) {
            if (myHobby.equals(hobby)) {
                return true;
            }
        }
        return false;
    }
}
