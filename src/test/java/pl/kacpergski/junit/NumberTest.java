package pl.kacpergski.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {
    @Test

    public void isValidIfNumberBetween100IncAnd999Inc() {

        //given
        int number = 100;

        //when
        boolean isValid = Number.numberCheck(number);

        //then

        assertTrue(isValid);
    }
        @Test

        public void isnotValidIfNumberBelow100AndOver999(){

            //given
            int number = 99;

            //when
            boolean isValid = Number.numberCheck(number);

            //then

            assertFalse(isValid);
}
}
