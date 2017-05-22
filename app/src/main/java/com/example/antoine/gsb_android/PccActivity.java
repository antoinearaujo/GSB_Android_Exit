package com.example.antoine.gsb_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

/**
 * Created by Antoine Araujo on 18/05/2017.
 */

public class PccActivity extends AppCompatActivity implements View.OnClickListener {
    private String TabClass[] = {"Ciseaux", "Papier" , "Caillou"};
    private Button feu;
    private Button vent;
    private Button eau;
    private TextView userClass;
    private TextView adversaryClass;
    private TextView resultat;
    private TextView argent;
    private TextView scoreUser;
    private TextView scoreAdversary;
    private int userScore;
    private int adversaryScore;
    private String classUser;
    private String classAdversary;
    private int tour =1;
    String combatRandom[];
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combat); // on affiche le bon layout

        feu = (Button) findViewById(R.id.feu);
        vent = (Button) findViewById(R.id.vent);
        eau = (Button) findViewById(R.id.eau);
        userClass = (TextView) findViewById(R.id.userClass);
        adversaryClass = (TextView) findViewById(R.id.adversaryClass);
        argent = (TextView) findViewById(R.id.argent);
        resultat = (TextView) findViewById(R.id.resultat);
        scoreUser = (TextView) findViewById(R.id.scoreUser);
        scoreAdversary = (TextView) findViewById(R.id.scoreAdversary);
        img = (ImageView) findViewById(R.id.tourImg);





        Game();
    }

    public void Game() {

        setImageTour(getTour());
        final Personnage personnage = new Personnage();
        adversaryScore = 0 ;
        scoreAdversary.setText("");
        userScore = 0;
        scoreUser.setText("");
        feu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getTour()>=10){ //si on arrive au 5eme tour :
                    Intent intent = new Intent(PccActivity.this, MainActivity.class);
                    Toast.makeText(getApplicationContext(), "Partie terminée !", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                setImageTour(getTour()); //changer image tour
                userClass.setText("");
                classUser = "Feu";
                adversaryClass.setText("");
                resultat.setText("");
                userClass.setText(userClass.getText() + "Papier ");
                Random rand = new Random();
                int nbClasse = rand.nextInt(3);
                classAdversary = TabClass[nbClasse];
                adversaryClass.setText(adversaryClass.getText()  +  TabClass[nbClasse]);
                if(classAdversary == "Papier"){
                    resultat.setText(resultat.getText() + "Nul");
                    argent.setText("");
                    argent.setText(String.valueOf((personnage.getMoney())));
                }
                if(classAdversary== "Caillou"){
                    resultat.setText( resultat.getText() + "Gagné  +5 $");
                    personnage.setMoney(personnage.getMoney() + 5);
                    argent.setText("");
                    argent.setText(String.valueOf(personnage.getMoney()));
                    setTour(getTour()+ 1);
                    userScore = userScore + 1;
                    scoreUser.setText(String.valueOf(userScore));
                    setImageTour(getTour());


                }
                if(classAdversary == "Ciseaux"){
                    resultat.setText(resultat.getText() + "Perdu  -2 $");
                    personnage.setMoney(personnage.getMoney() - 2);
                    argent.setText("");
                    argent.setText(String.valueOf(personnage.getMoney()));
                    setTour(getTour()+ 1);
                    adversaryScore = adversaryScore + 1;
                    scoreAdversary.setText(String.valueOf(adversaryScore));
                    setImageTour(getTour());


                }

            }
        });
        vent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getTour()>=10){
                    Intent intent = new Intent(PccActivity.this, MainActivity.class);
                    Toast.makeText(getApplicationContext(), "Partie terminée !", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                setImageTour(getTour());
                userClass.setText("");
                classUser = "Caillou";
                adversaryClass.setText("");
                resultat.setText("");
                userClass.setText(userClass.getText() + "Caillou");
                Random rand = new Random();
                int nbClasse = rand.nextInt(3);
                classAdversary = TabClass[nbClasse];
                adversaryClass.setText(adversaryClass.getText()  +   TabClass[nbClasse]);
                if(classAdversary == "Caillou"){
                    resultat.setText(resultat.getText() + "Match Nul");
                    argent.setText("");
                    argent.setText(String.valueOf(personnage.getMoney()));

                }
                if(classAdversary== "Ciseaux"){
                    resultat.setText( resultat.getText() + "Gagné  +5 $");
                    personnage.setMoney(personnage.getMoney()+5);
                    argent.setText("");
                    argent.setText(String.valueOf(personnage.getMoney()));
                    setTour(getTour()+ 1);
                    userScore = userScore + 1;
                    scoreUser.setText(String.valueOf(userScore));
                    setImageTour(getTour());


                }
                if(classAdversary == "Papier"){
                    resultat.setText(resultat.getText() + "Perdu  -2 $");
                    personnage.setMoney(personnage.getMoney()-2);
                    argent.setText("");
                    argent.setText(String.valueOf(personnage.getMoney()));
                    setTour(getTour()+ 1);
                    adversaryScore = adversaryScore + 1;
                    scoreAdversary.setText(String.valueOf(adversaryScore));
                    setImageTour(getTour());




                }

            }
        });
        eau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getTour()>=10){
                    Intent intent = new Intent(PccActivity.this, MainActivity.class);
                    Toast.makeText(getApplicationContext(), "Partie terminée !", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                userClass.setText("");
                classUser = "Ciseaux";
                adversaryClass.setText("");
                resultat.setText("");
                userClass.setText(userClass.getText() + "Ciseaux");
                Random rand = new Random();
                int nbClasse = rand.nextInt(3);
                classAdversary = TabClass[nbClasse];
                adversaryClass.setText(adversaryClass.getText()  +  TabClass[nbClasse]);
                if(classAdversary == "Ciseaux"){
                    resultat.setText(resultat.getText() + "Match Nul");
                    argent.setText("");
                    argent.setText(String.valueOf(personnage.getMoney()));

                }
                if(classAdversary== "Papier"){
                    resultat.setText( resultat.getText() + "Gagné  +5 $");
                    personnage.setMoney(personnage.getMoney()+5);
                    argent.setText("");
                    argent.setText(String.valueOf(personnage.getMoney()));
                    setTour(getTour()+ 1);
                    userScore = userScore + 1;
                    scoreUser.setText(String.valueOf(userScore));
                    setImageTour(getTour());



                }
                if(classAdversary == "Caillou"){
                    resultat.setText(resultat.getText() + "Perdu  -2 $");
                    personnage.setMoney(personnage.getMoney()-2);
                    argent.setText("");
                    argent.setText(String.valueOf(personnage.getMoney()));
                    setTour(getTour()+ 1);
                    adversaryScore = adversaryScore + 1;
                    scoreAdversary.setText(String.valueOf(adversaryScore));
                    setImageTour(getTour());



                }

            }
        });


    }
    @Override
    public void onClick(View view) {
    }


    public void setImageTour(int tour) {
        switch (getTour()) {
            case 1:
                img.setImageResource(R.drawable.first2);
                break;
            case 2:
                img.setImageResource(R.drawable.second2);
                break;
            case 3:
                img.setImageResource(R.drawable.third2);
                break;
            case 4:
                img.setImageResource(R.drawable.fourth2);
                break;
            case 5:
                img.setImageResource(R.drawable.fifth2);
                break;
            case 6:
                img.setImageResource(R.drawable.sixth2);
                break;
            case 7:
                img.setImageResource(R.drawable.seventh2);
                break;
            case 8:
                img.setImageResource(R.drawable.eighth2);
                break;
            case 9:
                img.setImageResource(R.drawable.ninth2);
                break;
            case 10:
                img.setImageResource(R.drawable.tenth2);
                break;

        }
    }


    public int getTour(){ return tour;}

    public int setTour(int ptour){
        tour = ptour;
        return tour;
    }
}
