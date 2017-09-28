package com.example.user.figurasgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Rcirculo extends AppCompatActivity {
    private Bundle b;
    private TextView t;
    private String aux;
    private double resultado;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcirculo);
        b=getIntent().getExtras();
        res=this.getResources();
        t=(TextView)findViewById(R.id.txtCirculresul);
        resultado=b.getDouble("Resultado");
        aux= res.getString(R.string.resultado)+"\n"+res.getString(R.string.area)+String.valueOf(resultado);
        t.setText(aux);
    }
    public void atrasCirculo(View v){
        this.onBackPressed();
    }
}
