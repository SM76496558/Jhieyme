package mailov.jhieyme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import mailov.jhieyme.databinding.ActivitySongBinding;

public class SongActivity extends AppCompatActivity {
    private ActivitySongBinding binding;

    private ImageButton btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySongBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, Song2Activity.class);
            startActivity(intent);
            finish();
        });


    }
}