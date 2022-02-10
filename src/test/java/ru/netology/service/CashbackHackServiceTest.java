package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
         int amount = 900;
         int expected = 100;
         int actual = cashbackHackService.remain(amount);

         assertEquals(actual, expected);
    }

    @Test
    public void minBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void maxBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void minBoundary2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void maxBoundary2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void negativeBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -990;
        int expected = 1990;
        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);
    }



}