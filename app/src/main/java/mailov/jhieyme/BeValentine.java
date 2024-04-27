package mailov.jhieyme;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import mailov.jhieyme.databinding.ActivityBeValentineBinding;

public class BeValentine extends AppCompatActivity {

  private ActivityBeValentineBinding binding;

  private MaterialButton btnSiuu;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityBeValentineBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    btnSiuu = findViewById(R.id.btnSi);


    btnSiuu.setOnClickListener(v -> {
      Intent intent = new Intent(this, SongActivity.class);
      startActivity(intent);
      finish();
    });
  }
}