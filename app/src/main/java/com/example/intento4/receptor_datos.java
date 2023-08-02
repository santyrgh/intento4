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
       // valor por dia
       double sueldo_inicial = Double.parseDouble(sueldo.getText().toString());
       double dias = Double.parseDouble(dia.getText().toString());

       Boolean descuento = check1.isChecked();
       Boolean salud = check2.isChecked();
       Boolean pension = check3.isChecked();


       double porcentaje_descuento = 0;
       if(descuento){
           porcentaje_descuento += 3;
       }
       if(salud){
           porcentaje_descuento += 4;
       }
       if(pension){
           porcentaje_descuento += 4;
       }
       double descuento_obtenido = sueldo_inicial * (porcentaje_descuento / 100);
       double v_dia = sueldo_inicial / 30;
       double salario_bruto =  v_dia * dias;
       double sueldo_neto = salario_bruto - descuento_obtenido;

       Intent i = new Intent(this, liquidacion.class);
        i.putExtra("nombre",nombre.getText().toString());
        i.putExtra("apellido",apellido.getText().toString());
        i.putExtra("cargo",cargo.getText().toString());
        i.putExtra("sueldo",sueldo.getText().toString());
       i.putExtra("dia",dia.getText().toString());
       i.putExtra("salario_bruto",v_dia);
       i.putExtra("neto", sueldo_neto);

       startActivity(i);
    }


}