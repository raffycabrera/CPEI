package org.openjfx;
import java.util.Arrays;

//i think we should have a prices array here already


public class generateReceipt {
    int[] itemResult = new int[]{0,0,0,0,0};
    int totalInt;

    public String[] generate(int[] itemQuantity)
    {
        int n;



        itemResult = new int[]{0,0,0,0,0};
        int[] itemPrice = new int[]{100,110,90,100,50};

        //add two to this?
        String[] ret = new String[8];
        String itemQS;
        String itemRS;
        //for loop to create the pieces
        ret[0]="RECEIPT:\n";
        ret[1]="Quantity:    Item:   SubTotal:";

        //change n +1 for every ne item
        for(n=0;n<=4;n++){
            if(itemQuantity[n]>0){
                switch(n) {
                    case 0:
                        itemResult[n]+=itemPrice[n]*itemQuantity[n];

                        itemQS= Integer.toString(itemQuantity[n]);
                        itemRS= Integer.toString(itemResult[n]);


                        ret[n+2]=itemQS+"x         CHORIZO  PHP"+itemRS;
                        break;
                    case 1:
                        itemResult[n]+=itemPrice[n]*itemQuantity[n];

                        itemQS= Integer.toString(itemQuantity[n]);
                        itemRS= Integer.toString(itemResult[n]);


                        ret[n+2]=itemQS+"x         SPAM        PHP"+itemRS;

                        break;
                    case 2:

                        itemResult[n]+=itemPrice[n]*itemQuantity[n];

                        itemQS= Integer.toString(itemQuantity[n]);
                        itemRS= Integer.toString(itemResult[n]);


                        ret[n+2]=itemQS+"x         HOTDOG      PHP"+itemRS;

                        break;
                    case 3:

                        itemResult[n]+=itemPrice[n]*itemQuantity[n];

                        itemQS= Integer.toString(itemQuantity[n]);
                        itemRS= Integer.toString(itemResult[n]);


                        ret[n+2]=itemQS+"x       CORNED BEEF   PHP"+itemRS;

                        break;
                    case 4:

                        itemResult[n]+=itemPrice[n]*itemQuantity[n];

                        itemQS= Integer.toString(itemQuantity[n]);
                        itemRS= Integer.toString(itemResult[n]);


                        ret[n+2]=itemQS+"x       COFFEE     PHP"+itemRS;

                        break;
                }
            }
        }

        return ret;
    }


    public String setTotalArea(){
        String totalString;
        totalInt=0;

        //for total problem here is that it only returns int thats why you would want it in its own method
        for(int i = 0; i < 5; i++)
        {
            totalInt += itemResult[i];
        }


        totalString = Integer.toString(totalInt);
        //total ends here
        return totalString;

    }
    public String calculateTotal(int cash){
        int changeInt;
        String changeString;

        //make if for negative
        //way to delete result
        changeInt = cash - totalInt;
        changeString = Integer.toString(changeInt);

        //
        return changeString;
    }

    //something that returns an array of strings
}
