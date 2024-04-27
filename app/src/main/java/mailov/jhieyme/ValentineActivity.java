package mailov.jhieyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import mailov.jhieyme.databinding.ActivityMainBinding;
import mailov.jhieyme.databinding.ActivityValentineBinding;

public class ValentineActivity extends AppCompatActivity {

    private ActivityValentineBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityValentineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnReady.setOnClickListener(v -> {
            Intent intent = new Intent(this, TriviaActivity.class);
            startActivity(intent);
            finish();
        });
    }
}