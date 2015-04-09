package com.tawsoft.androidannotationexample;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends ActionBarActivity
{

    @InjectView(R.id.myInput)EditText myInput;
    @InjectView(R.id.myButton)Button myButton;
    @InjectView(R.id.myTextView)TextView myTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }


}
