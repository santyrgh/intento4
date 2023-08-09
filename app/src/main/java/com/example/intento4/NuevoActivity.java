package com.example.intento4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.intento4.db.DbContactos;

public class NuevoActivity extends AppCompatActivity {

    EditText txtNombre, txtTelefono, txtCorreoE;
    Button  btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);
        txtNombre = (EditText)findViewById(R.id.ingresa_nombre);
        txtTelefono= (EditText)findViewById(R.id.ingresa_telefono);
        txtCorreoE =(EditText)findViewById(R.id.ingresa_correo);
        btnGuardar = (Button)findViewById(R.id.btn_registrar);

         btnGuardar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 DbContactos dbContactos = new DbContactos(NuevoActivity.this);
                 long id =  dbContactos.insertarContacto(txtNombre.getText().toString(),txtTelefono.getText().toString(),txtCorreoE.getText().toString());
                 if(id > 0 ){
                     Toast.makeText(NuevoActivity.this, "REGISTRO AGREGADO", Toast.LENGTH_SHORT).show();
                 }else{
                     Toast.makeText(NuevoActivity.this, "ERROR AL GUARDAR REGISTRO", Toast.LENGTH_SHORT).show();

                 }
             }
         });
    }
    private void  limpiar(){
        txtNombre.setText("");
        txtCorreoE.setText("");
        txtTelefono.setText("");
    }


}