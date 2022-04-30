package com.example.studyview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.move.view.BallMoveView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    BallMoveView ballMoveView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ballMoveView = findViewById(R.id.bv_move);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                ballMoveView.postInvalidate();
            }
        },3000,1000);
    }
}