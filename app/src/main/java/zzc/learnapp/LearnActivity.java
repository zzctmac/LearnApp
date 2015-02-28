package zzc.learnapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class LearnActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_learn);
    }



}
