package com.example.avancosys.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText username,password;
    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username= (EditText) findViewById(R.id.input_layout_usrmail);
        password= (EditText) findViewById(R.id.input_layout_password);
        login= (Button) findViewById(R.id.btnLogin);
        signup= (Button) findViewById(R.id.signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext(),SignupPage.class);
                startActivity(in);
            }
        });

    }
}
