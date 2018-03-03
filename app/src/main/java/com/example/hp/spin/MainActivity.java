package com.example.hp.spin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String arr_univ[]={"select any one","DU","IPU"};
    String arr_clg[]={"select any one","Keshav","Hansraj"};
    String arr_dept[]={"select any one","CS","Chemistry"};
    Spinner univ,clg,dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        univ=findViewById(R.id.spinner1);
        univ=findViewById(R.id.spinner2);
        univ=findViewById(R.id.spinner3);

        ArrayAdapter spinadapt=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr_univ);
        ArrayAdapter spinadapt2=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr_clg);
        ArrayAdapter spinadapt3=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr_dept);

        univ.setAdapter(spinadapt);
        clg.setAdapter(spinadapt2);
        dept.setAdapter(spinadapt3);

        univ.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        dept.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        dept.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    }

