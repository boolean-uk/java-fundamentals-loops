package com.booleanuk.core;

public class Exercise {
    public int[] numsZeroToThree;
    public int[] numsFiveToTen;
    public int[] countdown;

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    public void stepOne() {
        numsZeroToThree = new int[4];
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array
    for (int i = 0; i<4; i++){
        numsZeroToThree[i] = i;
    }

    }

    public void stepTwo() {
        numsFiveToTen = new int[6];
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array
        int teller = 0;
        for (int i=5; i<=10; i++){
            numsFiveToTen[teller]=i;
            teller++;
        }
    }

    public void stepThree() {
        countdown = new int[4];
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array
        int teller = 0;
        for (int i =3; i>0; i--){
            countdown[teller] = i;
            teller++;
        }

    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array
        boolean check=false;
        for (int i = 0; i<favouriteNumbers.length; i++){
            if(favouriteNumbers[i]==num){
                check = true;
            }
        }
        return check;
    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array
        boolean check = false;
        for (int i=0; i<myHobbies.length; i++){
            if(myHobbies[i]==hobby){
                check=true;
            }
        }
        return check;
    }
}
