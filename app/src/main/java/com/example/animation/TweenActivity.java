package com.example.animation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TweenActivity extends AppCompatActivity {

    private ImageView tweenanima;
    private Button twstartBt;
    private Button twspauseBt;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tweenanim_main);

        tweenanima = findViewById(R.id.tweenanim);
        twstartBt = findViewById(R.id.twstartbut);
        twspauseBt = findViewById(R.id.twpausebut);

        Animation blinkAnim = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
        Animation rotaAnim = AnimationUtils.loadAnimation(this, R.anim.rotattion_animation);

        twstartBt.startAnimation(rotaAnim);
        twspauseBt.startAnimation(rotaAnim);

        twstartBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tweenanima.startAnimation(blinkAnim);
            }
        });

        twspauseBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tweenanima.clearAnimation();
            }
        });
    }
}