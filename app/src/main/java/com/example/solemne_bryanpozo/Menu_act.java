package com.example.solemne_bryanpozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu_act extends AppCompatActivity {

    private TextView text;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);

        text = (TextView) findViewById(R.id.textmontbike);
        String titulomenu = getIntent().getStringExtra("titulo");
        text.setText(titulomenu);

        text2 = (TextView) findViewById(R.id.downtext);
        String titulomenu2 = getIntent().getStringExtra("tituloabajo");
        text2.setText(titulomenu2);
    }

        public void MenuBicicletas (View view)

         {
            Intent b = new Intent(this, Menu_bicicletas.class);
            startActivity(b);

         }

        public void MenuUsuarios (View view)

         {
            Intent u = new Intent(this, Menu_usuarios.class);
            startActivity(u);

         }

         public void MenuFinanzas (View view)

         {
        Intent f = new Intent(this, Menu_finanzas.class);
        startActivity(f);

         }

            public void CerrarApp (View view)
{
    finish();
}
}