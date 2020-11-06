package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FluffyslippersTest {

    @Test
    public void constructorTest() {
        //given (1)
        int expectedId = 1;
        String expectedName = "Biddy";
        String expectedBrand = "Booboo's";
        String expectedSport = "Sleep";
        int expectedSize = 7;
        int expectedQty = 10;
        float expectedPrice = 15.00f;

        //when (2)
        Fluffyslippers testFluffyslippers = new Fluffyslippers(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        int actualId = testFluffyslippers.getId();
        String actualName = testFluffyslippers.getName();
        String actualBrand = testFluffyslippers.getBrand();
        String actualSport = testFluffyslippers.getSport();
        int actualSize = testFluffyslippers.getSize();
        int actualQty = testFluffyslippers.getQty();
        float actualPrice = testFluffyslippers.getPrice();

        //then (3)
        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}
