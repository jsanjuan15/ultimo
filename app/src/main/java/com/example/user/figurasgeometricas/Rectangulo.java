package com.example.user.figurasgeometricas;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Rectangulo extends AppCompatActivity {
    private EditText cajaAltura,cajaBase;
    private Resources res;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        cajaAltura= (EditText)findViewById(R.id.cajaAlturaR);
        cajaBase = (EditText)findViewById(R.id.cajaBaseR);
        i=new Intent(this,ResultadoRectangulo.class);
        b=new Bundle();
    }
    public void calcularRectangulo(View v){
        String altura,base,oprec,datos;
        double resultado;
        altura=cajaAltura.getText().toString();
        base=cajaBase.getText().toString();
        res=this.getResources();
        oprec=res.getString(R.string.oprectangulo);
        datos="altura= "+altura+"\n"+"base= "+base;
        resultado=Integer.parseInt(altura)*Integer.parseInt(base);
        b.putDouble("Resultado",resultado);
        i.putExtras(b);
        startActivity(i);
        Resultado r = new Resultado(oprec,datos,resultado);
        r.guardar();
    }
    public void borrarRectangulo(View v){
        cajaAltura.setText("");
        cajaAltura.requestFocus();
        cajaBase.setText("");
    }
}
