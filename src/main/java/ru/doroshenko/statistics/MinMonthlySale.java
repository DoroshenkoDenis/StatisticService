package ru.doroshenko.statistics;

public class MinMonthlySale {
    public int minMonthlySaleCalculate(int[] monthlySales) {

//  Вычисляется минимальное значение в массиве
        int min = monthlySales[0];
        for (int saleAmount : monthlySales) {
            if (saleAmount < min)
                min = saleAmount;
        }
//  Вычисляется номер индекса массива с последним минимальным значением
        int index = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] == min)
                index = i;
        }

        return index + 1;
    }
}
