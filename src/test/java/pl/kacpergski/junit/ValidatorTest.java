package pl.kacpergski.junit;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ValidatorTest {

    @Test
    public void isNotValidIfLenghth4(){
        //given
        String pesel = "1511";

        //when

        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertFalse(isValid);

    }

    @Test
    public void isValidIfLenghth11(){
        //given
        String pesel = "81011012345";

        //when

        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertTrue(isValid);

    }

    @Test
    public void isValidDayFrom1To31(){
        //given
        String pesel = "81011112345";

        //when

        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertTrue(isValid);

    }

    @Test
    public void isnotValidDayFrom1To31(){
        //given
        String pesel = "81014412345";

        //when

        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertFalse(isValid);

    }

//    @Test
//    public void isValidNumnerFrom100To999(){
//        //given
//        int number = 100;
//
//        //when
//
//        boolean isValid = Validator.peselValidation(pesel);
//
//        //then
//        assertFalse(isValid);
//
//    }
}
