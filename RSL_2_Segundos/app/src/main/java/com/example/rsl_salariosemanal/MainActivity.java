package com.example.rsl_salariosemanal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView minutos,horas,dias;
    EditText segundos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        segundos = (EditText) findViewById(R.id.segundos);
        minutos = (TextView) findViewById(R.id.minutos);
        horas = (TextView) findViewById(R.id.horas);
        dias = (TextView) findViewById(R.id.dias);


    }
    public void calcular (View view){
        String n1 = segundos.getText().toString();
        if (!n1.isEmpty()) {
            double dSegundos = Float.parseFloat(n1);
            double dMinutos = dSegundos/ 60;
            double dHoras = dMinutos / 60;
            double dDias = dHoras / 24;
            String sMinutos = String.valueOf(dMinutos);
            String sHoras = String.valueOf(dHoras);
            String sDias = String.valueOf(dDias);
            minutos.setText(sMinutos);
            horas.setText(sHoras);
            dias.setText(sDias);
        }
    }
}