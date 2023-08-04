package com.example.intento4;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.intento4.db.DbHelper;

public class agenda_crud extends AppCompatActivity {


     private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_crud);

        btnCrear = (Button)findViewById(R.id.btnCrear2);
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbHelper dbHelper = new DbHelper(agenda_crud.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();//aqui indicamos que se va escribir en la db
                if( db != null ){
                    Toast.makeText(agenda_crud.this, "Base de datos  Crada ", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(agenda_crud.this, "Errror al crear la base de datos", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}