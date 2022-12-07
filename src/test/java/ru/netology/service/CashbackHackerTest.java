package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerTest {

    @Test
    public void testRemain1() {
        CashbackHacker service = new CashbackHacker();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain2() {
        CashbackHacker service = new CashbackHacker();
        int amount = 100;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);

    }
}
