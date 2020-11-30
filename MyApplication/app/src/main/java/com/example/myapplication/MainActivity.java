package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*private Button buttonmy,buttonmy1;
    private LinearLayout b_1, b_2, b_3;
    private ProgressBar pb;
    private int count = 0;
    private SeekBar sk;
    private EditText text;*/
    private Button button_add;
    private Button button_del;
    private Button button_res;
    private EditText add_num;
    private EditText all_num;
    private EditText kg;
    private EditText weight;
    private boolean enter = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*b_1 = findViewById(R.id.linearLayout1);
        b_2 = findViewById(R.id.linearLayout2);
        b_2 = findViewById(R.id.linearLayout3);
        buttonmy = findViewById(R.id.button3);
        buttonmy1 = findViewById(R.id.button6);
        pb = findViewById(R.id.progressBar);
        text = findViewById(R.id.editTextNumber);
        pb.setMax(100);
        sk = findViewById(R.id.seekBar);
        sk.setMax(200);*/
        button_res = findViewById(R.id.button12);
        add_num =  findViewById(R.id.editTextNumber2);
        all_num =  findViewById(R.id.editTextNumber3);
        kg  =  findViewById(R.id.editTextNumber4);
        weight =  findViewById(R.id.editTextNumber5);


    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    public void ClickAdd(View view) {
        int a  = 0,b = 0;
        String bb =all_num.getText().toString();
        b = Integer.parseInt(bb);
        String aa =add_num.getText().toString();
        a = Integer.parseInt(aa);
        b += a;
        all_num.setText(String.valueOf(b));
        if(enter != false) {
            String aas = button_res.getText().toString();
            double j = Double.parseDouble(aas);
            if ((int) j < b) {
                Toast.makeText(MainActivity.this, "Вы выпили слишком много воды. Вам лучше уменьшить её потребление.", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void ClickDel(View view) {
        int a  = 0,b = 0;
        String aa =add_num.getText().toString();
        a = Integer.parseInt(aa);
        String bb =all_num.getText().toString();
        b = Integer.parseInt(bb);
        if(b-a  < 0){
            b = 0;
        }
        else
            b -= a;
        all_num.setText(String.valueOf(b));
    }

    public void waterinday(View view) {
        int kilo = 0;
        int time = 0;
        kilo  = Integer.valueOf(kg.getText().toString());
        time = Integer.valueOf(weight.getText().toString());
        double sum = (kilo * 0.03 + time * 0.5)*1000;
        button_res.setText(String.valueOf(sum));
        enter = true;

    }


    /*public void OnClickStart(View view) {
        buttonmy.setText("ITS WORK");
    }
    public void ClickTobutton1(View view){
        count--;
        pb.setProgress(count);
        String asda= text.getText().toString();
        int number = Integer.parseInt(asda);
        buttonmy1.setText(String.valueOf(number*10));

    }
    public void ClickTobutton(View view) {
        buttonmy.setText("I Click on button");
        int i = sk.getProgress();
        String name = String.valueOf(i);
        buttonmy.setText(name);
        count++;
        pb.setProgress(count);

    }*/


}