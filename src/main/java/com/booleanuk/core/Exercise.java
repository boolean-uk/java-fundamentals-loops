package com.booleanuk.core;

import java.util.Arrays;

public class Exercise {
    public int[] numsZeroToThree;
    public int[] numsFiveToTen;
    public int[] countdown;

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    private int[] preOccupyArray(int from, int to) {
        int[] _outArray = new int[Math.abs(to - from) + 1];
        int _direction = (int)Math.signum(to - from);

        for (int i = 0; i < _outArray.length; i++)
            _outArray[i] = from + i * _direction;

        System.out.println(Arrays.toString(_outArray));

        return _outArray;
    }

    public void stepOne() {
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array

        numsZeroToThree = preOccupyArray(0, 3);

    }

    public void stepTwo() {
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array

        numsFiveToTen = preOccupyArray(5, 10);

    }

    public void stepThree() {
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array

        countdown = preOccupyArray(3, 0);
    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array

        for (int favouriteNumber : favouriteNumbers)
            if (favouriteNumber == num) return true;

        return false;
    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array

        for (String myHobby : myHobbies)
            if (myHobby.equals(hobby)) return true;

        return false;
    }
}
