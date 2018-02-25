/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    TextView quantityTextView;
    TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
         priceTextView = (TextView) findViewById(R.id.price_text_view);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {

        priceTextView.setText(message);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
     String priceMessage="Total: \u20B9"+quantity * 5+"\nThank you!";

        displayMessage(priceMessage);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {

        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {

        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void decrement(View view) {
        quantity = quantity - 1;
        if(quantity<0)
        {
            Toast.makeText(this,"Not negative",Toast.LENGTH_LONG).show();
        }
        else
        {
            display(quantity);
        }

    }


    public void increment(View view) {

        quantity = quantity + 1;
        display(quantity);


    }
}