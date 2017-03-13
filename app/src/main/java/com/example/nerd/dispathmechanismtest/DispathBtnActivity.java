package com.example.nerd.dispathmechanismtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by nerd on 2017/3/13.
 */

public class DispathBtnActivity extends AppCompatActivity {
    private final String TAG="DispathBtnActivity";
    private Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn);
        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick execute");
            }
        });
        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case  MotionEvent.ACTION_DOWN:
                        Log.d(TAG,"onTouch execute ACTION_DOWN");
                        return true;
                }
                Log.d(TAG,"onTouch execute"+motionEvent.getAction());

                return false;
            }
        });
    }
}
