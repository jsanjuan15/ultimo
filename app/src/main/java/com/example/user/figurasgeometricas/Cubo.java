package com.example.user.figurasgeometricas;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cubo extends AppCompatActivity {
    private EditText cajacubo;
    private Resources res;
    private Intent i;
    private Bundle b;
    private String operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        res=this.getResources();
        operacion=res.getString(R.string.opcubo);
        cajacubo=(EditText)findViewById(R.id.cajaCubo);
        i=new Intent(this,Rcubo.class);
        b=new Bundle();
    }
    public void cubo(View v){
        String datos, opcubo;
        double resultado ,conver;
        datos=cajacubo.getText().toString();
        opcubo=operacion;
        conver=Integer.parseInt(datos);
        resultado = conver*conver*conver;
        b.putDouble("Resultado",resultado);
        i.putExtras(b);
        startActivity(i);
        Resultado r = new Resultado(opcubo,datos,resultado);
        r.guardar();
    }
    public void borrarCubo(View v){
        cajacubo.setText("");
        cajacubo.requestFocus(); }
}
