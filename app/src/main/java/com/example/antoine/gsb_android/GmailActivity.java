package com.example.antoine.gsb_android;
import android.app.Activity;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by AntoineAraujo on 18/05/2017.
 */

public class GmailActivity extends Activity {


    ListView listView;
    TextView textView4;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gmail);

        listView = (ListView) findViewById(R.id.listView1);

        String[] email = { "antoinearau@gmail.com",
                "julienhivert.tt@gmail.com",
                "petervalery211@gmail.com",
                "dimitriguira@gmail.com",
                "benjamin.96.prost@gmail.com",
                "jose.santiago42400@gmail.com",
                "jordanjayol42@gmail.com",
                "kelignoel42@gmail.com",
                "jimmyseux@gmail.com"};

        // Définition de l'adapter
        // Premier Paramètre - Context
        // Second Paramètre - le Layout pour les Items de la Liste
        // Troisième Paramètre - l'ID du TextView du Layout des Items
        // Quatrième Paramètre - le Tableau de Données

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, email);

        // on assigne l'adapter à notre list
        listView.setAdapter(adapter);

        // la gestion des clics sur les items de la liste
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // l'index de l'item dans notre ListView
                int itemPosition = position;

                // On récupère le texte de l'item cliqué
                String itemValue = (String) listView
                        .getItemAtPosition(position);

                // On affiche ce texte avec un Toast
                Toast.makeText(
                        getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : "
                                + itemValue, Toast.LENGTH_LONG).show();

            }

        });

    }

}
