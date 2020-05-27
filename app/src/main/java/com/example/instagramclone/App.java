package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PSn0vbsqzH8eUur3bfxDfWY6EqJ5MqIQRnRDlt2H")
                // if defined
                .clientKey("QLonXU7RCEN1u2vGot2EHYA4NfcFv5u9B8hm8j2h")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
