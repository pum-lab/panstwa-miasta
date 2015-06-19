package com.example.micha.panstwamiasta;

<<<<<<< HEAD
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
=======
<<<<<<< HEAD
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.ParcelUuid;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
>>>>>>> origin/master
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
<<<<<<< HEAD
import java.io.IOException;

public class Gra extends ActionBarActivity {

    TextView myTimer;
    Button zakoncz;
    TextView myTest;
    TextView literagra;

=======
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.UUID;
=======
import android.content.Intent;
<<<<<<< HEAD
import android.os.CountDownTimer;
=======
<<<<<<< HEAD
import android.os.CountDownTimer;
=======
>>>>>>> origin/master
>>>>>>> origin/master
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
<<<<<<< HEAD
import android.widget.TextView;

=======
<<<<<<< HEAD
import android.widget.TextView;

=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master


public class Gra extends ActionBarActivity {

<<<<<<< HEAD
    TextView myTimer;
    Button zakoncz;


=======
<<<<<<< HEAD
    TextView myTimer;

=======
<<<<<<< HEAD
    TextView myTimer;

=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra);
<<<<<<< HEAD

        myTimer = (TextView) findViewById(R.id.timer);
        zakoncz = (Button) findViewById(R.id.button6);
        literagra = (TextView) findViewById(R.id.literagra);
=======
<<<<<<< HEAD

        myTimer = (TextView)findViewById(R.id.timer);
        zakoncz = (Button) findViewById(R.id.button6);
>>>>>>> origin/master

        zakoncz.setOnClickListener(zakonczOnClickListener);

        timer(true);
<<<<<<< HEAD

       // Intent intent = getIntent();
       // String litera = intent.getExtras().getString("litera2");

        //literagra.setText(litera);
    }

=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master

        myTimer = (TextView)findViewById(R.id.timer);

        timer(true);
<<<<<<< HEAD
=======
=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
    }


>>>>>>> origin/master
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gra, menu);
        return true;
    }

    @Override
<<<<<<< HEAD
    public void onBackPressed() {
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
>>>>>>> origin/master
    public void onBackPressed(){
>>>>>>> origin/master

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

<<<<<<< HEAD
    void timer(boolean u) {

        if (u == true) {
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
>>>>>>> origin/master
    void timer (boolean u){

        if(u==true) {
>>>>>>> origin/master

            new CountDownTimer(100000, 1000) {

                public void onFinish() {
                    myTimer.setText("Koniec czasu");
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
                    try {
                        zakoncz();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
<<<<<<< HEAD
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
=======
=======
                    Intent koniec = new Intent(Gra.this, Wynik.class);
                    startActivity(koniec);
>>>>>>> origin/master
                }

                  public void onTick(long millisUntilFinished) {
                    myTimer.setText("Pozostało: " + millisUntilFinished / 1000 + "s");
                }
            }.start();
<<<<<<< HEAD
        }
    }


    private void zakoncz() throws IOException {

        EditText panstwo1 = (EditText) findViewById(R.id.panstwo);
        String panstwo = panstwo1.getText().toString();

        EditText miasto1 = (EditText) findViewById(R.id.miasto);
        String miasto = miasto1.getText().toString();

        EditText zwierze1 = (EditText) findViewById(R.id.zwierze);
        String zwierze = zwierze1.getText().toString();

        EditText roslina1 = (EditText) findViewById(R.id.roslina);
        String roslina = roslina1.getText().toString();

        EditText rzeka1 = (EditText) findViewById(R.id.rzeka);
        String rzeka = rzeka1.getText().toString();

        String chars = panstwo; //{panstwo, miasto, zwierze, roslina, rzeka};

        Intent zakoncz = new Intent(this, Wynik.class);
        startActivity(zakoncz);


    }


public Button.OnClickListener zakonczOnClickListener = new Button.OnClickListener() {
>>>>>>> origin/master

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
<<<<<<< HEAD

}
=======
}
=======

        }
    }

<<<<<<< HEAD
=======
=======
>>>>>>> origin/master
>>>>>>> origin/master
    public void zakoncz(View view) {
        Intent zakoncz = new Intent(this, Wynik.class);
        startActivity(zakoncz);
    }
}
>>>>>>> origin/master
>>>>>>> origin/master
