package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    // long[] sales;
    // StatsService service;

    //  @BeforeEach
    //  public void setup() {
    //      sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    //      service = new StatsService();
    //  }


    @Test
    public void shouldFindSumSales() {
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.calculateSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSales() {
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.findAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() {
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.findMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSales() {
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.findMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSalesBelowAverage() {
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.findSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSalesAboveAverage() {
        long[] sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.findSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}




