package com.example.lap5;

import static com.example.lap5.R.id.edtlist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<Employ> adapter;
    private EditText edtname,edtsalary;
    private Spinner edtspinner;
    private ListView edtlist;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtname = findViewById(R.id.editTextTextPersonName3);
        edtsalary = findViewById(R.id.editTextTextPersonName4);
        edtspinner = findViewById(R.id.spinner2);
        edtlist = findViewById(R.id.edtlist);
        spinner spin = new spinner();
        edtspinner.setAdapter(spin.getItems());
    }

    public void add(View view){
        String name = edtname.getText().toString();
        int salary = Integer.parseInt(edtsalary.getText().toString());
        String work = edtspinner.getSelectedItem().toString();
        Employ emp = new Employ(name,salary,work);
        listview list = new listview();
        Employ[] arraySpinner = new Employ[] {

        };
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView s = (ListView) findViewById(R.id.edtlist);
        adapter = new ArrayAdapter<Employ>(this,
                android.R.layout.simple_list_item_1, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        edtlist.setAdapter(adapter);

    }
}