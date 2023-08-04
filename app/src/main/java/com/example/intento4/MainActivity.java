package com.example.intento4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.intento4.db.DbHelper;

public class MainActivity extends AppCompatActivity {

    Button btnCrear2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCrear2 = (Button)findViewById(R.id.btnCrear2);
        btnCrear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DbHelper dbHelper = new DbHelper(MainActivity.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();//aqui indicamos que se va escribir en la db

                if( db != null ){
                    Toast.makeText(MainActivity.this, "Base de datos  Crada ", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Base de datos  Crada ", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Errror al crear la base de datos", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Base de datos  Crada ", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
    public void Enviar(View view){
        Intent i = new Intent(this, receptor_datos.class);
        startActivity(i);
    }

    public void agenda(View v){
        Intent e = new Intent(this, agenda_crud.class);
        startActivity(e);
    }


}