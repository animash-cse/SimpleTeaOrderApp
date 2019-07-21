package com.example.animash.exercise_1;

import java.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){
        displayPrice(quantity * 5);
    }

    int quantity = 0;
    public void increase(View view){
        quantity = quantity+1;
        display(quantity);
    }

    public void decrease(View view){
        quantity = quantity-1;
        display(quantity);
    }
    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_value);
        quantityTextView.setText(""+ number);
    }

    private void displayPrice(int number){
        int quantity = number/5;
        TextView priceTextView = (TextView) findViewById(R.id.price_value);
        priceTextView.setText("Amount of tea cap: "+ quantity + ".\nPrice is: ৳"+ number);
    }

}
