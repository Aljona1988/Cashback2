package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackerTest {

    @Test
    public void testRemain1() {
        CashbackHacker service = new CashbackHacker();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        CashbackHacker service = new CashbackHacker();
        int amount = 100;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }
}
