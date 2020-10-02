package org.openjfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class SecondaryController{
    //descrription textarea
    //5 items for now
    int[] itemQuantity = new int[]{0,0,0,0,0};
    String[] receiptStrings = new String[5];
    generateReceipt generateReceipt = new generateReceipt();


    @FXML
    TextArea detailsField;

    @FXML
    TextArea receiptArea;

    @FXML
    TextField money;

    @FXML
    TextArea totalArea;

    @FXML
    Button okButton;

    @FXML
    Text insufficient;


    @FXML
    private void clearDetails() throws IOException{
        detailsField.clear();
    }



    @FXML
    private void setReceiptArea() throws IOException{
        //have a class that takes the array as a parameter
    //when button of something is pressed add 1 to the array
        receiptArea.clear();
        totalArea.clear();

        receiptStrings = generateReceipt.generate(itemQuantity);
        int n;

        //for loop right here loops for how many pieces we have so far
        //change n to +1 for everytime you add a ne button add two to this? this was 4
        for(n=0;n<=6;n++) {
            if (receiptStrings[n]!=null) {
                receiptArea.appendText(receiptStrings[n]);
                receiptArea.appendText("\n");
            }
        }
        //make a new method for calculating the total so the numbers will stay in generateReceipt class
        //totalArea.setText();
            //i think we can use append text with a for loop each piece of the returned array
    }

    //reset button
    @FXML
    private void reset() throws IOException{
        App.setRoot("secondary");

    }

    //exitButton
    @FXML
    private void switchToPrime() throws IOException {
        App.setRoot("loginscreen");
    }

    //completeButton
    @FXML
    private void complete() throws IOException{


        money.setOpacity(1);
        okButton.setOpacity(1);
        okButton.setDisable(false);
        //what does getText return make a variable to gold the text from money




        //call primary

    }

    //okBUtton
    @FXML
    private void calculate() throws IOException{
        int moneyINT;
        //clear the totalArea
        insufficient.setText(" ");

        moneyINT = Integer.parseInt(money.getText());
        int inum = Integer.parseInt(generateReceipt.calculateTotal(moneyINT));

        if (inum<0){
            insufficient.setText("INSUFFICIENT FUNDS");
            money.clear();

        }else {
            money.setOpacity(0);
            okButton.setOpacity(0);
            okButton.setDisable(true);

            totalArea.appendText("\n     CHANGE:   "+Integer.toString(inum));

        }


    }

//opacity 100 on the box that will get the mmoney have something like set opacity?
//print receipt? into a text file

//after creating the commands here, put them into the action code secttion of the respective button in scenebuilder
//then you arrange the arrays in generate receipt fix the cases and the itemprices? and then change the for loop n (increase)
    @FXML
    private void chorizoDescription() throws IOException{
        detailsField.setText("THIS IS CHORIZO MUDKIP and rice\n\n100Php \nPreparation Time: 20 mins");
    }

    @FXML
    private void chorizoPressed() throws IOException{
        itemQuantity[0]+=1;
        setReceiptArea();
        totalArea.setText("        Total:   ");
        totalArea.appendText(generateReceipt.setTotalArea());
    }

//food tab
    @FXML
    private void spamDescription() throws IOException{
        detailsField.setText("you like spam?\n\n110Php \nPreparation Time: 30 mins");
    }

    @FXML
    private void spamPressed() throws IOException{
        itemQuantity[1]+=1;
        setReceiptArea();
        totalArea.setText("        Total:   ");
        totalArea.appendText(generateReceipt.setTotalArea());
    }

    @FXML
    private void hotdogDescription() throws IOException{
        detailsField.setText("This is hotdog\nserver with rice\n\n90Php \nPreparation Time: 20 mins");
    }

    @FXML
    private void hotdogPressed() throws IOException{
        itemQuantity[2]+=1;
        setReceiptArea();
        totalArea.setText("        Total:   ");
        totalArea.appendText(generateReceipt.setTotalArea());
    }

    @FXML
    private void cornedDescription() throws IOException{
        detailsField.setText("corned beef\nserver with rice\n\n100Php \nPreparation Time: 20 mins");
    }

    @FXML
    private void cornedPressed() throws IOException{
        itemQuantity[3]+=1;
        setReceiptArea();
        totalArea.setText("        Total:   ");
        totalArea.appendText(generateReceipt.setTotalArea());
    }



//drinks tab
    @FXML
    private void coffeeDescription() throws IOException{
    detailsField.setText("Cup of Coffee\nmade with nice beans\n\n50Php \nPreparation Time: 30 mins");
    }

    @FXML
    private void coffeePressed() throws IOException{
        itemQuantity[4]+=1;
        setReceiptArea();
        totalArea.setText("        Total:   ");
        totalArea.appendText(generateReceipt.setTotalArea());
    }


    //misc tab

}