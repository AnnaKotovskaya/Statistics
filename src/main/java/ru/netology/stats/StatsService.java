package ru.netology.stats;

public class StatsService {
    public int sum(long[] sales) {
        long generalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            generalSale = (int) (generalSale + sales[i]);
        }
        return (int) generalSale;
    }

    public long averageSales(long[] sales) {
        long generalSale = sum(sales);

        long averageSela = generalSale / sales.length;

        return averageSela;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthBelowAverageSales(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (averageSales(sales) < sale) {
                count++;
            }
        }

        return count;
    }

    public int monthAboveAverageSales(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (averageSales(sales) > sale) {
                count++;
            }
        }

        return count;
    }
}
