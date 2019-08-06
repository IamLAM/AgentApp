package com.developing.iamlam.agentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button regButton=findViewById(R.id.register_button);
        EditText nameEdit=findViewById(R.id.name);
        EditText lastNameEdit=findViewById(R.id.last_name);
        EditText ageEdit=findViewById(R.id.age);
        EditText cityEdit=findViewById(R.id.city);
        EditText streetEdit=findViewById(R.id.street);






        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent detailIntent=new Intent(MainActivity.this,DetailsActivity.class);
            startActivity(detailIntent);

            }
        });


    }
}
