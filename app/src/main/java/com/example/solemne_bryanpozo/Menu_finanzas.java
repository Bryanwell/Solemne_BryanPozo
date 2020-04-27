package com.example.solemne_bryanpozo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu_finanzas extends AppCompatActivity {

    private EditText pbase;
    private EditText numero;
    private EditText cbicicletas;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_finanzas);

        pbase = (EditText) findViewById(R.id.precioBase);
        numero = (EditText)findViewById(R.id.base);
        cbicicletas = (EditText)findViewById(R.id.cantidadBicicletas);
        result = (TextView)findViewById(R.id.resultado);

    }

        public void CalculoFinanzas(View view){
            String aUno,bDos,cTres;
            int nUno,nDos,nTres;

            aUno=pbase.getText().toString();
            bDos=numero.getText().toString();
            cTres=cbicicletas.getText().toString();

            nUno=Integer.parseInt(aUno);
            nDos=Integer.parseInt(bDos);
            nTres=Integer.parseInt(cTres);

            int calcu=(nUno+nDos)*nTres;
            result.setText("Total del retraso es : $ "+calcu);
        }

}
