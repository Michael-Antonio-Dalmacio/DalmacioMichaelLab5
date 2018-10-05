package com.dalmacio.michael.dalmaciomichaellab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class DalmacioMichaelLab5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalmacio_michael_lab5);
        Intent i = new Intent(this,myService.class);
        startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITF", "onStart has executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITF", "onResume has executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITF", "onPause has executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITF", "onStop has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITF", "onRestart has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITF", "onDestroy has executed");
    }

    public void displayScreen2(View view){
        Intent i = new Intent(this,Screen2.class);
        startActivity(i);
    }

    public void displayMap(View view){
        Intent i = null, chooser=null;
        if(view.getId()==R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.589909,120.975056"));
            chooser=Intent.createChooser(i, "Select your Map app");
            startActivity(chooser);
        }
    }
}
