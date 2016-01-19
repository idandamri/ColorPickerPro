package com.example.idan.colorpickerpro;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button update;
    RadioGroup radioGroup;
    RadioButton red,blue, green;
    TextView tv;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLayout();
        initEvents();

    }

    private void initEvents() {
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Hello, "+editText.getText());
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int color = 0x0;
                switch(checkedId){
                    case R.id.radioButtonRED:
                        color = Color.RED;
                        break;
                    case R.id.radioButtonBLUE:
                        color = Color.BLUE;
                        break;
                    case R.id.radioButtonGREEN:
                        color = Color.GREEN;
                        break;
                }
                group.setBackgroundColor(color);
            }
        });
    }

    private void initLayout() {
        update = (Button) findViewById(R.id.button);
        radioGroup = (RadioGroup) findViewById(R.id.group);
        red = (RadioButton) findViewById(R.id.radioButtonRED);
        blue = (RadioButton) findViewById(R.id.radioButtonBLUE);
        green = (RadioButton) findViewById(R.id.radioButtonGREEN);
        tv = (TextView) findViewById(R.id.UsrTXT);
        editText = (EditText) findViewById(R.id.editText);
    }


}
