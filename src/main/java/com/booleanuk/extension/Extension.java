package com.booleanuk.extension;

public class Extension {
    public int[] numsEven;

    private int[] appendElement(int[] array, int elm) {
        int _arrayLength = array == null ? 0 : array.length;
        int[] _newArray = new int[_arrayLength + 1];

        if (array != null)
            System.arraycopy(array, 0, _newArray, 0, _arrayLength);
        _newArray[_arrayLength] = elm;

        return _newArray;
    }

    public void stepOne() {
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to evenNums

        for (int i = 0; i <= 6; i++) {
            if (i % 2 != 0) continue;
            numsEven = appendElement(numsEven, i);
        }
        
    }
}
