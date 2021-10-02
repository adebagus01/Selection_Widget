package com.example.autofilltext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private static final String[] name = {"Workshop sistem informasi berbasis website", "Workshop mobile application", "Struktur data", "Workshop kualitas perangkat lunak"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView edittext = findViewById(R.id.auto);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, name);
        edittext.setAdapter(adapter);

    }
}