package mailov.jhieyme;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import mailov.jhieyme.databinding.ActivitySong2Binding;

public class Song2Activity extends AppCompatActivity {

    private ActivitySong2Binding binding;
    private MediaPlayer mediaPlayer;

    private ImageButton btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySong2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btnPlay = findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(v -> {
          
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
            mediaPlayer.start();

        });


    }
}