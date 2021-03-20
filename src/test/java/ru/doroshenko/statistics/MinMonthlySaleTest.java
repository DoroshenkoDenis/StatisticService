package ru.doroshenko.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMonthlySaleTest {

    @Test
    void minMonthlySaleCalculate() {
        MinMonthlySale minMonthlySale = new MinMonthlySale();
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = minMonthlySale.minMonthlySaleCalculate(monthlySales);
        assertEquals(expected, actual);
    }
}