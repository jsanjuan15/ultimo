package com.example.user.figurasgeometricas;

/**
 * Created by User on 21/04/2017.
 */

public class Resultado {
    private String operacion,datos;
    private double resultado;
    public Resultado(String operacion, String datos, double resultado) {
        this.operacion = operacion;
        this.datos = datos;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public void guardar(){Datos.guardar(this);}
}
