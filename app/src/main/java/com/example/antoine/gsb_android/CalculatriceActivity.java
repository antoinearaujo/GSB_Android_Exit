package com.example.antoine.gsb_android;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.String.valueOf;

public class CalculatriceActivity extends AppCompatActivity {
    //On déclare toutes les variables dont on aura besoin
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPlus;
    Button buttonMoins;
    Button buttonDiv;
    Button buttonMul;
    Button buttonC;
    Button buttonEgal;
    Button buttonPoint;
    EditText ecran;
    String operateur;
    String nb1 = "";
    String nb2 = "";
    double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatrice);
//On récupère tous les éléments de notre interface graphique grâce aux ID
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMoins = (Button) findViewById(R.id.buttonMoins);
        buttonDiv = (Button) findViewById(R.id.buttonDivision);
        buttonMul = (Button) findViewById(R.id.buttonMultiplier);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEgal = (Button) findViewById(R.id.buttonEgal);
        ecran = (EditText) findViewById(R.id.EditText01);
        ecran.setText("");

        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ "9");
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText(ecran.getText()+ ".");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ecran.setText("");
                operateur = "";
                nb1 = "";
                nb2 = "";

            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb1 = nb1+ ecran.getText();
                ecran.setText("");
                operateur = "addition";
            }
        });
        buttonMoins.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb1 = nb1+ ecran.getText();
                ecran.setText("");
                operateur = "soustraction";
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb1 = nb1+ ecran.getText();
                ecran.setText("");
                operateur = "multiplication";
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb1 = nb1+ ecran.getText();
                ecran.setText("");
                operateur = "division";
            }
        });
        buttonEgal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nb2 = nb2+ ecran.getText();

                ecran.setText("");
                if(operateur=="addition"){
                    operateur = "";
                    double n1 = Double.parseDouble(nb1);
                    double n2 = Double.parseDouble(nb2);
                    ecran.setText(String.valueOf( addition(n1, n2)));
                }
                if(operateur=="soustraction"){
                    operateur = "";
                    double n1 = Double.parseDouble(nb1);
                    double n2 = Double.parseDouble(nb2);
                    ecran.setText(String.valueOf( soustraction(n1, n2)));
                }
                if(operateur=="multiplication"){
                    operateur = "";
                    double n1 = Double.parseDouble(nb1);
                    double n2 = Double.parseDouble(nb2);
                    ecran.setText(String.valueOf( multiplication(n1, n2)));
                }
                if(operateur=="division"){
                    operateur = "";
                    double n1 = Double.parseDouble(nb1);
                    double n2 = Double.parseDouble(nb2);
                    ecran.setText(String.valueOf( division(n1, n2)));
                }
            }
        });
    }


    public double addition(double nb1, double nb2){
        res = nb1 + nb2;
        return res;
    }

    public double soustraction(double nb1, double nb2){
        res = nb1 -nb2;
        return res;
    }

    public double multiplication(double nb1, double nb2){
        res = nb1 * nb2;
        return res;
    }

    public double division(double nb1, double nb2){
        res = nb1 / nb2;
        return res;
    }


}
