package com.example.alazh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    String str="Activity Lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(str,"in the Created State");
    }
    protected  void onStart(){
        super.onStart();
        Log.d(str,"in the Started State");
    }

    protected  void onResume(){
        super.onResume();
        Log.d(str,"in the Resumed State");
    }

    protected void onPause(){
       super.onPause();
        Log.d(str,"in the Paused State");
    }

    protected void onStop(){
        super.onStop();
        Log.d(str,"in the Stoped State");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d(str,"in the Destroyed State");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d(str,"in the Restarted State");
    }
}
