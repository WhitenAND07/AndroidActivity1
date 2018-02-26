package com.example.jordiblanco.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greetingText = (TextView) findViewById(R.id.message);
        greetingText.setText(R.string.message);

        Button greetingButton = (Button) findViewById(R.id.button);
        greetingButton.setOnClickListener(new Toaster());

    }
    private class Toaster implements View.OnClickListener {
        public void onClick (View v) {
            Toast.makeText(getApplicationContext(),getString(R.string.textotoast),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
