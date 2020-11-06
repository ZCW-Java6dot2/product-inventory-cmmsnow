package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToesocksTest {

    @Test
    public void constructorTest() {
        //given (1)
        int expectedId = 1;
        String expectedName = "Floofy";
        String expectedBrand = "Booboo's";
        String expectedSport = "Couch";
        int expectedSize = 7;
        int expectedQty = 10;
        float expectedPrice = 9.00f;

        //when (2)
        Toesocks testToesocks = new Toesocks(expectedId, expectedName, expectedBrand, expectedSport, expectedSize, expectedQty, expectedPrice);
        int actualId = testToesocks.getId();
        String actualName = testToesocks.getName();
        String actualBrand = testToesocks.getBrand();
        String actualSport = testToesocks.getSport();
        int actualSize = testToesocks.getSize();
        int actualQty = testToesocks.getQty();
        float actualPrice = testToesocks.getPrice();


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
