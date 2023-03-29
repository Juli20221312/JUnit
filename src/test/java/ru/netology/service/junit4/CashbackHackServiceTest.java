package ru.netology.service.junit4;

import org.junit.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.Assert.*;



public class CashbackHackServiceTest {

    @Test
    public void amountBuy900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void amountBuy1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void amountBuy1300() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(expected, actual);
    }
}