package task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitPlaceChangerTest {

    @Test
    public void testChangePlaceDigit() {
        DigitPlaceChanger changer = new DigitPlaceChanger();
        assertEquals(changer.changePlaceDigit(12345), 54321);
    }
}

