package com.example.nikhin.carapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;

import com.example.nikhin.carapp.adapter.MakeAdapter;

public class MakeActivity extends AppCompatActivity {

    ListView make_lview;
    Button btn_make;
    MakeAdapter makeAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_make);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

}

