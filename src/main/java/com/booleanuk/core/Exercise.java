package com.booleanuk.core;

public class Exercise {
    public int[] numsZeroToThree;
    public int[] numsFiveToTen;
    public int[] countdown;

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    public void stepOne() {
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array
        int[] arr = new int[4];

        for (int i = 0; i <= 3 ; i++) {
            arr[i] = i;

        }
        this.numsZeroToThree = arr;

    }

    public void stepTwo() {
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array
        int[] arr = new int[6];

        for (int i = 5; i <= 10 ; i++) {
            arr[i-5] = i;

        }
        this.numsFiveToTen = arr;

    }

    public void stepThree() {
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array
        int[] arr = new int[4];
        int num=3;
        for (int i = 0; i <= 3 ; i++) {
            arr[i] = num;
            num--;

        }
        this.countdown = arr;

    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array
        int numberIn=0;
        boolean favNumberInArray =false;
        for (int i = 0; i <= favouriteNumbers.length-1 ; i++) {
            numberIn=favouriteNumbers[i];
            if (numberIn==num)favNumberInArray=true;

        }
       return favNumberInArray;



    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array
        String stringIn="";
        boolean hobbyIn =false;
        for (int i = 0; i <= myHobbies.length-1 ; i++) {
            stringIn=myHobbies[i];
            if (stringIn.equals(hobby))hobbyIn=true;

        }
        return hobbyIn;


    }
}
