import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dasilfer on 04/02/2016.
 */
public class WithDrawlCash {


    private Cash cash;

    @Before
    public void setup(){
        cash =  new Cash();
    }

    @Test
    public void least_bill_for_30(){
        int[] expected_bills = {10, 20};
        int[] bill_quantity = cash.getQuantity(30);
        Assert.assertArrayEquals("There are enough bills to give $30", expected_bills, bill_quantity);
    }

    @Test
    public void least_bill_for_80(){
        int[] expected_bills = {10, 20, 50};
        int[] bill_quantity = cash.getQuantity(80);
        Assert.assertArrayEquals("There are enough bills to give $80", expected_bills, bill_quantity);
    }


}
