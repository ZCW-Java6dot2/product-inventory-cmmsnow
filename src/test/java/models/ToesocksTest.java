package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToesocksTest {

    @Test
    public void constructorTest() {
        //given (1)
        String expectedName = "Floofy";
        int expectedId = 6;
        String expectedBrand = "Booboo's";

        //when (2)
        Toesocks testToesocks = new Toesocks(expectedId, expectedName, expectedBrand);
        String actualBrand = testToesocks.getBrand();
        String actualName = testToesocks.getName();
        int actualId = testToesocks.getId();

        //then (3)
        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
    }
}
