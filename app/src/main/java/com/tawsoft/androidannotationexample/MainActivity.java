package com.tawsoft.androidannotationexample;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends ActionBarActivity
{
    @InjectView(R.id.myInput)EditText myInput;
    @InjectView(R.id.myButton)Button myButton;
    @InjectView(R.id.myTextView)TextView myTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //With this ButterKnife apply changes to the current Activity
        ButterKnife.inject(this);


    }

    //Click event for myButton
    @OnClick(R.id.myButton)
    public void buttonClick()
    {
        String s=myInput.getText().toString();
        myTextView.setText(s);
    }


}
