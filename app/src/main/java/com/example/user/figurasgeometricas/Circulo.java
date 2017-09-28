package com.example.user.figurasgeometricas;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Circulo extends AppCompatActivity {
    private Bundle b;
    private EditText cajaRadio;
    private Resources res;
    private String operacion;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        String datos,oprecta;
        int resultado;
        cajaRadio=(EditText)findViewById(R.id.cajaRadio);
        res=this.getResources();
        operacion=this.getResources().getString(R.string.opcirculo);
        i=new Intent(this,Rcirculo.class);
        b= new Bundle();
    }
    public void circulo(View v){
        String opcuadrado,radio;
        double resultado, conver;
        double pi =Math.PI;
        radio=cajaRadio.getText().toString();
        conver=Integer.parseInt(radio);
        opcuadrado=operacion;
        resultado=  (pi*(conver*conver));
        b.putDouble("Resultado",resultado);
        i.putExtras(b);
        startActivity(i);
        Resultado r = new Resultado(opcuadrado,radio,resultado);
        r.guardar();
    }
    public void borrarCirculo(View v){
        cajaRadio.setText("");
        cajaRadio.requestFocus(); }
}
