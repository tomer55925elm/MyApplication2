package com.example.tomer.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    boolean bo5;
    boolean bo6;
    Button bt1;
    ToggleButton t1;
    Switch sw1;
    LinearLayout Lw1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.bt1);

        t1 = (ToggleButton) findViewById(R.id.t1);

        sw1 = (Switch) findViewById(R.id.sw1);

        Lw1 = (LinearLayout) findViewById(R.id.LW1);
    }

    public void timoti2(View view){bo5 = t1.isChecked();}
    public void tomer2(View view){bo6 = sw1.isChecked();}



    public void tomson2(View view) {

        if(bo5 && bo6){
            Lw1.setBackgroundColor(Color.BLACK);
        }else{
        if (bo5&& !bo6) {
            Lw1.setBackgroundColor(Color.BLUE);
        }else{
            if(!bo5 && bo6){
                Lw1.setBackgroundColor(Color.GREEN);
            }else{
                if (!bo5 && !bo6){
                    Lw1.setBackgroundColor(Color.GRAY);
                }
            }
        }
        }
    }
}