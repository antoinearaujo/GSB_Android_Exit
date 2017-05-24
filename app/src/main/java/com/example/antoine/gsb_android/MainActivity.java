package com.example.antoine.gsb_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //ajoute les entrées de menu_test à l'ActionBar
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }
    //gère le click sur une action de l'ActionBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.github: //si le user click sur Github
                Intent intent = new Intent(MainActivity.this, GithubListActivity.class);
                startActivity(intent);
                return true;
            case R.id.jeux: //si le user clique sur Jeux
                Intent intent4 = new Intent(MainActivity.this, JeuxActivity.class);
                startActivity(intent4);
                return true;
            case R.id.calculatrice: //si le user click sur la calculatrice
                Intent intent2 = new Intent(MainActivity.this, CalculatriceActivity.class);
                startActivity(intent2);
                return true;
            case R.id.gmail: //si le user click sur gmail
                Intent intent3 = new Intent(MainActivity.this, GmailActivity.class);
                startActivity(intent3);
                return true;
            case R.id.creators: //si le user click sur créateurs
                Intent intent5 = new Intent(MainActivity.this, CreatorListActivity.class);
                startActivity(intent5);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}