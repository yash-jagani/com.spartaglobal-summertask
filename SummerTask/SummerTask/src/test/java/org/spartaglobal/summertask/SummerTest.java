package org.spartaglobal.summertask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SummerTest {

    @DisplayName("Given that the integers in the array are negative")
    @Test
    void shouldSumNegatives(){
        int[] arr = {-5, -7, -12, -3, -7};
        Summer summer = new Summer();
        assertEquals(Arrays.stream(arr).sum(), summer.sumArray(arr));
    }

    @DisplayName("Given that the integers in the array are large, the sum should be returned")
    @Test
    void shouldSumPositiveNegative(){
        int[] arr = {-42, 23, -12, 13, -5};
        Summer summer = new Summer();
        assertEquals(Arrays.stream(arr).sum(), summer.sumArray(arr));
    }

    @DisplayName("Given that the integers in the array are positive and negative, the sum should be returned")
    @Test
    void shouldSumLargeValues(){
        int[] arr = {500, 254, 236, 164, 1063};
        Summer summer = new Summer();
        assertEquals(Arrays.stream(arr).sum(), summer.sumArray(arr));
    }

    @DisplayName("Given that there are 50 integers in the array, the sum should be returned")
    @Test
    void shouldSumFiftyValues(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
                18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34,
                35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        Summer summer = new Summer();
        assertEquals(Arrays.stream(arr).sum(), summer.sumArray(arr));
    }

    @DisplayName("Given that there is only 1 integer in the array, the sum should be returned")
    @Test
    void shouldSumTwoValues(){
        int[] arr = {2};
        Summer summer = new Summer();
        assertEquals(Arrays.stream(arr).sum(), summer.sumArray(arr));
    }

}