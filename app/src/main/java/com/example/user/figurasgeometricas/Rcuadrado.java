package com.example.user.figurasgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Rcuadrado extends AppCompatActivity {
    private TextView respuesta;
    private Bundle b;
    private String aux;
    private double resultado;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcuadrado);
        b= getIntent().getExtras();
        respuesta=(TextView)findViewById(R.id.txtRcuadrado);
        res=this.getResources();
        resultado=b.getDouble("Resultado");

        aux=res.getString(R.string.resultado)+"\n"+res.getString(R.string.area)+" "+String.valueOf(resultado);
        respuesta.setText(aux);}

    public void atrasCuadrado(View v){
        this.onBackPressed();
    }
}
