package com.example.animation;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
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

public class FrameActivity extends AppCompatActivity {

    private ImageView animation;
    private Button startBt;
    private Button pauseBt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frameanim_main);

        animation = findViewById(R.id.frameanim);
        startBt = findViewById(R.id.startbut);
        pauseBt = findViewById(R.id.pausebut);

        Animation transAnim = AnimationUtils.loadAnimation(this, R.anim.trans_animation);
        AnimationDrawable frameAnim = (AnimationDrawable) animation.getDrawable();

        startBt.startAnimation(transAnim);
        pauseBt.startAnimation(transAnim);

        startBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameAnim.start();
            }
        });

        pauseBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameAnim.stop();
            }
        });
    }
}