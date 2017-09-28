package com.example.user.figurasgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Rtriangulo extends AppCompatActivity {
    private Bundle b;
    private double resul;
    private Resources res;
    private TextView t;
    private String aux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtriangulo);
        t=(TextView)findViewById(R.id.txtResultadoTriangulo);
        b=getIntent().getExtras();
        resul=b.getDouble("Resultado");
        aux=this.getResources().getString(R.string.resultado)+"\n"+this.getResources().getString(R.string.area)+String.valueOf(resul);
        t.setText(aux);
    }
    public void atrasTriangulo(View v){
        this.onBackPressed();
    }
}
