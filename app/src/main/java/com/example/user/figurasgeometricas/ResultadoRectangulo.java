package com.example.user.figurasgeometricas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoRectangulo extends AppCompatActivity {
    private TextView t;
    private Bundle b;
    private double resultado;
    private Resources recur;
    private String aux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_rectangulo);
        t=(TextView)findViewById(R.id.txtresultadoRectangulo);
        b=getIntent().getExtras();
        recur=this.getResources();
        resultado=b.getDouble("Resultado");

        aux= recur.getString(R.string.resultado)+"\n"+recur.getString(R.string.area)+String.valueOf(resultado);
        t.setText(aux);
    }
    public void atrasRecta(View v){
        this.onBackPressed();
    }
}
