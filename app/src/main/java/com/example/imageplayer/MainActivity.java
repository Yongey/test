package com.example.imageplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public void onClick(View v) {
        Intent i ;
        if (v.getId()== R.id.btnImage) {
            i = new Intent(this, ImageActivity.class);
            startActivity(i);
        }
        if(v.getId()==R.id.btnPlayer) {
            i = new Intent(this, MediaPlayerActivity.class);
            startActivity(i);
        }
       if(v.getId()==R.id.btnPlayer) {
           i = new Intent(this, MediaPlayerActivity.class);
           startActivity(i);
       }

    }


}