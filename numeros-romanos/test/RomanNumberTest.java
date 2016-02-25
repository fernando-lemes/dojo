import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dasilfer on 25/02/2016.
 */
public class RomanNumberTest {

    private RomanNumberGenerator rng;

    @Before
    public void init(){
        this.rng = new RomanNumberGenerator();
    }

    @Test
    public void test_generate_1_roman_number(){
        int numberToTest = 1;
        String str = rng.generateRomanNumber(numberToTest);
        Assert.assertEquals(str,"I");
    }

    @Test
    public void test_generate_5_in_roman_number(){
        int numberToTest = 5;
        String str = rng.generateRomanNumber(numberToTest);
        Assert.assertEquals(str,"V");
    }

    @Test
    public void test_generate_10_roman_number(){
        int numberToTest = 10;
        String str = rng.generateRomanNumber(numberToTest);
        Assert.assertEquals(str,"X");
    }

    @Test
    public void test_generate_50_roman_number(){
        int numberToTest = 50;
        String str = rng.generateRomanNumber(numberToTest);
        Assert.assertEquals(str,"L");
    }



    @Test
    public void test_generate_100_roman_number(){
        int numberToTest = 100;
        String str = rng.generateRomanNumber(numberToTest);
        Assert.assertEquals(str,"C");
    }

    @Test
    public void test_generate_500_roman_number(){
        int numberToTest = 500;
        String str = rng.generateRomanNumber(numberToTest);
        Assert.assertEquals(str,"D");
    }

    @Test
    public void test_generate_1000_roman_number(){
        int numberToTest = 1000;
        String str = rng.generateRomanNumber(numberToTest);
        Assert.assertEquals(str,"M");
    }

    @Test
    public void test_generate_1_alg_number(){
        char numberToTest = 'I';
        int num = rng.generateAlgNumber(numberToTest);
        Assert.assertEquals(num,1);
    }

    @Test
    public void test_generate_5_alg_number(){
        char numberToTest = 'V';
        int num = rng.generateAlgNumber(numberToTest);
        Assert.assertEquals(num,5);
    }

    @Test
    public void test_generate_10_alg_number(){
        char numberToTest = 'X';
        int num = rng.generateAlgNumber(numberToTest);
        Assert.assertEquals(num,10);
    }

    @Test
    public void test_generate_50_alg_number(){
        char numberToTest = 'L';
        int num = rng.generateAlgNumber(numberToTest);
        Assert.assertEquals(num,50);
    }

    @Test
    public void test_generate_100_alg_number(){
        char numberToTest = 'C';
        int num = rng.generateAlgNumber(numberToTest);
        Assert.assertEquals(num,100);
    }

    @Test
    public void test_generate_500_alg_number(){
        char numberToTest = 'D';
        int num = rng.generateAlgNumber(numberToTest);
        Assert.assertEquals(num,500);
    }

    @Test
    public void test_generate_1000_alg_number(){
        char numberToTest = 'M';
        int num = rng.generateAlgNumber(numberToTest);
        Assert.assertEquals(num,1000);
    }

   /* @Test
    public void test_generate_string_number(){
        String roman = "XV";
        RomanNumberGenerator rng = new RomanNumberGenerator();
        int num = rng.generateAlgNumberFromString(roman);
        Assert.assertEquals(num,15);
    }*/



}
