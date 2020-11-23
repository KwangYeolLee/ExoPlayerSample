package kr.co.gstech.exoplayerbp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CustomExoPlayerView customExoPlayerView;
    private CustomExoPlayerView customExoPlayerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createMediaPlayer();
    }

    private void createMediaPlayer() {
        customExoPlayerView = findViewById(R.id.customPlayerView);
        customExoPlayerView.initializePlayer(
                "https://html5demos.com/assets/dizzy.mp4");
        customExoPlayerView2 = findViewById(R.id.customPlayerView2);
        customExoPlayerView2.initializePlayer(
                "https://storage.googleapis.com/exoplayer-test-media-1/mkv/android-screens-lavf-56.36.100-aac-avc-main-1280x720.mkv");
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (customExoPlayerView != null) {
            customExoPlayerView.releasePlayer();
        }
        if (customExoPlayerView2 != null) {
            customExoPlayerView2.releasePlayer();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (customExoPlayerView != null) {
            customExoPlayerView.releasePlayer();
        }
        if (customExoPlayerView2 != null) {
            customExoPlayerView2.releasePlayer();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (customExoPlayerView != null) {
            customExoPlayerView.releasePlayer();
        }
        if (customExoPlayerView2 != null) {
            customExoPlayerView2.releasePlayer();
        }
    }
}