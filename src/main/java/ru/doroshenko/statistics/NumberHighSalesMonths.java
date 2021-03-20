package ru.doroshenko.statistics;

public class NumberHighSalesMonths {
    int numberHighSalesMonthsCalculate(int[] monthlySales) {
        AverageSum averageRate = new AverageSum();
        int averageSum = averageRate.averageSumCalculate(monthlySales);
        int count = 0;
        for (int saleAmount : monthlySales) {
            if (saleAmount > averageSum)
                count++;
        }
        return count;
    }
}
