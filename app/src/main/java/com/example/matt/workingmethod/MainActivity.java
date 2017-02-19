package com.example.matt.workingmethod;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean guess(int try1, int try2, int try3){

        if(try1 > try2){
            return false;
        }

        return try3 <= try2;

    }
}
