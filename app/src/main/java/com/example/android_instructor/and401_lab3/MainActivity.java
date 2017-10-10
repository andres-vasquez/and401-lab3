package com.example.android_instructor.and401_lab3;

import android.support.annotation.IdRes;
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

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

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

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("seekBar",""+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.i("seekBar","Start");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.i("seekBar","Stop");
            }
        });

        switch1.setOnCheckedChangeListener(this);
        checkBox.setOnCheckedChangeListener(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.radioButton1:
                        Log.i("radioGroup","1");
                        break;
                    case R.id.radioButton2:
                        Log.i("radioGroup","2");
                        break;
                    case R.id.radioButton3:
                        Log.i("radioGroup","3");
                        break;
                }
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.switch1:
                Log.i("switch1",""+isChecked);
                break;
            case R.id.checkBox:
                Log.i("checkBox",""+isChecked);
                break;
        }
    }
}
