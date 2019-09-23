package com.example.bin2dec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText binary;
    TextView resultTv;
    Button convertBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binary = findViewById(R.id.binary);
        resultTv =findViewById(R.id.resultTv);
        convertBtn =findViewById(R.id.convertBtn);


        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String dec =binary.getText().toString();

                if(dec.length() >8){
                    Toast.makeText(MainActivity.this, "Maximum 8 digits.", Toast.LENGTH_SHORT).show();
                }else if (dec.matches(".*[2-9].*")){
                    Toast.makeText(MainActivity.this, "Please enter only 1s and 0s.", Toast.LENGTH_SHORT).show();
                }else {
                    int bin = Integer.parseInt(dec, 2);
                    String a = String.valueOf(bin);
                    resultTv.setText(a);
                }
            }
        });


    }
}
