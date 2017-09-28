package com.example.user.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Rcilindro extends AppCompatActivity {
    private Bundle b;
    private TextView t;
    private String aux;
    private double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcilindro);
        b=getIntent().getExtras();
        t=(TextView)findViewById(R.id.txtResultadoCilindro);
        resultado = b.getDouble("Resultado");

        aux=this.getResources().getString(R.string.resultado)+"\n"+this.getResources().getString(R.string.volumen)+Double.valueOf(resultado);
        t.setText(aux);
    }


    public void atras(View view){
        this.onBackPressed();
    }
}
