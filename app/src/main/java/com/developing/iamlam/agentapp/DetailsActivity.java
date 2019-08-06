package com.developing.iamlam.agentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle extras=getIntent().getExtras();
        String name=extras.getString("name");
        TextView userInfo=findViewById(R.id.user_info);

        userInfo.setText(name);
    }
}
