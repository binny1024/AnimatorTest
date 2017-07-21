package com.dragon.myapplication;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.img2)
    ImageView mImg2;
    @BindView(R.id.img3)
    ImageView mImg3;
    @BindView(R.id.img4)
    ImageView mImg4;
    @BindView(R.id.img5)
    ImageView mImg5;
    @BindView(R.id.img6)
    ImageView mImg6;
    @BindView(R.id.img7)
    ImageView mImg7;
    @BindView(R.id.img8)
    ImageView mImg8;
    @BindView(R.id.img1)
    ImageView mImg1;

    private boolean isOpen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.img2, R.id.img3, R.id.img4, R.id.img5, R.id.img6, R.id.img7, R.id.img8, R.id.img1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img2:
                Toast.makeText(this, "img2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img3:
                Toast.makeText(this, "img3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img4:
                Toast.makeText(this, "img4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img5:
                Toast.makeText(this, "img5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img6:
                Toast.makeText(this, "img6", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img7:
                Toast.makeText(this, "img7", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img8:
                Toast.makeText(this, "img28", Toast.LENGTH_SHORT).show();
                break;
            case R.id.img1:
                //红色的开关按钮
                if (!isOpen) {
                    isOpen = true;
                    ObjectAnimator.ofFloat(mImg2,"translationY",0,100).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg3,"translationY",0,200).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg4,"translationY",0,300).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg5,"translationY",0,400).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg6,"translationY",0,500).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg7,"translationY",0,600).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg8,"translationY",0,700).setDuration(800).start();
                }else {
                    isOpen = false;
                    ObjectAnimator.ofFloat(mImg2,"translationY",100,0).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg3,"translationY",200,0).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg4,"translationY",300,0).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg5,"translationY",400,0).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg6,"translationY",500,0).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg7,"translationY",600,0).setDuration(800).start();
                    ObjectAnimator.ofFloat(mImg8,"translationY",700,0).setDuration(800).start();
                }
                break;
            default:
                Toast.makeText(this, "sadadasd ", Toast.LENGTH_SHORT).show(); Toast.makeText(this, "img2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
