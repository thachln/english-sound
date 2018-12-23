package com.example.admin.englishthinh;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.constraint.solver.SolverVariable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

    public class  MainSignin extends AppCompatActivity {

        Button btnSignIn;
        Button btnSignUp;
        Button btnInter;
        TextView txtSlogan;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_sign_in);

            btnSignIn = (Button)findViewById(R.id.btnSignIn);
            btnSignUp = (Button)findViewById(R.id.btnSignUp);
            btnInter = (Button)findViewById(R.id.btnInter);
            txtSlogan = (TextView)findViewById(R.id.txtSlogan);

            Typeface face = Typeface.createFromAsset(getAssets(),"fonts/Nabila.ttf");
            txtSlogan.setTypeface(face);


            btnSignIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent signIn = new Intent( MainSignin.this,SignIn.class);
                    startActivity(signIn);
                }
            });

            btnSignUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent signUp = new Intent( MainSignin.this,SignUp.class);
                    startActivity(signUp);
                }
            });

            btnInter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent signInter = new Intent( MainSignin.this,EnlishThinh.class);
                    startActivity(signInter);
                }
            });

        }
    }



