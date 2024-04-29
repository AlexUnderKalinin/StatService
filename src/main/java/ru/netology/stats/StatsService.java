package ru.netology.stats;

public class StatsService {


    public long calculateSumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long findAverage(long[] sales) {

        return calculateSumSales(sales) / sales.length;
    }

    public long averageSales(long[] sales) {
        if (sales.length == 0) {
            return 0;
        } else {
            return calculateSumSales(sales) / sales.length;
        }
    }

    public int findMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int findMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int findSalesBelowAverage(long[] sales) {
        int counter = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public long findSalesAboveAverage(long[] sales) {
        int counter = 0;
        long average = averageSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}





