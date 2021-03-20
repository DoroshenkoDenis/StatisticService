package ru.doroshenko.statistics;

public class StatisticService {
    public static void main(String[] args) {

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        TotalSum totalSum = new TotalSum();
        int sum = totalSum.totalSumCalculate(monthlySales);

        AverageSum averageRate = new AverageSum();
        int averageSum = averageRate.averageSumCalculate(monthlySales);

        MaxMonthlySale maxMonthlySale = new MaxMonthlySale();
        int maxSale = maxMonthlySale.maxMonthlySaleCalculate(monthlySales);

        MinMonthlySale minMonthlySale = new MinMonthlySale();
        int minSale = minMonthlySale.minMonthlySaleCalculate(monthlySales);

        NumberLowSalesMonths numberLowSalesMonths = new NumberLowSalesMonths();
        int numberMin = numberLowSalesMonths.numberLowSalesMonthsCalculate(monthlySales);

        NumberHighSalesMonths numberHighSalesMonths = new NumberHighSalesMonths();
        int numberMax = numberHighSalesMonths.numberHighSalesMonthsCalculate(monthlySales);

        System.out.println("Сумма продаж за всё время: " + sum + "\n" +
                "Средняя сумма продаж за всё время: " + averageSum + "\n" +
                "Месяц с максимальной суммой продаж за всё время: " + maxSale + "\n" +
                "Месяц с минимальнй суммой продаж за всё время: " + minSale + "\n" +
                "Количество месяцев, в которых продажи были ниже среднего: " + numberMin + "\n" +
                "Количество месяцев, в которых продажи были выше среднего: " + numberMax + "\n");
    }
}
