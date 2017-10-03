package es.vcarmen.activity02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Activity02c extends AppCompatActivity {

    public void boton2(View view){

        finish();
    }
    public void boton1(View view){
        Intent intent = new Intent(this, Activity02d.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity02c);
        Log.v("Momento","Estoy en Create3");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.v("Momento","Estoy en Start3");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.v("Momento","Estoy en Restart3");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.v("Momento","Estoy en Resume3");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.v("Momento","Estoy en Pause3");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.v("Momento","Estoy en Stop3");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.v("Momento","Estoy en Destroy3");
    }

}
