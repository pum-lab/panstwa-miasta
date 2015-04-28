package com.example.micha.panstwamiasta;

<<<<<<< HEAD
import android.content.Intent;
=======
<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> origin/master
>>>>>>> origin/master
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
<<<<<<< HEAD
import android.view.View;
=======
<<<<<<< HEAD
import android.view.View;
=======
>>>>>>> origin/master
>>>>>>> origin/master


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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master

    public void rozpocznijgre(View view) {
        Intent rozpocznijgre = new Intent(this, Gra.class);
        startActivity(rozpocznijgre);
    }
<<<<<<< HEAD
=======
=======
>>>>>>> origin/master
>>>>>>> origin/master
}
