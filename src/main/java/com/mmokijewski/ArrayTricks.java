package com.mmokijewski;

import java.util.HashSet;
import java.util.Set;

/**
 * Class with simple methods playing with arrays
 *
 * @author mmokijewski
 */
public class ArrayTricks {

    /**
     * This method checks if in a given array off numbers there are two numbers which sum is equal to given expected sum
     *
     * @param array       array of integers to check
     * @param expectedSum expected sum of two integers in the array
     * @return true/false based if given parameters meet the requirements
     */
    public boolean checkSumOfTwoNumbersInArray(int[] array, int expectedSum) {
        Set<Integer> expectedValues = new HashSet<>();

        for (int number : array) {
            if (expectedValues.contains(number)) {
                return true;
            }
            expectedValues.add(expectedSum - number);
        }
        return false;
    }
}