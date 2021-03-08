package com.example.hayaalzawwadmidterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton buttonone;
    MediaPlayer mpone;
    int playing;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button2 = (Button) findViewById(R.id.button2);
       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openact2();

               button3 = (Button) findViewById(R.id.button3);
               button3.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       openact3();
                   }
               });

               buttonone = (ImageButton) findViewById(R.id.imageButton2);


               mpone = new MediaPlayer();


               mpone = MediaPlayer.create(this, R.raw.track1);

               playing = 0;
               buttonone.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       switch (playing) {
                           case 0:
                               mpone.start();
                               playing = 1;

                               break;
                           case 1:
                               mpone.pause();
                               playing = 0;

                               break;
                       }

                   }
               });

           }

           public void openact2() {
               Intent intent = new Intent(this, act2.class);
               startActivity(intent);
           }

           public void openact3() {
               Intent intent = new Intent(this, act3.class);
               startActivity(intent);
           }
       }
    }
}