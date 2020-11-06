package services;

import models.Fluffyslippers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FluffyslippersServiceTest {
    @Test
    public void createTest(){
        // (1)
        String expectedName = "Biddy";
        String expectedBrand = "Booboo's";
        String expectedSport = "Sleep";
        int expectedSize = 7;
        int expectedQty = 10;
        float expectedPrice = 15.00f;

        // (2)
        FluffyslippersService fluffyslippersService = new FluffyslippersService();
        Fluffyslippers testFluffyslippers = fluffyslippersService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testFluffyslippers.getId();
        String actualName = testFluffyslippers.getName();
        String actualBrand = testFluffyslippers.getBrand();
        String actualSport = testFluffyslippers.getSport();
        int actualSize = testFluffyslippers.getSize();
        int actualQty = testFluffyslippers.getQty();
        float actualPrice = testFluffyslippers.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}
