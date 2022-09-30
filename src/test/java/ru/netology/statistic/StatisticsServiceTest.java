package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    public void findMaxIncomeGrowth() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 10, 15, 25, 35, 45, 50, 55, 65, 75, 85};
        long expected = 85;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}