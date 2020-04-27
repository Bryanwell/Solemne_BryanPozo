package com.example.solemne_bryanpozo;

import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.FingerprintGestureController;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText edit1, edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.et1);
        edit2 = (EditText) findViewById(R.id.et2);

    }


        public void IniciarSesion (View view)
        {

            if (edit1.getText().toString().equals("Alan")&& //no quise colocar equalsIgnoreCase ya que pidio la condicion Alan
                    edit2.getText().toString().equals("123"))
            {
            Intent i = new Intent(this, Menu_act.class);
            i.putExtra("titulo", "MONTBIKE");
            i.putExtra("tituloabajo","Montbike todo los derechos reservados");
            startActivity(i);
            }
            else {
                      edit1.setText("datos erroneos");
                      //edit1.setError("datis erroneos"); // lo vi en google pero no lo
                     //                                      quise incluir por que no lo han pasado en clases
            }
        }


        public void CerrarApp (View view)
         {
               finish();
         }
}