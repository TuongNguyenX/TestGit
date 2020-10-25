package com.example.githubtest.Service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.githubtest.R;

public class ServiceActivity extends AppCompatActivity {
    EditText editTextInput;
    Button buttonStart,buttonStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        editTextInput = findViewById(R.id.editTextInput);
        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starServicene();
            }
        });
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopServicene();
            }
        });

    }

    private void stopServicene() {
        Intent serviceIntent = new Intent(this,ExampleService.class);
        stopService(serviceIntent);
    }

    private void starServicene() {
        String input = editTextInput.getText().toString();
        Intent serviceIntent = new Intent(this,ExampleService.class);
        serviceIntent.putExtra("inputExtra",input);

        startService(serviceIntent);

    }


}