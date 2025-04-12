package ru.netology.automationBasics;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class CashbackHackServiceTest {
    @Test
    public void remainTest() {

        SoftAssert softAssert = new SoftAssert();

        CashbackHackService service = new CashbackHackService();
        int[] arrayPayment = {0, 1, 999, 1000, 1001};
        int[] arrayExpected = {1000, 999, 1, 0, 999};

        for (int i = 0; i < arrayPayment.length; i++) {
            int payment = arrayPayment[i];
            int actual = service.remain(payment);
            int expected = arrayExpected[i];
            softAssert.assertEquals(actual, expected, "Платеж: " + payment);
        }
        softAssert.assertAll();
    }
}

