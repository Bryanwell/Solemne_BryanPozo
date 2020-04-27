package com.example.solemne_bryanpozo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu_bicicletas extends AppCompatActivity {


    private EditText marcaBici; //declaro la variable en donde almacenare la id
    private EditText aroBici;
    private TextView resutadoCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bicicletas);

        marcaBici = (EditText) findViewById(R.id.MarBici);    //llamado de la id
        aroBici = (EditText) findViewById(R.id.ArBici);
        resutadoCalculo = (TextView) findViewById(R.id.resultBici);
    }

    int info1;
    int info2;


    public void calculoBicicletas(View view) {
        if(marcaBici.getText().toString().equalsIgnoreCase("Bianchi")) {
            info1 = 40000;
            if (aroBici.getText().toString().equalsIgnoreCase("16")) {
                info2 = 2;
                int compra = info1 * info2;
                resutadoCalculo.setText("El costo es de :" + compra);
            } else if (aroBici.getText().toString().equalsIgnoreCase("20")) {
                info2 = 4;
                int compra = info1 * info2;
                resutadoCalculo.setText("El costo es de :" + compra);
            } else {
                //resutadoCalculo.setHint("Ingrese valores correcto");
                marcaBici.setText("Revise los datos ingresados");
                aroBici.setText("Revise los datos ingresados");
            }
        }
        else if (marcaBici.getText().toString().equalsIgnoreCase("Monark")) {
            info1 = 25000;
            if (aroBici.getText().toString().equalsIgnoreCase("16")) {
                info2 = 2;
                int compra = info1 * info2;
                resutadoCalculo.setText("El costo es de :" + compra);
            } else if (aroBici.getText().toString().equalsIgnoreCase("20")) {
                info2 = 4;
                int compra = info1 * info2;
                resutadoCalculo.setText("El costo es de :" + compra);
            } else {
               //resutadoCalculo.setHint("Ingrese valores correcto");
                marcaBici.setText("Revise los datos ingresados");
                aroBici.setText("Revise los datos ingresados");
            }
        }
        else{
            resutadoCalculo.setText("Ingrese valores correcto");
        }
    }

}