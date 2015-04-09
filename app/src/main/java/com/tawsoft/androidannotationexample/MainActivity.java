package com.tawsoft.androidannotationexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import org.androidannotations.annotations.EActivity;


@EActivity(R.layout.activity_main)
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);

    }


}
