package com.example.micha.panstwamiasta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity2Activity extends ActionBarActivity {

    Button losuj;
    TextView litera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        losuj = (Button) findViewById(R.id.losowanko);
        litera = (TextView) findViewById(R.id.wylosowana);

        losuj.setOnClickListener(losujOnClickListener);
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

    private Button.OnClickListener losujOnClickListener = new Button.OnClickListener() {

        @Override
        public void onClick(View arg0) {


            String[] chars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "Z"};
            litera.setText(chars[(int) (Math.random() * 10)]);

         }
    };

    public void rozpocznijgre(View view) {
        Intent rozpocznijgre = new Intent(this, Gra.class);
        startActivity(rozpocznijgre);
    }
}
