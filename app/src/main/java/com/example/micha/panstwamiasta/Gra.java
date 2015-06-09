package com.example.micha.panstwamiasta;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.ParcelUuid;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.UUID;


public class Gra extends ActionBarActivity {

    TextView myTimer;
    Button zakoncz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra);

        myTimer = (TextView)findViewById(R.id.timer);
        zakoncz = (Button) findViewById(R.id.button6);

        zakoncz.setOnClickListener(zakonczOnClickListener);

        timer(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gra, menu);
        return true;
    }

    @Override
    public void onBackPressed(){

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

    void timer (boolean u){

        if(u==true) {

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