package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FluffyslippersTest {

    @Test
    public void constructorTest() {
        //given (1)
        String expectedName = "Biddy";
        int expectedId = 6;
        String expectedBrand = "Booboo's";

        //when (2)
        Fluffyslippers testFluffyslippers = new Fluffyslippers(expectedId, expectedName, expectedBrand);
        String actualBrand = testFluffyslippers.getBrand();
        String actualName = testFluffyslippers.getName();
        int actualId = testFluffyslippers.getId();

        //then (3)
        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
    }
}
