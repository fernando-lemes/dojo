import java.util.Arrays;

/**
 * Created by dasilfer on 04/02/2016.
 */
public class Cash {
    int[] availableBills = {10, 20, 50, 100};

    int available_money;

    public Cash() {

    }

    int[] getQuantity(int amount) {
        int cont10 = 0, cont20 = 0, cont50 = 0,cont100 = 0;

        //amount = 5;
        int[] bills = {};

        while(amount >= 10){

            if(amount >= 100){
                cont100++;
                amount -= 100;
                bills[] =
            }else if(50 <= amount){
               cont50++;
               amount = amount - 50;
            }else if(amount >= 20){
                cont20++;
                amount -= 20;
            }else if( amount >= 10 ){
                cont10++;
                amount -= 10;
            }


        }



        Arrays.sort(bills);
        return bills;
    }
}
