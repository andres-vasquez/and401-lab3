package com.example.android_instructor.and401_lab3;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private static final String LOG = MainActivity.class.getSimpleName();

    private ToggleButton toggleButton;
    private CheckBox checkBox;
    private SwitchCompat switch1;
    private SeekBar seekBar;
    private RadioGroup radioGroup;
    private ImageButton imageButton;
    private TextInputLayout textInputLayout;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        switch1=(SwitchCompat)findViewById(R.id.switch1);
        seekBar=(SeekBar)findViewById(R.id.seekBar);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        imageButton=(ImageButton)findViewById(R.id.imageButton);
        textInputLayout=(TextInputLayout)findViewById(R.id.textInputLayout);
        editText=(EditText)findViewById(R.id.editText);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("toggleButton",""+isChecked);
            }
        });
    }
}