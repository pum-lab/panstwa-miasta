package com.example.micha.panstwamiasta;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.io.IOException;
import java.util.Set;
import java.util.UUID;


public class bluetooth_connect_serwer extends ActionBarActivity {

    private static final int REQUEST_ENABLE_BT = 1;

    BluetoothAdapter mBluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_connect_serwer);

        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

       // CheckBlueToothState();
    }
/*
    private void CheckBlueToothState() {
        if (mBluetoothAdapter == null) {
        } else {
            if (mBluetoothAdapter.isEnabled()) {
                //nic
            } else {
                Intent discoverable = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                startActivity(discoverable);
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bluetooth_connect_serwer, menu);
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


    //This broadcast is sent when a device has been found...
    registerReceiver(discoveryResult, new IntentFilter(BluetoothDevice.ACTION_FOUND));
    //Start discovery functionality...
    BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
    if(adapter != null && adapter.isDiscovering()){
        adapter.cancelDiscovery();
    }
    adapter.startDiscovery();

    private BroadcastReceiver discoveryResult = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice remoteDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
        }
    };

    UUID uuid = UUID.randomUUID();
    String name = "Państwa-miasta";
    final BluetoothServerSocket mBluetoothAdapter = bluetooth.listenUsingRfcommWithServiceRecord(name, uuid);
    BluetoothSocket serverSocket = mBluetoothAdapter.accept();
//Ready to start communication...



    tmp = mBluetoothAdapter.listenUsingRfcommWithServiceRecord(name, uuid);


    Set<BluetoothDevice> bondedDevices = bluetooth.getBondedDevices();




    UUID uuid = UUID.fromString(“a60f35f0-b93a-11de-8a19-03002011c456”);
    BluetoothSocket clientSocket = device.createRfcommSocketToServiceRecord(uuid);
// Block until server connection is accepted.
    clientSocket.connect();
//Ready to start communication



//This code keeps reading the messages while connection is open...
    while(true){
        StringBuilder sb = new StringBuilder();
        bytesRead = is.read(buffer);
        if (bytesRead != -1) {
            String result = "";
            while ((bytesRead == bufferSize) && (buffer[bufferSize-1] != 0)){
                result = result + new String(buffer, 0, bytesRead - 1);
                bytesRead = is.read(buffer);
            }
            result = result + new String(buffer, 0, bytesRead - 1);
            sb.append(result);
        }
        android.util.Log.e("TrackingFlow", "Message Received: " + sb.toString());
    }
    .
            .
            .
//This is the way you keep writing while connection is open.
            while (true) {
        try {
            os.write("Message From Client\n");
            os.flush();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

/*
private class AcceptThread extends Thread {
    private final BluetoothServerSocket mmServerSocket;

    public AcceptThread() {
        // Use a temporary object that is later assigned to mmServerSocket,
        // because mmServerSocket is final
        BluetoothServerSocket tmp = null;
        try {
            // MY_UUID is the app's UUID string, also used by the client code
            UUID uuid = UUID.randomUUID();
            String name = "Państwa-Miasta";
            tmp = mBluetoothAdapter.listenUsingRfcommWithServiceRecord(name, uuid);
        } catch (IOException e) {
        }
        mmServerSocket = tmp;
    }

    public void run() {
        BluetoothSocket socket = null;
        // Keep listening until exception occurs or a socket is returned
        while (true) {
            try {
                socket = mmServerSocket.accept();
            } catch (IOException e) {
                break;
            }
            // If a connection was accepted
            if (socket != null) {
                // Do work to manage the connection (in a separate thread)
                manageConnectedSocket(socket);
                mmServerSocket.close();
                break;
            }
        }
    }
*/
    /* Will cancel the listening socket, and cause the thread to finish */
  /*  public void cancel() {
        try {
            mmServerSocket.close();
        } catch (IOException e) {
        }
    }


}*/
}