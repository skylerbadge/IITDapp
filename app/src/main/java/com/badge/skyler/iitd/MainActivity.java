package com.badge.skyler.iitd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView ecard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ecard=(CardView) findViewById(R.id.eve);
        ecard.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent i=new Intent(this,Events.class);
        startActivity(i);
    }
}
