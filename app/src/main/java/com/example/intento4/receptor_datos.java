package com.example.intento4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.MacAddress;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class receptor_datos extends AppCompatActivity {

      private  EditText nombre, apellido,dia,sueldo,cargo;
      private CheckBox check1, check2,check3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor_datos);

        nombre=(EditText)findViewById(R.id.nombre);
        apellido=(EditText)findViewById(R.id.apellido);
        cargo=(EditText)findViewById(R.id.cargo);
        sueldo=(EditText)findViewById(R.id.sueldo);
        dia=(EditText)findViewById(R.id.dia);
        check1=(CheckBox) findViewById(R.id.check1);
        check2=(CheckBox) findViewById(R.id.check2);
        check3=(CheckBox) findViewById(R.id.check3);

    }


   public void liquidacion (View view){

        String sueldo_string = sueldo.getText().toString();
       String  dia_string= dia.getText().toString();

       int dia_int =  Integer.parseInt(dia_string);
       int sueldo_int = Integer.parseInt(sueldo_string);
       int valor_dia = sueldo_int / dia_int;
       int sueldoneto = 0;
       if (check1.isChecked() &&  check2.isChecked() && check3.isChecked() ){
          int porcetotal = sueldo_int * ( 11 / 100);
           sueldoneto = sueldo_int - porcetotal;
       }

       Intent i = new Intent(this, liquidacion.class);
        i.putExtra("nombre",nombre.getText().toString());
        i.putExtra("apellido",apellido.getText().toString());
        i.putExtra("cargo",cargo.getText().toString());
        i.putExtra("sueldo",sueldo.getText().toString());
       i.putExtra("dia",dia.getText().toString());
       i.putExtra("valor_dia",valor_dia);
       i.putExtra("sueldo_neto",sueldoneto);
       startActivity(i);
    }


}