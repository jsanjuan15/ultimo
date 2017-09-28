package com.example.user.figurasgeometricas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Cono extends AppCompatActivity {
    private Bundle b;
    private EditText cajaradio,cajaaltura;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
        cajaaltura = (EditText)findViewById(R.id.cajaAlturaCono);
        cajaradio = (EditText)findViewById(R.id.cajaRadioCono);
        i=new Intent(this,Rcono.class);
        b= new Bundle();
    }
    public void cono(View v){
        String operacion,dato,radio,altura;
        double resultado,conver,conver2,pi;
        radio=cajaradio.getText().toString();
        altura=cajaaltura.getText().toString();
        operacion=this.getResources().getString(R.string.opcono);
        dato="altura= "+altura+"\n"+"radio= "+radio;
        pi=3.1416;
        conver=Double.parseDouble(radio);
        conver2=Double.parseDouble(altura);
        resultado=((pi*(conver*conver))*conver2)/3;
        b.putDouble("Resultado",resultado);
        i.putExtras(b);
        startActivity(i);
        Resultado r = new Resultado(operacion,dato,resultado);
        r.guardar();
    }
    public void borrarCono(View v){
        cajaaltura.setText("");
        cajaradio.setText("");
        cajaradio.requestFocus(); }
}
