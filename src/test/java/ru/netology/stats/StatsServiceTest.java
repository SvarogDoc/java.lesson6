package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldcalcSum() {
        StatsService service = new StatsService(); //сумма продаж за год
                int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calcAverageSum() {//средняя сумма продаж в мес
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        double actual = service.calcAverageSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() { //последний месяц с пиком продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calcFindMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() { //последний месяц с минимумом продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calcFindMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calcUnAverage() { //количество мес, где продажи были меньше средней
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        double actual = service.calcUnAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calcUpAverage() { //количество мес, где продажи были больше средней
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        double actual = service.calcUpAverage(sales);
        assertEquals(expected, actual);
    }
}