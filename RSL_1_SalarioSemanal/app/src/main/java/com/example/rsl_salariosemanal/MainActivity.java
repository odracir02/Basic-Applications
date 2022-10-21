package com.example.rsl_salariosemanal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView total;
    EditText horas, precio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horas=(EditText)findViewById(R.id.horas);
        precio=(EditText)findViewById(R.id.precio);
        total=(TextView) findViewById(R.id.total);


    }

    public void calcular(View view) {
        String n1 = horas.getText().toString();
        String n2 = precio.getText().toString();
        double num1=Float.parseFloat(n1);
        double num2=Float.parseFloat(n2);
        double sum= num1*num2;
        double hExtra= ((num1-40)*(num2*1.5))+sum;
        String res=String.valueOf(sum);
        String res2=String.valueOf(hExtra);
        if (num1<=40 && num1>0 ){
            total.setText(res);
        }else if (num1>40){
            total.setText(res2);
        }else{
            total.setText("nao nao nao voce nao paga negativo");
        }




    }
}