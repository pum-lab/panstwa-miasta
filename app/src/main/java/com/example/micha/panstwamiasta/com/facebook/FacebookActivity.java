package com.example.micha.panstwamiasta.com.facebook;

import android.content.Context;
import android.os.Bundle;

import com.facebook.FacebookSdk;

import static com.facebook.FacebookSdk.getApplicationContext;

/**
 * Created by Kuba on 2015-05-31.
 */
public class FacebookActivity {

  //  @Override
   public void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
    }




}
