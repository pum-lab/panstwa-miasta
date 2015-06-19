package com.example.micha.panstwamiasta;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class bluetooth_connect_client extends ActionBarActivity {

    private static final int REQUEST_ENABLE_BT = 1234;
    List<String> list = new ArrayList<String>();
    BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_connect_client);

        if (mBluetoothAdapter == null) {
            Intent intent;
            intent = new Intent(this, Gra.class);
            startActivity(intent);
        }

        ArrayAdapter<String> itemsAdapter;
        itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();

        if (pairedDevices.size() > 0) {
            for (BluetoothDevice device : pairedDevices) {
                itemsAdapter.add(device.getName() + "\n" + device.getAddress());
            }
        }

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);

        CheckBlueToothState();
       // CheckBluetoothStateArray();

    }

    private void CheckBlueToothState() {
        if (mBluetoothAdapter == null) {
        }
        else {
            if (mBluetoothAdapter.isEnabled()) {

            }
            else {
                Intent discoverable = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                startActivityForResult(discoverable, REQUEST_ENABLE_BT);
            }
        }
    }

    public void CheckBluetoothStateArray() {
        if (!mBluetoothAdapter.isEnabled()) {
            ArrayAdapter<String> itemsAdapter;
            itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
            itemsAdapter.add("Nie można uzyskać połącznenia. Bluetooth jest wyłączony.");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity22, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle ges on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

        public void rozpocznij (View view) {

            BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();

            if (pairedDevices.size() > 0) {
                Intent rozpocznij = new Intent(this, Gra.class);
                startActivity(rozpocznij);
            }
            else {
                Context context = getApplicationContext();
                Toast.makeText(context, "Brak połączonych urządzeń", Toast.LENGTH_SHORT).show();
            }
        }
 }
