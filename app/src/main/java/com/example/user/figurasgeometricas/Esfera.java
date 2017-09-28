package com.example.user.figurasgeometricas;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Esfera extends AppCompatActivity {
    private EditText cajaEsfera;
    private Bundle b;
    private Intent i;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        cajaEsfera = (EditText)findViewById(R.id.cajaRadioEsfera);
        i=new Intent(this,Resfera.class);
        b=new Bundle();
        res=this.getResources();
    }
    public void esfera(View v){
      String operacion, dato;
        double resultado, conver ,pi;
        dato=cajaEsfera.getText().toString();
        operacion=res.getString(R.string.opesfera);
        conver= Double.parseDouble(dato);
        pi=3.1416;
        resultado=(4/3)*pi*(conver*conver*conver);
        b.putDouble("Resultado",resultado);
        i.putExtras(b);
        startActivity(i);
        Resultado r = new Resultado(operacion,dato,resultado);
        r.guardar();
    }
    public void borrarEsfera(View v){
        cajaEsfera.setText("");
        cajaEsfera.requestFocus(); }
}
