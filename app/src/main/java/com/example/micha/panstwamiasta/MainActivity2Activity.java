package com.example.micha.panstwamiasta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import java.util.Random;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
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

    public void rozpocznijgre(View view) {

        /* tu trzeba pobrać zmienną z fragmentu "losowanie" i jednocześnie stworzyć intent wysyłający ją do activity "Gra.class",
        to pod spodem niestety nie chce działać (pierwsze dwie linijki kodu to pobranie zmiennej,
        kolejne wysłanie jej do Gra.class i jednoczesne przejście do tego activity */

        Intent intent = getIntent();
        String litera2 = intent.getExtras().getString("wysylka");

        Intent i = new Intent(this, Gra.class);
        i.putExtra("litera2", litera2);
        startActivity(i);
    }
}
