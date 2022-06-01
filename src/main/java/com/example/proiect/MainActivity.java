package com.example.proiect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder conectSucces = new AlertDialog.Builder(this);
        conectSucces.setTitle("Buna Ziua!");
        conectSucces.setCancelable(true);

        conectSucces.setMessage("V-ati conectat cu succes!").setCancelable(false);
        AlertDialog succes=conectSucces.create();
        Button connect=(Button) findViewById(R.id.conect);
        EditText cod=(EditText) findViewById(R.id.textCod);


        connect.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                String code=cod.getText().toString();
                if(code.equals("test")== true)
                {

                    callMeniuActivity();

                    //connect.setVisibility(view.INVISIBLE);

                    //
                    //replaceFragment(new Menu());


                }
            }
        });
    }

    //private void replaceFragment(Menu menu) {
       // FragmentManager fragmentManager=getSupportFragmentManager();
       // FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
       // fragmentTransaction.replace(R.id.menu,menu);
      //  fragmentTransaction.commit();

  //  }

    public void callMeniuActivity(){
        Intent intent=new Intent(this,Meniu.class);
        startActivity(intent);

    }
}