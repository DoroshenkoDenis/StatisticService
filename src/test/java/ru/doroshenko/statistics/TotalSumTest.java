package ru.doroshenko.statistics;

import static org.junit.jupiter.api.Assertions.*;

class TotalSumTest {

    @org.junit.jupiter.api.Test
    void totalSumCalculate() {
        TotalSum totalSum = new TotalSum();
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = totalSum.totalSumCalculate(monthlySales);
        assertEquals(expected, actual);
    }
}