package com.example.intento4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class liquidacion extends AppCompatActivity {

    private TextView nombres,cargos,valor_dia,sueldobase,diast,sueldoneto,slde,dese,pene,descuob;

    @SuppressLint("MissingInflatedId")
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
        slde =(TextView)findViewById(R.id.salude);
        dese=(TextView)findViewById(R.id.descuentoe);
        pene=(TextView)findViewById(R.id.pencione);
        descuob=(TextView)findViewById(R.id.descuo);



        //insercion de datos

        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");
        String cargo = getIntent().getStringExtra("cargo");
        String sueldo = getIntent().getStringExtra("sueldo");
        String dia = getIntent().getStringExtra("dia");
        double sueldo_neto = getIntent().getDoubleExtra("neto", 0.0);
        double sueldo_bruto = getIntent().getDoubleExtra("salario_bruto", 0.0);
        double rpencion = getIntent().getDoubleExtra("pencione",0);
        double rsalud = getIntent().getDoubleExtra("salude", 0);
        double rdescuento= getIntent().getDoubleExtra("descuentoe", 0);
        double descuentoobtenido= getIntent().getDoubleExtra("descuentoo", 0);
        descuob.setText("Lo que indica un descuento total de ("+descuentoobtenido+")");
        slde.setText("Salud 4% = "+ String.valueOf(rsalud));
        dese.setText("Descuento 3% = "+ String.valueOf(rdescuento));
        pene.setText("Pension 4% = "+String.valueOf(rpencion));
        sueldoneto.setText("Liquidacion: "+String.valueOf(sueldo_neto));
        valor_dia.setText("Valor por dia: "+String.valueOf(sueldo_bruto));
        nombres.setText("Empleado: "+nombre + "  " + apellido);
        cargos.setText("Cargo: "+cargo);
        sueldobase.setText("Suledo: "+sueldo);
        diast.setText("Dias laborados: "+ dia);

    }

    public void regresar(View view){
        finish();
    }


}