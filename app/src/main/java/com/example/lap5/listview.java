package com.example.lap5;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class listview extends MainActivity{
    ArrayAdapter<Employ> adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Employ[] arraySpinner = new Employ[] {

        };
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView s = (ListView) findViewById(R.id.edtlist);
        adapter = new ArrayAdapter<Employ>(this,
                android.R.layout.simple_list_item_1, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }
    public ArrayAdapter getItems(){
        return adapter;

    }


}
