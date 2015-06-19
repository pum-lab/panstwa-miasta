package com.example.micha.panstwamiasta;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.IOException;

public class Gra extends ActionBarActivity {

    TextView myTimer;
    Button zakoncz;
    TextView myTest;
    TextView literagra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra);

        myTimer = (TextView) findViewById(R.id.timer);
        zakoncz = (Button) findViewById(R.id.button6);
        literagra = (TextView) findViewById(R.id.literagra);

        zakoncz.setOnClickListener(zakonczOnClickListener);

        timer(true);

       // Intent intent = getIntent();
       // String litera = intent.getExtras().getString("litera2");

        //literagra.setText(litera);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gra, menu);
        return true;
    }

    @Override
    public void onBackPressed() {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void timer(boolean u) {

        if (u == true) {

            new CountDownTimer(100000, 1000) {

                public void onFinish() {
                    myTimer.setText("Koniec czasu");
                    try {
                        zakoncz();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                public void onTick(long millisUntilFinished) {
                    myTimer.setText("Pozostało: " + millisUntilFinished / 1000 + "s");
                }
            }.start();
        }
    }

    private void zakoncz() throws IOException {

        Intent intent = getIntent();
        String litera = intent.getExtras().getString("litera2");

        int lit = Integer.parseInt(litera);

        int wynik = 0;

        EditText panstwo1 = (EditText) findViewById(R.id.panstwo);
        String panstwo = panstwo1.getText().toString();
        char[] panstwoArray = panstwo.toCharArray();

        int p = panstwoArray.length;
        if (p>0) {
            int  panstwoInt = (int) panstwoArray[1];

            if (panstwoInt==lit){
                wynik = wynik + 1;
            }
        }

        EditText miasto1 = (EditText) findViewById(R.id.miasto);
        String miasto = miasto1.getText().toString();
        char[] miastoArray = miasto.toCharArray();

        int m = miastoArray.length;
        if (m>0) {
            int  miastoInt = (int) miastoArray[1];

            if (miastoInt==lit){
                wynik = wynik + 1;
            }
        }

        EditText zwierze1 = (EditText) findViewById(R.id.zwierze);
        String zwierze = zwierze1.getText().toString();
        char[] zwierzeArray = zwierze.toCharArray();

        int z = zwierzeArray.length;
        if (z>0) {
            int  zwierzeInt = (int) zwierzeArray[1];

            if (zwierzeInt==lit){
                wynik = wynik + 1;
            }
        }

        EditText roslina1 = (EditText) findViewById(R.id.roslina);
        String roslina = roslina1.getText().toString();
        char[] roslinaArray = roslina.toCharArray();

        int r = roslinaArray.length;
        if (r>0) {
            int  roslinaInt = (int) roslinaArray[1];

            if (roslinaInt==lit){
                wynik = wynik + 1;
            }
        }

        EditText rzeka1 = (EditText) findViewById(R.id.rzeka);
        String rzeka = rzeka1.getText().toString();
        char[] rzekaArray = rzeka.toCharArray();

        int rz = rzekaArray.length;
        if (rz>0) {
            int  rzekaInt = (int) rzekaArray[1];

            if (rzekaInt==lit){
                wynik = wynik + 1;
            }
        }

        String wyn = Integer.toString(wynik);
        literagra.setText(wyn);

        Intent i = new Intent(this, Wynik.class);
        i.putExtra("wynik", wyn);
        startActivity(i);
    }


    public Button.OnClickListener zakonczOnClickListener = new Button.OnClickListener() {

        @Override
        public void onClick(View arg0) {

            try {
                zakoncz();
            } catch (IOException e) {
                e.printStackTrace();
            }

            timer(false);
        }
    };

}