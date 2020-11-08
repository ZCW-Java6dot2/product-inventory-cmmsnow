package services;

import models.Fluffyslippers;
import models.Toesocks;
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

    public void findFluffyslippersTest(){
        //
        FluffyslippersService fluffyslippersService = new FluffyslippersService();
        Fluffyslippers testFluffyslippers = fluffyslippersService.create("Biddy", "Booboo's", "Sleep", 7, 10, 15.00f);


        //assertEquals
        Fluffyslippers expectedFluffyslippers = fluffyslippersService.findFluffyslippers(0);
        Assertions.assertEquals(expectedFluffyslippers, testFluffyslippers);
    }

    public void findAllTest(){
        FluffyslippersService fluffyslippersService = new FluffyslippersService();
        Fluffyslippers[] fluffArray = new Fluffyslippers[2];

        //(1)
        Fluffyslippers testSlippers0 = fluffyslippersService.create("Biddy", "Booboo's", "Sleep", 7, 10, 15.00f);
        Fluffyslippers expectedFluffyslippers0 = fluffyslippersService.findFluffyslippers(0);
        fluffArray[0] = testSlippers0;
        Assertions.assertEquals(expectedFluffyslippers0, testSlippers0);

        //(2)
        Fluffyslippers testSlippers1 = fluffyslippersService.create("Hunny", "Booboo's", "Sleep", 7, 10, 15.00f);
        Fluffyslippers expectedFluffyslippers1 = fluffyslippersService.findFluffyslippers(1);
        fluffArray[1] = testSlippers1;
        Assertions.assertEquals(expectedFluffyslippers1, testSlippers1);

        //(3) expected
        Fluffyslippers[] fluffExpected = fluffyslippersService.findAll();

        //(4) assertEquals
        Assertions.assertEquals(fluffArray[0], fluffExpected[0]);
        Assertions.assertEquals(fluffArray[1], fluffExpected[1]);
    }

    public void deleteTest(){
        FluffyslippersService fluffyslippersService = new FluffyslippersService();

        //(1) expected
        Fluffyslippers testSlippers0 = fluffyslippersService.create("Biddy", "Booboo's", "Sleep", 7, 10, 15.00f);
        Fluffyslippers testSlippers1 = fluffyslippersService.create("Hunny", "Booboo's", "Sleep", 7, 10, 15.00f);

        //(2)
        boolean fluffExpected = fluffyslippersService.delete(1);

        //(3) assertEquals
        Assertions.assertEquals(fluffExpected, true);
        Assertions.assertEquals(fluffyslippersService.findFluffyslippers(1), null);
    }
}
