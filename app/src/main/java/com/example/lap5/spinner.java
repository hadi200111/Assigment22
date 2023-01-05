package com.example.lap5;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class spinner extends MainActivity {
    ArrayAdapter<String> adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arraySpinner = new String[] {
                "Full Time","Part Time"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner2);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }
    public ArrayAdapter getItems(){
        return adapter;

    }
}
