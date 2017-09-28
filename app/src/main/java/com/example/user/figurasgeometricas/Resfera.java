package com.example.user.figurasgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resfera extends AppCompatActivity {
    private TextView t;
    private Bundle b;
    private Resources res;
    private String aux;
    private double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resfera);
        res=this.getResources();
        b=getIntent().getExtras();
        t=(TextView)findViewById(R.id.txtResultadoEsfera);
        resultado=b.getDouble("Resultado");
        aux=res.getString(R.string.resultado)+"\n"+res.getString(R.string.volumen)+String.valueOf(resultado);
        t.setText(aux);
    }

    public void atrasEsfera(View view){
        this.onBackPressed();
    }


}
