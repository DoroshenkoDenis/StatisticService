package ru.doroshenko.statistics;

public class TotalSum {
    public int totalSumCalculate(int[] monthlySales) {
        int sum = 0;
        for (int saleAmount : monthlySales) {
            sum += saleAmount;
        }
        return sum;
    }

}
