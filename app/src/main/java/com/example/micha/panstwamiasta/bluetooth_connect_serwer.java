package com.example.micha.panstwamiasta;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
<<<<<<< HEAD
=======
=======
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
>>>>>>> origin/master
>>>>>>> origin/master
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class bluetooth_connect_serwer extends ActionBarActivity {

    ListView listViewPaired;
    ListView listViewDetected;
    ArrayList<String> arrayListpaired;
    Button buttonSearch;
    ArrayAdapter<String> adapter,detectedAdapter;
    static HandleSeacrh handleSeacrh;
    BluetoothDevice bdDevice;
    ArrayList<BluetoothDevice> arrayListPairedBluetoothDevices;
    private ButtonClicked clicked;
    ListItemClickedonPaired listItemClickedonPaired;
    BluetoothAdapter bluetoothAdapter = null;
    ArrayList<BluetoothDevice> arrayListBluetoothDevices = null;
    ListItemClicked listItemClicked;
    private static final int REQUEST_ENABLE_BT = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_connect_serwer);

        listViewDetected = (ListView) findViewById(R.id.listViewDetected);
        listViewPaired = (ListView) findViewById(R.id.listViewPaired);
        buttonSearch = (Button) findViewById(R.id.buttonSearch);
        arrayListpaired = new ArrayList<String>();
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        clicked = new ButtonClicked();
        handleSeacrh = new HandleSeacrh();
        arrayListPairedBluetoothDevices = new ArrayList<BluetoothDevice>();
        /*
         * the above declaration is just for getting the paired bluetooth devices;
         * this helps in the removing the bond between paired devices.
         */
        listItemClickedonPaired = new ListItemClickedonPaired();
        arrayListBluetoothDevices = new ArrayList<BluetoothDevice>();
        adapter= new ArrayAdapter<String>(bluetooth_connect_serwer.this, android.R.layout.simple_list_item_1, arrayListpaired);
        detectedAdapter = new ArrayAdapter<String>(bluetooth_connect_serwer.this, android.R.layout.simple_list_item_single_choice);
        listViewDetected.setAdapter(detectedAdapter);
        listItemClicked = new ListItemClicked();
        detectedAdapter.notifyDataSetChanged();
        listViewPaired.setAdapter(adapter);

        CheckBlueToothState();
    }

    private void CheckBlueToothState() {
        if (bluetoothAdapter == null) {
        }
        else {
            if (bluetoothAdapter.isEnabled()) {

            }
            else {
                Intent discoverable = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                startActivityForResult(discoverable, REQUEST_ENABLE_BT);
<<<<<<< HEAD
=======
=======
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
>>>>>>> origin/master
>>>>>>> origin/master
            }
        }
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
    @Override
    public void onBackPressed(){

    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        getPairedDevices();
        buttonSearch.setOnClickListener(clicked);
        listViewDetected.setOnItemClickListener(listItemClicked);
        listViewPaired.setOnItemClickListener(listItemClickedonPaired);
    }

    private void getPairedDevices() {
        Set<BluetoothDevice> pairedDevice = bluetoothAdapter.getBondedDevices();
        if(pairedDevice.size()>0)
        {
            for(BluetoothDevice device : pairedDevice)
            {
                arrayListpaired.add(device.getName()+"\n"+device.getAddress());
                arrayListPairedBluetoothDevices.add(device);
            }
        }
        adapter.notifyDataSetChanged();
    }

    class ListItemClicked implements OnItemClickListener
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // TODO Auto-generated method stub
            bdDevice = arrayListBluetoothDevices.get(position);
            //bdClass = arrayListBluetoothDevices.get(position);
            Log.i("Log", "The dvice : "+bdDevice.toString());
            /*
             * here below we can do pairing without calling the callthread(), we can directly call the
             * connect(). but for the safer side we must use the threading object.
             */
            //callThread();
            //connect(bdDevice);
            Boolean isBonded = false;
            try {
                isBonded = createBond(bdDevice);
                if(isBonded)
                {
                    arrayListpaired.add(bdDevice.getName()+"\n"+bdDevice.getAddress());
                    adapter.notifyDataSetChanged();

                    getPairedDevices();
                    adapter.notifyDataSetChanged();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }connect(bdDevice);
            Log.i("Log", "The bond is created: "+isBonded);
        }
    }

    class ListItemClickedonPaired implements OnItemClickListener
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
            bdDevice = arrayListPairedBluetoothDevices.get(position);
            try {
                Boolean removeBonding = removeBond(bdDevice);
                if(removeBonding)
                {
                    arrayListpaired.remove(position);
                    adapter.notifyDataSetChanged();
                }

                Log.i("Log", "Removed"+removeBonding);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private Boolean connect(BluetoothDevice bdDevice) {
        Boolean bool = false;
        try {
            Log.i("Log", "service method is called ");
            Class cl = Class.forName("android.bluetooth.BluetoothDevice");
            Class[] par = {};
            Method method = cl.getMethod("createBond", par);
            Object[] args = {};
            bool = (Boolean) method.invoke(bdDevice);//, args);// this invoke creates the detected devices paired.
            //Log.i("Log", "This is: "+bool.booleanValue());
            //Log.i("Log", "devicesss: "+bdDevice.getName());
        } catch (Exception e) {
            Log.i("Log", "Inside catch of serviceFromDevice Method");
            e.printStackTrace();
        }
        return bool.booleanValue();
    };


    public boolean removeBond(BluetoothDevice btDevice)
            throws Exception
    {
        Class btClass = Class.forName("android.bluetooth.BluetoothDevice");
        Method removeBondMethod = btClass.getMethod("removeBond");
        Boolean returnValue = (Boolean) removeBondMethod.invoke(btDevice);
        return returnValue.booleanValue();
    }


    public boolean createBond(BluetoothDevice btDevice)
            throws Exception
    {
        Class class1 = Class.forName("android.bluetooth.BluetoothDevice");
        Method createBondMethod = class1.getMethod("createBond");
        Boolean returnValue = (Boolean) createBondMethod.invoke(btDevice);
        return returnValue.booleanValue();
    }


    class ButtonClicked implements OnClickListener
    {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.buttonSearch:
                    arrayListBluetoothDevices.clear();
                    startSearching();
                    break;
                default:
                    break;
            }
        }
    }
    private BroadcastReceiver myReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Message msg = Message.obtain();
            String action = intent.getAction();
            if(BluetoothDevice.ACTION_FOUND.equals(action)){
                Toast.makeText(context, "Znaleziono urządzenia!", Toast.LENGTH_SHORT).show();

                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                try
                {

                }
                catch (Exception e) {
                    Log.i("Log", "Inside the exception: ");
                    e.printStackTrace();
                }

                if(arrayListBluetoothDevices.size()<1) // this checks if the size of bluetooth device is 0,then add the
                {                                           // device to the arraylist.
                    detectedAdapter.add(device.getName()+"\n"+device.getAddress());
                    arrayListBluetoothDevices.add(device);
                    detectedAdapter.notifyDataSetChanged();
                }
                else
                {
                    boolean flag = true;    // flag to indicate that particular device is already in the arlist or not
                    for(int i = 0; i<arrayListBluetoothDevices.size();i++)
                    {
                        if(device.getAddress().equals(arrayListBluetoothDevices.get(i).getAddress()))
                        {
                            flag = false;
                        }
                    }
                    if(flag == true)
                    {
                        detectedAdapter.add(device.getName()+"\n"+device.getAddress());
                        arrayListBluetoothDevices.add(device);
                        detectedAdapter.notifyDataSetChanged();
                    }
                }
            }
        }
    };
    private void startSearching() {
        Log.i("Log", "in the start searching method");
        IntentFilter intentFilter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        bluetooth_connect_serwer.this.registerReceiver(myReceiver, intentFilter);
        bluetoothAdapter.startDiscovery();
    }

    class HandleSeacrh extends Handler
    {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 111:

                    break;

                default:
                    break;
            }
        }
    }


    public void rozpocznijgre (View view) {

        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();

        if (pairedDevices.size() > 0) {
            Intent rozpocznijgre = new Intent(this, Gra.class);
            startActivity(rozpocznijgre);
        }
        else {
            Context context = getApplicationContext();
            Toast.makeText(context, "Brak połączonych urządzeń", Toast.LENGTH_SHORT).show();
        }
    }

    public void powrot (View view) {
        Intent powrot = new Intent(this, MainActivity.class);
        startActivity(powrot);
    }

<<<<<<< HEAD
=======
=======

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
>>>>>>> origin/master
>>>>>>> origin/master
}