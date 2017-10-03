package es.vcarmen.activity02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Activity02d extends AppCompatActivity {

    public void boton2(View view){

        finish();
    }
    public void boton1(View view){
        Intent intent = new Intent(this, Activity02a.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity02d);
        Log.v("Momento","Estoy en Create4");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.v("Momento","Estoy en Start4");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.v("Momento","Estoy en Restart4");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.v("Momento","Estoy en Resume4");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.v("Momento","Estoy en Pause4");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.v("Momento","Estoy en Stop4");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.v("Momento","Estoy en Destroy4");
    }

}
