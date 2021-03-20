package ru.doroshenko.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageSumTest {

    @Test
    void averageSumCalculate() {
        AverageSum averageRate = new AverageSum();
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = averageRate.averageSumCalculate(monthlySales);
        assertEquals(expected, actual);
    }
}