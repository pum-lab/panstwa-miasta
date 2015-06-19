package com.example.micha.panstwamiasta;

<<<<<<< HEAD
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
=======
<<<<<<< HEAD
import android.content.Intent;
=======
<<<<<<< HEAD
import android.content.Intent;
=======
<<<<<<< HEAD
import android.content.Intent;
=======
<<<<<<< HEAD
import android.content.Intent;
=======
<<<<<<< HEAD
import android.content.Intent;
=======
<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
<<<<<<< HEAD
>>>>>>> origin/master
import android.view.View;


import java.util.Random;
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
import android.view.View;
=======
<<<<<<< HEAD
import android.view.View;
=======
<<<<<<< HEAD
import android.view.View;
=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master


public class MainActivity2Activity extends ActionBarActivity {

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
    Button losuj;
    TextView litera;

=======
<<<<<<< HEAD
    Button losuj;
    TextView litera;

=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master

        losuj = (Button) findViewById(R.id.losowanko);
        litera = (TextView) findViewById(R.id.wylosowana);

        losuj.setOnClickListener(losujOnClickListener);
<<<<<<< HEAD
=======
=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
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
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master

    private Button.OnClickListener losujOnClickListener = new Button.OnClickListener() {

        @Override
        public void onClick(View arg0) {


            String[] chars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "Z"};
            litera.setText(chars[(int) (Math.random() * 10)]);

         }
    };
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master

    public void rozpocznijgre(View view) {
        Intent rozpocznijgre = new Intent(this, Gra.class);
        startActivity(rozpocznijgre);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
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
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
}
