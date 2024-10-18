package com.mmokijewski;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayTricksTest {

    private final ArrayTricks arrayTricks = new ArrayTricks();

    @Test
    void shouldReturnTrueIfNumbersAreInTheMiddle() {
        int[] array = {1, 4, 2, 1};
        int expectedSum = 6;

        boolean result = arrayTricks.checkSumOfTwoNumbersInArray(array, expectedSum);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrueIfNumbersAreSameValue() {
        int[] array = {1, 4, 1, 4};
        int expectedSum = 8;

        boolean result = arrayTricks.checkSumOfTwoNumbersInArray(array, expectedSum);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrueIfNumbersAreAtTheBeginningAndEnd() {
        int[] array = {1, 2, 3, 6};
        int expectedSum = 7;

        boolean result = arrayTricks.checkSumOfTwoNumbersInArray(array, expectedSum);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseIfOneNumberEqualsToSum() {
        int[] array = {1, 3, 2, 6, 7};
        int expectedSum = 6;

        boolean result = arrayTricks.checkSumOfTwoNumbersInArray(array, expectedSum);

        assertFalse(result);
    }

    @Test
    void shouldReturnTrueIfOneNumberEqualsToSumButThereIsZeroInArray() {
        int[] array = {1, 3, 0, 2, 6, 7};
        int expectedSum = 6;

        boolean result = arrayTricks.checkSumOfTwoNumbersInArray(array, expectedSum);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseIfNoSuchSumFound() {
        int[] array = {1, 3, 3, 6};
        int expectedSum = 20;

        boolean result = arrayTricks.checkSumOfTwoNumbersInArray(array, expectedSum);

        assertFalse(result);
    }
}