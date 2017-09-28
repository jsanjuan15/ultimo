package com.example.user.figurasgeometricas;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Cuadrado extends AppCompatActivity {
    private EditText cajadatos;
    private Resources res;
    private Intent i;
    private Bundle b;
    private String operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        res=this.getResources();
        operacion=res.getString(R.string.opcuadrado);
        cajadatos=(EditText)findViewById(R.id.cajaDato);
        i=new Intent(this,Rcuadrado.class);
        b=new Bundle();
    }

    public void calcular(View v){
        String datos, opcuadrado;
        double resultado ,conver;
        datos=cajadatos.getText().toString();
        opcuadrado=operacion;
        conver=Integer.parseInt(datos);
        resultado = conver * conver;
        b.putString("Datos",datos);
        b.putDouble("Operacion",conver);
        b.putDouble("Resultado",resultado);
        i.putExtras(b);
        startActivity(i);
        Resultado r = new Resultado(opcuadrado,datos,resultado);
        r.guardar();
    }

    public void borrar(View v){
        cajadatos.setText("");
        cajadatos.requestFocus(); }
}
