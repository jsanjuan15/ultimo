package com.example.user.figurasgeometricas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Cilindro extends AppCompatActivity {
    private Bundle b;
    private EditText cajaradio,cajaaltura;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        cajaaltura = (EditText)findViewById(R.id.cajaAlturaCilindro);
        cajaradio = (EditText)findViewById(R.id.cajaRadioCilindro);
        i=new Intent(this,Rcilindro.class);
        b= new Bundle();
    }

    public void cilindro(View v){
        Log.i("cilindro:", "entre");
        String operacion,dato,radio,altura;
        double resultado,conver,conver2,pi;
        radio=cajaradio.getText().toString();
        altura=cajaaltura.getText().toString();
        operacion=this.getResources().getString(R.string.opcilindro);
        dato="altura= "+altura+"\n"+"radio= "+radio;
        pi=3.1416;
        conver=Double.parseDouble(radio);
        Log.i("Cilindro:","Radio="+conver);
        conver2=Double.parseDouble(altura);
        Log.i("Cilindro:","Altura="+conver2);
        resultado=(pi*(conver*conver))*conver2;
        Log.i("Cilindro:","Resultado="+resultado);
        b.putDouble("Resultado",resultado);
        i.putExtras(b);
        startActivity(i);
        Resultado r = new Resultado(operacion,dato,resultado);
        r.guardar();
    }
    public void borrarCilindro(View v){
        cajaradio.setText("");
        cajaradio.requestFocus();
        cajaaltura.setText("");

    }
}
