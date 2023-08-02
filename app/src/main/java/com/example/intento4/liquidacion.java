package com.example.intento4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class liquidacion extends AppCompatActivity {

    private TextView nombres,cargos,valor_dia,sueldobase,diast,sueldoneto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquidacion);
        nombres = (TextView)findViewById(R.id.nombres);
        cargos = (TextView)findViewById(R.id.cargos);
        sueldobase = (TextView)findViewById(R.id.sueldobase);
        diast = (TextView) findViewById(R.id.diast);
        sueldoneto=(TextView) findViewById(R.id.sueldoneto);
        valor_dia = (TextView)findViewById(R.id.valor_dd);
        //insercion de datos

        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");
        String cargo = getIntent().getStringExtra("cargo");
        String sueldo = getIntent().getStringExtra("sueldo");
        String dia = getIntent().getStringExtra("dia");
        double sueldo_neto = getIntent().getDoubleExtra("neto", 0.0);
        double sueldo_bruto = getIntent().getDoubleExtra("salario_bruto", 0.0);

        sueldoneto.setText(String.valueOf(sueldo_neto));
        valor_dia.setText(String.valueOf(sueldo_bruto));
        nombres.setText( nombre + "  " + apellido);
        cargos.setText(cargo);
        sueldobase.setText(sueldo);
        diast.setText( dia);

    }


}