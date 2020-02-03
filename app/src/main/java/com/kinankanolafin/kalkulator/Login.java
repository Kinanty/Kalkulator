package com.kinankanolafin.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class Login extends AppCompatActivity {
    EditText txtemail;
    EditText txtpassword;
    TextView tvlupakatasandi;
    Button btnmasuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        txtemail=findViewById(R.id.txtemail);
        txtpassword=findViewById(R.id.txtpassword);
        btnmasuk=findViewById(R.id.btnmasuk);
        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtemail.getText().toString().equalsIgnoreCase("@kinant215")||
                txtpassword.getText().toString().equalsIgnoreCase("choco")){
                    Intent intent= new Intent(Login.this, MainActivity.class);
                    intent.putExtra("Email", txtemail.getText().toString());
                    startActivity(intent);
                }


            }
        });
    }
}
