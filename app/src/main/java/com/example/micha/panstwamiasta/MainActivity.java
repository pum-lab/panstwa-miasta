package com.example.micha.panstwamiasta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void jedengracz(View view) {
<<<<<<< HEAD
        Intent jedengracz = new Intent(this, MainActivity2Activity.class);
        startActivity(jedengracz);
=======
        Intent intent = new Intent(this, MainActivity2Activity.class);
        startActivity(intent);
>>>>>>> origin/master
    }

    public void dwochgraczy(View view) {

<<<<<<< HEAD
        Intent dwochgraczy = new Intent(this, MainActivity22Activity.class);
        startActivity(dwochgraczy);
=======
        Intent intent2 = new Intent(this, MainActivity22Activity.class);
        startActivity(intent2);
>>>>>>> origin/master
    }
}

