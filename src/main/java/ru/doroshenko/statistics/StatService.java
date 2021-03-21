package ru.doroshenko.statistics;

public class StatService {

    // Рассчитывает сумму всех продаж
    public int totalSumCalculate(int[] monthlySales) {
        int sum = 0;
        for (int saleAmount : monthlySales) {
            sum += saleAmount;
        }
        return sum;
    }

    // Рассчитывает среднюю сумму продаж в месяц
    public int averageSumCalculate(int[] monthlySales) {
        return totalSumCalculate(monthlySales) / monthlySales.length;
    }

    // Рассчитывает последний номер месяца с максимальной суммой продажи (вариант алгоритма - 1)
    public int findLastMaxSaleMonth(int[] monthlySales) {
        //  Вычисляется максимальное значение в массиве
        int maxValue = monthlySales[0];
        for (int saleAmount : monthlySales) {
            if (saleAmount > maxValue)
                maxValue = saleAmount;
        }
        //  Вычисляется номер индекса массива с последним максимальным значением
        int maxSaleMont = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] == maxValue)
                maxSaleMont = i + 1;
        }
        return maxSaleMont;
    }

    // Рассчитывает последний номер месяца с минимальной суммой продажи (вариант алгоритма - 2)
    public int findLastMinSaleMonth(int[] monthlySales) {
        int minValue = monthlySales[0];
        int i = 0;
        int minSaleMonth = 0;
        for (int saleAmount : monthlySales) {
            i++;
            if (minValue >= saleAmount) {
                minValue = saleAmount;
                minSaleMonth = i;
            }
        }
        return minSaleMonth;
    }

    // Рассчитывает кол-во месяцев, в которых продажи были ниже среднего
    public int countLowSalesMonths(int[] monthlySales) {
        int averageSum = averageSumCalculate(monthlySales);
        int countMaxSales = 0;
        for (int saleAmount : monthlySales) {
            if (saleAmount > averageSum)
                countMaxSales++;
        }
        return countMaxSales;
    }

    // Рассчитывает кол-во месяцев, в которых продажи были выше среднего
    public int countHighSalesMonths(int[] monthlySales) {
        int averageSum = averageSumCalculate(monthlySales);
        int countMinSales = 0;
        for (int saleAmount : monthlySales) {
            if (saleAmount > averageSum)
                countMinSales++;
        }
        return countMinSales;
    }

}