package ru.doroshenko.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberHighSalesMonthsTest {

    @Test
    void numberHighSalesMonthsCalculate() {
        NumberHighSalesMonths numberHighSalesMonths = new NumberHighSalesMonths();
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = numberHighSalesMonths.numberHighSalesMonthsCalculate(monthlySales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}