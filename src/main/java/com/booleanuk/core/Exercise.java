package com.booleanuk.core;

public class Exercise {
    public int[] numsZeroToThree;
    public int[] numsFiveToTen;
    public int[] countdown;

    public int[] favouriteNumbers = {1, 2, 4, 5, 7, 8, 10};

    public String[] myHobbies = {"Fishing", "Language learning", "Skydiving", "Procrastinating"};

    public void stepOne() {
        // TODO: 1. Write a for loop that adds the numbers 0 to 3 to the numsZeroToThree array
        int[] array = new int[4];
        for(int i=0; i<array.length;i++)
        {
            array[i]=i;
        }
        numsZeroToThree=array;


    }

    public void stepTwo() {
        // TODO: 2. Write a for loop that adds the numbers 5 to 10 to the numsFiveToTen array
        int[] array = new int[6];
        for(int i=0; i<array.length;i++)
        {
            array[i]=i+5;
        }
        numsFiveToTen=array;

    }

    public void stepThree() {
        // TODO: 3. Write a for loop that adds the numbers 3 to 0 (in that order) to the countdown array

        int[] array = new int[4];
        for(int i=0; i<array.length;i++)
        {
            array[i]=array.length-1-i;
        }
       countdown=array;

    }

    public boolean stepFour(int num) {
        // TODO: 6. Write a for loop that checks if num is in the favouriteNumbers array

        for (int numbers: favouriteNumbers
             ) {
            if(numbers==num)
            {
                return true;
            }
        }
        return false;

    }

    public boolean stepFive(String hobby) {
        // TODO 5. Write a for loop that checks if the hobby String is in the myHobbies array

        for(String myhobby:myHobbies)
        {
            if(myhobby.equals(hobby))
            {
                return true;
            }
        }

        return false;
    }
}
