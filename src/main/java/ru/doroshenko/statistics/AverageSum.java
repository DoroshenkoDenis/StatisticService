package ru.doroshenko.statistics;

public class AverageSum {
    public int averageSumCalculate(int[] monthlySales) {
        TotalSum totalSum = new TotalSum();
        int sum = totalSum.totalSumCalculate(monthlySales);
        return sum / monthlySales.length;
    }
}
