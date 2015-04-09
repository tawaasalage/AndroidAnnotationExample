package com.tawsoft.androidannotationexample;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends ActionBarActivity
{
    @InjectView(R.id.myInput)EditText myInput;
    @InjectView(R.id.myButton)Button myButton;
    @InjectView(R.id.myButton2)Button myButton2;
    @InjectView(R.id.myTextView)TextView myTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //With this ButterKnife apply changes to the current Activity
        ButterKnife.inject(this);

    }

    //Click event for two buttons
    @OnClick({R.id.myButton,R.id.myButton2})
    public void buttonClick(View view)
    {
        switch (view.getId()){
            case R.id.myButton:

                String s=myInput.getText().toString();
                myTextView.setText(s);

                break;
            case R.id.myButton2:

                myTextView.setText("Button 2");

                break;
        }

    }


}
