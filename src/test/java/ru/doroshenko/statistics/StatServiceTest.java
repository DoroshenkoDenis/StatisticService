package ru.doroshenko.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {
    int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void totalSumCalculate() {
        StatService service = new StatService();
        int expected = 180;
        int actual = service.totalSumCalculate(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void averageSumCalculate() {
        StatService service = new StatService();
        int expected = 15;
        int actual = service.averageSumCalculate(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void findLastMaxSaleMonth() {
        StatService service = new StatService();
        int expected = 8;
        int actual = service.findLastMaxSaleMonth(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void findLastMinSaleMonth() {
        StatService service = new StatService();
        int expected = 9;
        int actual = service.findLastMinSaleMonth(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void countLowSalesMonths() {
        StatService service = new StatService();
        int expected = 5;
        int actual = service.countLowSalesMonths(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void countHighSalesMonths() {
        StatService service = new StatService();
        int expected = 5;
        int actual = service.countHighSalesMonths(monthlySales);
        assertEquals(expected, actual);
    }
}