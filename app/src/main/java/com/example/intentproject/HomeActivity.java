package com.example.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        show=findViewById(R.id.homeTextId);
        String anu="anu";
        Bundle bundle=getIntent().getExtras();
        String valu=bundle.getString("tag");
        if(anu.equals(valu)){
        String valu2="Welcome i love you  " +valu+" so much";
        show.setText(valu2);
    }
        else{
        show.setText(valu);
        }
    }
}