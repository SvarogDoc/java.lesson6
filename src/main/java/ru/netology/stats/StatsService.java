package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) { //сумма продаж за год
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calcAverageSum(int[] sales) { //средняя сумма продаж в мес
       return calcSum(sales) / sales.length;

    }

    public int findMax(int[] sales) { // последний месяц с пиком продаж
        int currentMax = sales[0];
        for (int sale : sales) {
            if (currentMax < sale) {
                currentMax = sale;
            }
        }
        return currentMax;
    }

    public int findMin(int[] sales) { //последний месяц с минимумом продаж
        int currentMin = 0;
        for (int sale : sales) {
            if (currentMin > sale) {
                currentMin = sale;
            }
        }
        return currentMin;
    }

    public int calcUnAverage(int[] sales) { //количество мес, где продажи были меньше средней
        int count = 0;
        double averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale < averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calcUpAverage(int[] sales) { //количество мес, где продажи были больше средней
        int count = 0;
        double averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale > averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

}
