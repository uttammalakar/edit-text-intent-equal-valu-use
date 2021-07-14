package com.example.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.EditText);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText()!=null){
                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                intent.putExtra("tag",editText.getText().toString());
                startActivity(intent);
            }
                else{
                    Intent intent=new Intent(MainActivity.this,MainActivity.class);
                    Toast.makeText(getApplicationContext(),"insert data",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });
    }
}