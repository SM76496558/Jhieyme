package mailov.jhieyme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import mailov.jhieyme.databinding.ActivityJhieymeBinding;

public class Jhieyme extends AppCompatActivity {

    private ActivityJhieymeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJhieymeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnSi.setOnClickListener(v -> {
            Intent intent = new Intent(this, ValentineActivity.class);
            startActivity(intent);
            finish();
        });

        binding.btnNo.setOnClickListener(v -> {


        });
    }
}