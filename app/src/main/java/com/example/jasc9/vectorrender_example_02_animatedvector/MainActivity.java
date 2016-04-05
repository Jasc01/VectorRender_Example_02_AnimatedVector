package com.example.jasc9.vectorrender_example_02_animatedvector;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView spaceShip = (ImageView) findViewById(R.id.animatedSpaceShip);
        Drawable spaceShipDrawable = spaceShip.getDrawable();

        if(spaceShipDrawable instanceof Animatable) {
            ((Animatable) spaceShipDrawable).start();
        }
    }
}
