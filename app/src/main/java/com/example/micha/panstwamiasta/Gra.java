package com.example.micha.panstwamiasta;

import android.content.Intent;
<<<<<<< HEAD
import android.os.CountDownTimer;
=======
>>>>>>> origin/master
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
<<<<<<< HEAD
import android.widget.TextView;

=======
>>>>>>> origin/master


public class Gra extends ActionBarActivity {

<<<<<<< HEAD
    TextView myTimer;

=======
>>>>>>> origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra);
<<<<<<< HEAD

        myTimer = (TextView)findViewById(R.id.timer);

        timer(true);
=======
>>>>>>> origin/master
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gra, menu);
        return true;
    }

    @Override
<<<<<<< HEAD
    public void onBackPressed(){

    }

    @Override
=======
>>>>>>> origin/master
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

<<<<<<< HEAD
    void timer (boolean u){

        if(u==true) {

            new CountDownTimer(100000, 1000) {

                public void onFinish() {
                    myTimer.setText("Koniec czasu");
                    Intent koniec = new Intent(Gra.this, Wynik.class);
                    startActivity(koniec);
                }

                  public void onTick(long millisUntilFinished) {
                    myTimer.setText("Pozostało: " + millisUntilFinished / 1000 + "s");
                }
            }.start();

        }
    }

=======
>>>>>>> origin/master
    public void zakoncz(View view) {
        Intent zakoncz = new Intent(this, Wynik.class);
        startActivity(zakoncz);
    }
}
