package com.example.mijardin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Card extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        ImageView image;
        TextView title, text;
        image = findViewById(R.id.planta);
        title = findViewById(R.id.titulo);
        text = findViewById(R.id.texto);


        //Coger los valores de subidon y cordura del anterior activity
        Bundle extras = getIntent().getExtras();
        int auxI = extras.getInt("imagen");
        image.setImageResource(auxI);
        title.setText(extras.getString("titulo"));
        text.setText(extras.getString("texto"));




    }
}