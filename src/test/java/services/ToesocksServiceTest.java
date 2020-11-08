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

    public void findToesocksTest(){
        //
        ToesocksService toesocksService = new ToesocksService();
        Toesocks testToesocks = toesocksService.create("Floofy", "Booboo's", "Couch", 7, 10, 9.00f);


        //assertEquals
        Toesocks expectedToesocks = toesocksService.findToesocks(0);
        Assertions.assertEquals(expectedToesocks, testToesocks);
    }

    public void findAllTest(){
        ToesocksService toesocksService = new ToesocksService();
        Toesocks[] toeArray = new Toesocks[2];

        //(1)
        Toesocks testSocks0 = toesocksService.create("Floofy", "Booboo's", "Couch", 7, 10, 9.00f);
        Toesocks expectedToesocks0 = toesocksService.findToesocks(0);
        toeArray[0] = testSocks0;
        Assertions.assertEquals(expectedToesocks0, testSocks0);

        //(2)
        Toesocks testSocks1 = toesocksService.create("Snug", "Booboo's", "Couch", 7, 10, 9.00f);
        Toesocks expectedToesocks1 = toesocksService.findToesocks(1);
        toeArray[1] = testSocks0;
        Assertions.assertEquals(expectedToesocks1, testSocks1);

        //(3)expected
        Toesocks[] toesocksExpected = toesocksService.findAll();

        //(4)assertEquals
        Assertions.assertEquals(toeArray[0], toesocksExpected[0]);
        Assertions.assertEquals(toeArray[1], toesocksExpected[1]);
    }

    public void deleteTest(){
        ToesocksService toesocksService = new ToesocksService();

        //(1) expected
        Toesocks testToesocks0 = toesocksService.create("Floofy", "Booboo's", "Couch", 7, 10, 9.00f);
        Toesocks testToesocks1 = toesocksService.create("Snug", "Booboo's", "Couch", 7, 10, 9.00f);

        //(2)
        boolean toesocksExpected = toesocksService.delete(1);

        //(3) assertEquals
        Assertions.assertEquals(toesocksExpected, true);
        Assertions.assertEquals(toesocksService.findToesocks(1), null);
    }
}
