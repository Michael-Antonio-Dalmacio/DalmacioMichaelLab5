package com.dalmacio.michael.dalmaciomichaellab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class myService extends IntentService {
    public myService() {
        super("myService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITF", "myService is running");
    }
}
