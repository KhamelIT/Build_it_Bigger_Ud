package com.udacity.gradle.builditbigger.jokesdisplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView joke = (TextView)findViewById(R.id.joke);
        joke.setText(getIntent().getStringExtra("joke"));
    }
}
