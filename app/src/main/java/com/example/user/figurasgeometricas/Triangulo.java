package com.example.user.figurasgeometricas;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Triangulo extends AppCompatActivity {
    private EditText cajaAltura;
    private EditText cajaBase;
    private Resources res;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        cajaAltura= (EditText)findViewById(R.id.cajaAlturaT);
        cajaBase=(EditText)findViewById(R.id.cajabaseT);
        res=this.getResources();
        i=new Intent(this,Rtriangulo.class);
        b=new Bundle();
    }
    public void triangulo(View v){
        String datos,altura,base,operacion;
        double resultado, conver,conver2;
        operacion=res.getString(R.string.optriangulo);
        altura=cajaAltura.getText().toString();
        base=cajaBase.getText().toString();
        datos= "altura= "+altura+"\n"+"base= "+base;
        conver=Integer.parseInt(altura);
        conver2=Integer.parseInt(base);
        resultado=(conver*conver2)/2;
        b.putDouble("Resultado",resultado);
        Resultado r = new Resultado(operacion,datos,resultado);
        r.guardar();
        i.putExtras(b);
        startActivity(i);
    }
    public void borrarTriangulo(View v){
        cajaAltura.setText("");
        cajaAltura.requestFocus();
        cajaBase.setText("");}
}
