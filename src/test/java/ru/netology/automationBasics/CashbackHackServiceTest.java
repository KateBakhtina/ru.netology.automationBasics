package ru.netology.automationBasics;


import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {
    @Test
    public void remainTest() {

        CashbackHackService service = new CashbackHackService();

        int amount1 = 0;
        int expected1 = 1000;
        int actual1 = service.remain(amount1);
        Assert.assertEquals(expected1, actual1);

        int amount2 = 1;
        int expected2 = 999;
        int actual2 = service.remain(1);
        Assert.assertEquals(expected2, actual2);

        int amount3 = 999;
        int expected3 = 1;
        int actual3 = service.remain(999);
        Assert.assertEquals(expected3, actual3);

        int amount4 = 1000;
        int expected4 = 0;
        int actual4 = service.remain(1000);
        Assert.assertEquals(expected4, actual4);

        int amount5 = 1001;
        int expected5 = 999;
        int actual5 = service.remain(1001);
        Assert.assertEquals(expected5, actual5);
     }
}
