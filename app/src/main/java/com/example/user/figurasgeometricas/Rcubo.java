package com.example.user.figurasgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Rcubo extends AppCompatActivity {
    private TextView t;
    private Bundle b;
    private String aux;
    private double resultado;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcubo);
        b= getIntent().getExtras();
        t=(TextView)findViewById(R.id.txtRcubo);
        res=this.getResources();
        resultado=b.getDouble("Resultado");

        aux=res.getString(R.string.resultado)+"\n"+res.getString(R.string.area)+" "+String.valueOf(resultado);
        t.setText(aux);
    }
    public void atrasCubo(View v){
        this.onBackPressed();
    }
}
