package org.zhx.common.androidtweenanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button alphaBtn,scalBtn,transBtn,rotateBtn,arBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //渐变动画
        alphaBtn = findViewById(R.id.btn_alpha);
        alphaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha);
                alphaBtn.startAnimation(animation);
            }
        });
        //缩放动画
        scalBtn=findViewById(R.id.btn_scale);
        scalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_scal);
                scalBtn.startAnimation(animation);
            }
        });

        //位移动画
        transBtn=findViewById(R.id.btn_tran);
        transBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_translate);
                transBtn.startAnimation(animation);
            }
        });
        //旋转
        rotateBtn=findViewById(R.id.btn_rotate);
        rotateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rotate);
                rotateBtn.startAnimation(animation);
            }
        });
        // 旋转 淡化
        arBtn=findViewById(R.id.alpha_rotate_btn);
        arBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha_rotate);
                arBtn.startAnimation(animation);
            }
        });
    }
}