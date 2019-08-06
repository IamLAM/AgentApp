package com.developing.iamlam.agentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NAME = "name";
    public static final String LAST_NAME = "last_name";
    public static final String AGE = "age";
    public static final String STREET = "street";
    public static final String CITY = "city";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button regButton=findViewById(R.id.register_button);
        final EditText nameEdit=findViewById(R.id.name);
        final EditText lastNameEdit=findViewById(R.id.last_name);
        final EditText ageEdit=findViewById(R.id.age);
        final EditText cityEdit=findViewById(R.id.city);
        final EditText streetEdit=findViewById(R.id.street);






        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent detailIntent=new Intent(MainActivity.this,DetailsActivity.class);
            detailIntent.putExtra(NAME,nameEdit.getText().toString());
            detailIntent.putExtra(LAST_NAME,lastNameEdit.getText().toString());
            detailIntent.putExtra(AGE,ageEdit.getText().toString());
            detailIntent.putExtra(STREET,streetEdit.getText().toString());
            detailIntent.putExtra(CITY,cityEdit.getText().toString());
            startActivity(detailIntent);

            }
        });


    }
}
