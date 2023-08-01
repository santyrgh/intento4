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
        Integer sueldo_dia = getIntent().getIntExtra("valor_dia", 0);

        nombres.setText("nombres: "+ nombre + apellido);
        cargos.setText("cargo: "+cargo);
        sueldobase.setText("Sueldo base: "+sueldo);
        diast.setText("Dias trabajados: "+ dia);
        valor_dia.setText("valor por dia de trabajo "+ sueldo_dia);
    }


}