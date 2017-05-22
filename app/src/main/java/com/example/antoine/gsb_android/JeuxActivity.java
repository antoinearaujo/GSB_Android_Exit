package com.example.antoine.gsb_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Antoine Araujo on 22/05/2017.
 */

public class JeuxActivity extends AppCompatActivity implements View.OnClickListener {
    private Button jeupendu;
    private Button jeupcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeux);
        jeupcc = (Button) findViewById(R.id.jeupcc);
        jeupendu = (Button) findViewById(R.id.jeupendu);
        Game();

    }

    public void Game(){
        jeupendu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JeuxActivity.this, PenduActivity.class);
                startActivity(intent);

            }

        });
        jeupcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JeuxActivity.this, PccActivity.class);
                startActivity(intent);

            }

        });
    }
    @Override
    public void onClick(View view) {

    }
}
