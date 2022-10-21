package com.pmdm.u2aev1ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int EQUIVALENTE_PRIMER_ANYO = 15;
    private static final int EQUIVALENTE_SEGUNDO_ANYO = 10;
    private static final int EQUIVALENTE_ANYO_ADICIONAL = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculación de las vistas de la UI con nuestro código
        EditText etEdadGatuna = (EditText)findViewById(R.id.etEdadGatuna);
        TextView tvEdadHumana = (TextView)findViewById(R.id.tvEdadHumana);
        Button btnCalcularEdadHumana = (Button)findViewById(R.id.btnCalcularEdadHumana);

        // Escucha con evento de clic para el botón de Calcular
        btnCalcularEdadHumana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int edadGatuna, edadHumana;
                String strEdadGatuna = String.valueOf(etEdadGatuna.getText());

                // Evitamos que la app pete cuando el usuario no introduce nada y pulsa en Calcular
                if (!TextUtils.isEmpty(strEdadGatuna))
                    edadGatuna = Integer.parseInt(strEdadGatuna);
                else
                    edadGatuna = 0;

                //Calculamos la edad equivalente en humanos
                if (edadGatuna <= 0)
                    edadHumana = 0;
                else if (edadGatuna == 1)
                    edadHumana = EQUIVALENTE_PRIMER_ANYO;
                else if (edadGatuna == 2)
                    edadHumana = EQUIVALENTE_PRIMER_ANYO + EQUIVALENTE_SEGUNDO_ANYO;
                else
                    edadHumana = EQUIVALENTE_PRIMER_ANYO + EQUIVALENTE_SEGUNDO_ANYO + (edadGatuna - 2) * EQUIVALENTE_ANYO_ADICIONAL;

                tvEdadHumana.setText("El gato tiene el equivalente a " + edadHumana + " años humanos.");
            }
        });

    }
}