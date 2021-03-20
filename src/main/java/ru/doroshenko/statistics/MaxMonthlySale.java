package ru.doroshenko.statistics;

public class MaxMonthlySale {
    public int maxMonthlySaleCalculate(int[] monthlySales) {

//  Вычисляется максимальное значение в массиве
        int max = monthlySales[0];
        for (int saleAmount : monthlySales) {
            if (saleAmount > max)
                max = saleAmount;
        }
//  Вычисляется номер индекса массива с последним максимальным значением
        int index = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] == max)
                index = i;
        }

        return index + 1;
    }
}


