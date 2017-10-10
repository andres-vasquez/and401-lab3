package com.example.android_instructor.and401_lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class SelectorActivity extends AppCompatActivity {

    private static final String LOG = SelectorActivity.class.getSimpleName();

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        spinner = (Spinner)findViewById(R.id.spinner);

        List<String> lstOpciones = new ArrayList<>();
        lstOpciones.add("Leche");
        lstOpciones.add("Chocolate");
        lstOpciones.add("Pan");
        lstOpciones.add("Coca Cola");

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,lstOpciones);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.i(LOG,"Posicion: "+position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
