package ru.doroshenko.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberLowSalesMonthsTest {

    @Test
    void numberLowSalesMonthsCalculate() {
        NumberLowSalesMonths numberLowSalesMonths = new NumberLowSalesMonths();
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = numberLowSalesMonths.numberLowSalesMonthsCalculate(monthlySales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}