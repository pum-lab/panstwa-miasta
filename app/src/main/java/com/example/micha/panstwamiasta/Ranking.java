package com.example.micha.panstwamiasta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
import com.example.micha.panstwamiasta.com.facebook.FacebookActivity;

=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master

public class Ranking extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> origin/master
>>>>>>> origin/master
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ranking, menu);
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
    public void udostepnienie(View view) {
    Intent udostepnienie = new Intent(this, com.facebook.FacebookActivity.class);
      startActivity(udostepnienie);

    }
=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master

    public void menu(View view) {
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }
}
