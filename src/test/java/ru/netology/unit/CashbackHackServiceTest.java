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


}