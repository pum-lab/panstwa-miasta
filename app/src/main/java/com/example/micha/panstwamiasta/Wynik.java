package com.example.micha.panstwamiasta;

<<<<<<< HEAD
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Handler;
=======
import android.content.Intent;
>>>>>>> origin/master
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public class Wynik extends ActionBarActivity {

    TextView wynik;

=======


public class Wynik extends ActionBarActivity {

>>>>>>> origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wynik);
<<<<<<< HEAD

        wynik = (TextView) findViewById(R.id.textView12);

        Intent intent = getIntent();
        String litera = intent.getExtras().getString("wynik");

        wynik.setText(litera);
    }

=======
    }


>>>>>>> origin/master
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_wynik, menu);
        return true;
    }

    @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
    public void onBackPressed(){

    }

    @Override
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
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

    public void zestawieniewynikow(View view) {
        Intent zestawieniewynikow = new Intent(this, Ranking.class);
        startActivity(zestawieniewynikow);
    }

    public void jeszczeraz(View view) {
        Intent jeszczeraz = new Intent(this, MainActivity2Activity.class);
        startActivity(jeszczeraz);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
