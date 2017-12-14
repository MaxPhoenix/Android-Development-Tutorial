package com.example.max.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        /*HOW TO ACCESS RESOURCES FROM SOURCE CODE R.<resource_type>.<resource_name>
        // Get a string resource from your app's Resources
        String hello = getResources().getString(R.string.button_send);

        // Or supply a string resource to a method that requires a string
        TextView textView2 = new TextView(this);
        textView.setText(hello);
        */
    }
}
