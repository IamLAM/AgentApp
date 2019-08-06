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
        String name=extras.getString(MainActivity.NAME);
        String last_name=extras.getString(MainActivity.LAST_NAME);
        String age=extras.getString(MainActivity.AGE);
        String street=extras.getString(MainActivity.STREET);
        String city=extras.getString(MainActivity.CITY);
        TextView userInfo=findViewById(R.id.user_info);

        userInfo.setText(name+last_name+age+street+city);
    }
}
