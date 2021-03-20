package ru.doroshenko.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMonthlySaleTest {

    @Test
    void maxMonthlySaleCalculate() {
        MaxMonthlySale maxMonthlySale = new MaxMonthlySale();
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = maxMonthlySale.maxMonthlySaleCalculate(monthlySales);
        assertEquals(expected, actual);
    }
}