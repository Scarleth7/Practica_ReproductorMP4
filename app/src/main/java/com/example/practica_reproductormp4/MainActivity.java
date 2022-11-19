package com.example.practica_reproductormp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.net.Uri;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView mivideo = findViewById(R.id.viVisor);

        String video = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(video);
        mivideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        mivideo.setMediaController(mediaController);
        mediaController.setAnchorView(mivideo);

    }
}