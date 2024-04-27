package mailov.jhieyme;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.button.MaterialButton;

import mailov.jhieyme.databinding.ActivityTriviaBinding;
import mailov.jhieyme.fragments.Question01;
import mailov.jhieyme.fragments.Question02;
import mailov.jhieyme.fragments.Question03;
import mailov.jhieyme.fragments.Question04;
import mailov.jhieyme.fragments.Question05;
import mailov.jhieyme.fragments.Question06;
import mailov.jhieyme.fragments.Question07;
import mailov.jhieyme.fragments.Question08;
import mailov.jhieyme.fragments.Question09;
import mailov.jhieyme.fragments.Question10;
import mailov.jhieyme.viewmodel.ScoreViewModel;

public class TriviaActivity extends AppCompatActivity {


    private ActivityTriviaBinding binding;
    private FragmentManager fragmentManager;

    private Integer scoreCurrent = 0;

    private int fragmentActual = 2;
    private ImageButton btnSiguiente;

    private ScoreViewModel scoreViewModel;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTriviaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.txtScore.setText(String.valueOf(scoreCurrent) + " puntos");
        fragmentManager = getSupportFragmentManager();
        openFragment(new Question01());

        btnSiguiente = findViewById(R.id.btnContinuar);


        scoreViewModel = new ViewModelProvider(this).get(ScoreViewModel.class);


        scoreViewModel.getScoreCurrent().observe(this, scoreCurrent -> {

            TextView txtScore = findViewById(R.id.txtScore);
            txtScore.setText(String.valueOf(scoreCurrent) + " puntos!");


            if (scoreCurrent == 100) {
                showCardWIN();

            }

        });
        btnSiguiente.setOnClickListener(v -> {

            if (fragmentActual == 2) {
                openFragment(new Question02());
                fragmentActual = fragmentActual + 1;
            } else if (fragmentActual == 3) {
                openFragment(new Question03());
                fragmentActual = fragmentActual + 1;
            } else if (fragmentActual == 4) {
                openFragment(new Question04());
                fragmentActual = fragmentActual + 1;
            } else if (fragmentActual == 5) {
                openFragment(new Question05());
                fragmentActual = fragmentActual + 1;
            } else if (fragmentActual == 6) {
                openFragment(new Question06());
                fragmentActual = fragmentActual + 1;
            } else if (fragmentActual == 7) {
                openFragment(new Question07());
                fragmentActual = fragmentActual + 1;
            } else if (fragmentActual == 8) {
                openFragment(new Question08());
                fragmentActual = fragmentActual + 1;
            } else if (fragmentActual == 9) {
                openFragment(new Question09());
                fragmentActual = fragmentActual + 1;
            } else if (fragmentActual == 10) {
                openFragment(new Question10());
                fragmentActual = fragmentActual + 1;
            } else {
                System.out.println("jeje");
            }

        });

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song2);
        mediaPlayer.start();


    }


    private void openFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fcv_main, fragment);
        fragmentTransaction.commit();
    }

    private void showCardWIN() {
        AlertDialog.Builder builder = new AlertDialog.Builder(TriviaActivity.this);
        LayoutInflater inflater = LayoutInflater.from(TriviaActivity.this);
        View customDialogSuccess = inflater.inflate(R.layout.cardwin, null);
        builder.setView(customDialogSuccess);

        AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();


        MaterialButton btnContinue = customDialogSuccess.findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(v -> {

            Intent intent = new Intent(this, BeValentine.class);
            startActivity(intent);
            finish();


        });
    }


}