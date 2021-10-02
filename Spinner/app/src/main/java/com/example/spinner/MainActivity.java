package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Spinner spinner;

    private String [] nama = {"Ade", "Bagus", "Pratama", "Kiara"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv);
        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapterSpinner = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, nama);

        spinner.setAdapter(adapterSpinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (1) {
                    case 0:
                        textView.setText("Ade");
                        break;
                    case 1:
                        textView.setText("Bagus");
                        break;
                    case 2:
                        textView.setText("Pratama");
                        break;
                    case  3:
                        textView.setText("Kiara");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}