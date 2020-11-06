package services;

import models.Fluffyslippers;
import models.Toesocks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToesocksServiceTest {
    @Test
    public void createTest(){
        // (1)
        String expectedName = "Floofy";
        String expectedBrand = "Booboo's";
        String expectedSport = "Couch";
        int expectedSize = 7;
        int expectedQty = 10;
        float expectedPrice = 9.00f;

        // (2)
        ToesocksService toesocksService = new ToesocksService();
        Toesocks testToesocks = toesocksService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testToesocks.getId();
        String actualName = testToesocks.getName();
        String actualBrand = testToesocks.getBrand();
        String actualSport = testToesocks.getSport();
        int actualSize = testToesocks.getSize();
        int actualQty = testToesocks.getQty();
        float actualPrice = testToesocks.getPrice();

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
