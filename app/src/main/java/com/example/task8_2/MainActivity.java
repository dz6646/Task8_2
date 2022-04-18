package com.example.task8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch condition;
    RadioButton RB1;
    RadioButton RB2;
    RadioButton RB3;
    RadioButton RB4;
    Button Change;
    LinearLayout LN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        condition = (Switch) findViewById(R.id.Switch);
        RB1 = (RadioButton) findViewById(R.id.RB1);
        RB2 = (RadioButton) findViewById(R.id.RB2);
        RB3 = (RadioButton) findViewById(R.id.RB3);
        RB4 = (RadioButton) findViewById(R.id.RB4);
        Change = (Button) findViewById(R.id.Click);
        LN = (LinearLayout) findViewById(R.id.LN);
    }

    public int switchOn(View view) {
        if(!(condition.isChecked()))
        {
            return 1;
        }
        else
        {
            if(RB1.isChecked()) LN.setBackgroundColor(Color.RED);
            else if(RB2.isChecked()) LN.setBackgroundColor(Color.YELLOW);
            else if(RB3.isChecked()) LN.setBackgroundColor(Color.GREEN);
            else if(RB4.isChecked()) LN.setBackgroundColor((Color.BLUE));
        }
        return 0;
    }

    public int switchOff(View view) {
        if(condition.isChecked())
        {
            return 1;
        }
        else
        {
            if(RB1.isChecked()) LN.setBackgroundColor(Color.RED);
            else if(RB2.isChecked()) LN.setBackgroundColor(Color.YELLOW);
            else if(RB3.isChecked()) LN.setBackgroundColor(Color.GREEN);
            else if(RB4.isChecked()) LN.setBackgroundColor((Color.BLUE));
        }
        return 0;
    }
}