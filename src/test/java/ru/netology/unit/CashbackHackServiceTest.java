package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturnRemainIfAmountIs800() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldReturnRemainIfAmountIs999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainIfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainIfAmountIs1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1002;
        int expected = 998;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }




}