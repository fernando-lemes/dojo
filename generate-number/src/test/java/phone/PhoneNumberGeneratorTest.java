package phone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneNumberGeneratorTest {

    private PhoneNumberGenerator png;

    @Before
    public void setup(){
        this.png = new PhoneNumberGenerator();
    }

    @Test
    public void generateNumber_withLetterA_return2() throws Exception{
        String text = "a";
        assertEquals("2", this.png.generateNumber(text));
    }

    @Test
    public void generateNumber_withLetterJM_return56() throws PhoneNumberException {
        String text = "jm";
        assertEquals("56", this.png.generateNumber(text));
    }

    @Test
    public void generateNumber_withLetterMYDashLOVE_return69Dash5683() throws PhoneNumberException{
        String text = "MY-LOVE";
        assertEquals("69-5683", this.png.generateNumber(text));
    }

    @Test
    public void generateNumber_with1dashHOMEdashSWEETdashHOME_return1dash4663dash79338dash4663() throws PhoneNumberException{
        String text = "1-HOME-SWEET-HOME";
        assertEquals("1-4663-79338-4663", this.png.generateNumber(text));
    }

    @Test
    public void generateNumber_with1dashHOMEdashSWEETdashHOME_return0dash4663dash79338dash4663() throws PhoneNumberException{
        String text = "0-HOME-SWEET-HOME";
        assertEquals("0-4663-79338-4663", this.png.generateNumber(text));
    }

    @Test
    public void generateNumber_withMYdashMISERABLEdashJOB_return1dash69dash647372253dash562() throws PhoneNumberException{
        String text = "MY-MISERABLE-JOB";
        assertEquals("69-647372253-562", this.png.generateNumber(text));
    }

    @Test(expected = PhoneNumberException.class)
    public void generateNumber_percent_throwPhoneNumberException() throws PhoneNumberException{
        String text = "%a";
       this.png.generateNumber(text);
    }

    @Test(expected = PhoneNumberException.class)
    public void generateNumber_space_throwPhoneNumberException() throws PhoneNumberException{
        String text = "afdfdf ewewewe";
        this.png.generateNumber(text);
    }

    @Test(expected = PhoneNumberException.class)
    public void generateNumber_withNumber_throwPhoneNumberException() throws PhoneNumberException{
        String text = "MY-MI998SERABLE-JOB";
        this.png.generateNumber(text);
    }
}
