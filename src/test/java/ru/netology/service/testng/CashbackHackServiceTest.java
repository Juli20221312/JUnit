package ru.netology.service.testng;
import ru.netology.service.CashbackHackService;

import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void amountBuy900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void amountBuy1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void amountBuy1300() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(actual, expected);
    }

}