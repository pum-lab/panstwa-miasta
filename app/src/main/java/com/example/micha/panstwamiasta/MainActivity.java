package com.example.micha.panstwamiasta;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
import android.app.DownloadManager;
import android.bluetooth.BluetoothAdapter;
=======
<<<<<<< HEAD
import android.app.DownloadManager;
import android.bluetooth.BluetoothAdapter;
=======
<<<<<<< HEAD
import android.app.DownloadManager;
import android.bluetooth.BluetoothAdapter;
=======
<<<<<<< HEAD
import android.app.DownloadManager;
import android.bluetooth.BluetoothAdapter;
=======
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import android.widget.EditText;
>>>>>>> origin/master
>>>>>>> origin/master


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
    protected void onDestroy() {
        // TODO Auto-generated method stub

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
    public void AppExit(){

        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

        int pid = android.os.Process.myPid();
        android.os.Process.killProcess(pid);
    }

    public void jedengracz(View view) {
<<<<<<< HEAD
=======
=======
    public void jedengracz(View view) {
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
>>>>>>> origin/master
>>>>>>> origin/master
        Intent jedengracz = new Intent(this, MainActivity2Activity.class);
        startActivity(jedengracz);
    }

<<<<<<< HEAD
    public void dwochgraczy_k(View view) {
        Intent dwochgraczy_k = new Intent(this, bluetooth_connect_client.class);
=======
<<<<<<< HEAD
    public void dwochgraczy_k(View view) {
        Intent dwochgraczy_k = new Intent(this, bluetooth_connect_client.class);
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
    public void dwochgraczy_k(View view) {

        Intent dwochgraczy_k = new Intent(this, MainActivity22Activity.class);
>>>>>>> origin/master
>>>>>>> origin/master
        startActivity(dwochgraczy_k);
    }

    public void dwochgraczy_s(View view) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
        Intent dwochgraczy_s = new Intent(this, losowanie_multi.class);
        startActivity(dwochgraczy_s);
    }

    public void close(View view) {
        AppExit();
<<<<<<< HEAD
=======
=======

        Intent dwochgraczy_s = new Intent(this, bluetooth_connect_serwer.class);
        startActivity(dwochgraczy_s);
<<<<<<< HEAD
=======
=======
    private final static int REQUEST_ENABLE_BT = 1;

    public void dwochgraczy(View view) {

        Intent dwochgraczy = new Intent(this, MainActivity22Activity.class);
        startActivity(dwochgraczy);


        BluetoothAdapter mBT = BluetoothAdapter.getDefaultAdapter();
        if (mBT == null) {
            // Device does not support Bluetooth
        }

        if (!mBT.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        }


<<<<<<< HEAD
=======
=======
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
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
>>>>>>> origin/master
    }
}

