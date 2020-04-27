package com.example.solemne_bryanpozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Menu_usuarios extends AppCompatActivity {


    private TextView texto1;
    private TextView texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuarios);

        texto1 = (TextView)findViewById(R.id.txtUser);
        texto2 = (TextView)findViewById(R.id.txtEdad);

        texto1 = (TextView) findViewById(R.id.txtUser);
        String titulomenu = getIntent().getStringExtra("titulo");
        texto1.setText(titulomenu);

    }

    public void Mostrardatos (View view)
    {
        texto1.setText("Alan");
        texto2.setText("35 años");
    }


}



