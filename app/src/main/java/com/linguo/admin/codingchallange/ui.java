package com.linguo.admin.codingchallange;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ui extends AppCompatActivity {

    List<String> list;
    List<String> year;
    private Spinner spinner,spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        final TextView t, ti, t2;

        t = findViewById(R.id.text1);
        ti = findViewById(R.id.text2);
        t2 = findViewById(R.id.text3);

        spinner = findViewById(R.id.statee);
        spinner1 = findViewById(R.id.town);
        final ImageView img,img1,img2;

        img = findViewById(R.id.img1);
        img1 = findViewById(R.id.img2);
        img2 = findViewById(R.id.img3);

        populateSpinners();

        findViewById(R.id.img1).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t.setTextColor(Color.parseColor("#000000"));
                    }
                }
        );

        findViewById(R.id.img2).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        img2.setColorFilter(ContextCompat.getColor( ui.this, R.color.yellow), android.graphics.PorterDuff.Mode.SRC_IN);
                        ti.setTextColor(Color.parseColor("#000000"));
                        findViewById(R.id.line1).setBackgroundColor(Color.parseColor("#FFEB3B"));
                    }
                }
        );

        findViewById(R.id.img3).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.setTextColor(Color.parseColor("#000000"));
                        findViewById(R.id.line2).setBackgroundColor(Color.parseColor("#FFEB3B"));
                    }
                }
        );
    }


    private void populateSpinners() {
        prepareList();
        yearList();

        ArrayAdapter<String> spinAdapter = new ArrayAdapter<>(ui.this, R.layout.support_simple_spinner_dropdown_item,list);
        //spinAdapter.setDropDownViewResource(R.layout.custom_dropdown);
        spinner.setAdapter(spinAdapter);


        ArrayAdapter<String> spinAdapter1 = new ArrayAdapter<>(ui.this, R.layout.support_simple_spinner_dropdown_item, year);
        //spinAdapter1.setDropDownViewResource(R.layout.custom_dropdown);
        spinner1.setAdapter(spinAdapter1);

    }

    private void prepareList(){
        list = new ArrayList<>();
        list.add("Abuja");
        list.add("Lagos");
        list.add("Ogun");
        list.add("Bayelsa");
        list.add("Delta");
    }


    private void yearList(){
        year = new ArrayList<>();
        year.add("Marwa");
        year.add("Wuse");
        year.add("Ikeja");
        year.add("Ikoyi");
    }
}
