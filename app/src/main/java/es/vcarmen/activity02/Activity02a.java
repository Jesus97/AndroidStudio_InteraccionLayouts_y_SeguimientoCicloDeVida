package es.vcarmen.activity02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity02a extends AppCompatActivity {

    public void boton2(View view){

        finish();
    }
    public void boton1(View view){
        Intent intent = new Intent(this, Activity02b.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity02a);
        Log.v("Momento","Estoy en Create1");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.v("Momento","Estoy en Start1");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.v("Momento","Estoy en Restart1");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.v("Momento","Estoy en Resume1");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.v("Momento","Estoy en Pause1");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.v("Momento","Estoy en Stop1");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.v("Momento","Estoy en Destroy1");
    }

}
